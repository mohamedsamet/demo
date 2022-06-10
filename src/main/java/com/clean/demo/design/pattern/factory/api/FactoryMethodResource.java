package com.clean.demo.design.pattern.factory.api;

import com.clean.demo.design.pattern.factory.VehiculeFactory;
import com.clean.demo.design.pattern.factory.creators.CarFactory;
import com.clean.demo.design.pattern.factory.creators.TruckFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("factory-method")
public class FactoryMethodResource {

    private static VehiculeFactory vehiculeFactory;

    @GetMapping()
    public ResponseEntity<String> getTest() {
        return ResponseEntity.ok("OK");
    }


    @GetMapping(value = "/run/{action}/{vehicule}")
    public ResponseEntity<String> runFactoryCreation(@PathVariable() String vehicule, @PathVariable() String action) {
        if (vehicule.equals("Car")) {
            vehiculeFactory = new CarFactory();
        } else if (vehicule.equals("Truck")) {
            vehiculeFactory = new TruckFactory();
        } else {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(vehiculeAction(action));
    }

    private String vehiculeAction(String action) {
        if (action.equals("goAhead")) {
            return vehiculeFactory.goAhead();
        } else if (action.equals("stop")) {
            return vehiculeFactory.stop();
        }
        return vehiculeFactory.getSpeed().toString();
    }
}
