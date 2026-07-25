package com.soumyait.com.controller;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/welcome")
public class WelcomeController {

    @GetMapping
    public ResponseEntity<String> welcome() {
        return new ResponseEntity<>("Welcome to Spring Boot App", HttpStatus.OK);
    }

    @GetMapping("/user")
    public ResponseEntity<Map<String, Object>> getUser() {
        return new ResponseEntity<>(
                Map.of("name", "Substring technologies", "live", true),
                HttpStatus.OK
        );
    }
}