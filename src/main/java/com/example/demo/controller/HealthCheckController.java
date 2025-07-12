package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {


    public ResponseEntity<String> healthCheck() {

        return ResponseEntity.ok("Success");
    }
}
