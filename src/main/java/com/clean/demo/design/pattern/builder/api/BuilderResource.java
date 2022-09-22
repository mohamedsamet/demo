package com.clean.demo.design.pattern.builder.api;


import com.clean.demo.design.pattern.builder.car_builders.CarBuilder;
import com.clean.demo.design.pattern.builder.car_builders.ManualCarBuilder;
import com.clean.demo.design.pattern.builder.director.Director;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("builder")
public class BuilderResource {

    private final Director director;

    BuilderResource(Director director) {
        this.director = director;
    }

    @GetMapping()
    public ResponseEntity<String> getTest() {
        return ResponseEntity.ok("OK");
    }


    @GetMapping(value = "/car/sport")
    public ResponseEntity<String> buildSportCar() {
        var carBuilder = new CarBuilder();
        director.constructSportsCar(carBuilder);
        return ResponseEntity.ok(carBuilder.getResult().print());
    }


    @GetMapping(value = "/car/city")
    public ResponseEntity<String> buildCityCar() {
        var carBuilder = new CarBuilder();
        director.constructCityCar(carBuilder);
        return ResponseEntity.ok(carBuilder.getResult().print());

    }

    @GetMapping(value = "/manualcar/SUV")
    public ResponseEntity<String> buildManualSUVCar() {
        var manualCarBuilder = new ManualCarBuilder();
        director.constructSUV(manualCarBuilder);
        return ResponseEntity.ok(manualCarBuilder.getResult().print());

    }
}
