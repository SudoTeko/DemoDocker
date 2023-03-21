package com.sudo248.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/")
    ResponseEntity<?> get() {
        return ResponseEntity.ok("Demo project");
    }

}
