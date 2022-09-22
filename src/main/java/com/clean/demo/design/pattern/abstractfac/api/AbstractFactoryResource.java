package com.clean.demo.design.pattern.abstractfac.api;

import com.clean.demo.design.pattern.abstractfac.creator.LinuxFactory;
import com.clean.demo.design.pattern.abstractfac.creator.OSFactory;
import com.clean.demo.design.pattern.abstractfac.creator.WindowsFactory;
import com.clean.demo.design.pattern.abstractfac.service.EntityService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("abstract-factory")
public class AbstractFactoryResource {

    private final EntityService entityService;

    AbstractFactoryResource(EntityService entityService) {
        this.entityService = entityService;
    }

    @GetMapping()
    public ResponseEntity<String> getTest() {
        return ResponseEntity.ok("OK");
    }


    @GetMapping(value = "/run/{os}/{entity}")
    public ResponseEntity<String> runFactoryCreation(@PathVariable() String os, @PathVariable() String entity) {
        OSFactory osFactory;
        if (os.equals("linux")) {
            osFactory = new LinuxFactory();
        } else if (os.equals("win")) {
            osFactory = new WindowsFactory();
        } else {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(entityService.getEntity(entity, osFactory));
    }

}
