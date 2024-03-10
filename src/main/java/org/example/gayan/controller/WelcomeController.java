package org.example.gayan.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class WelcomeController {

    @GetMapping("/welcome")
    public ResponseEntity<Object> welcome() {

        return ResponseEntity.ok("Welcome to the Kubernetes Sample By Gayan");
    }
}
