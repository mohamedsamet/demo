package com.clean.demo.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("app")
public class AppRessource {

    @GetMapping()
    public ResponseEntity<String> getTest() {
        return ResponseEntity.ok("OK");
    }
}
