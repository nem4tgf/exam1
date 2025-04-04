package com.example.example1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/public")
    public String publicEndpoint() {
        return "This is public enpoint!";
    }

    @GetMapping("/user")
    public String userEndpoint() {
        return "WELCOME USER!";
    }

    @GetMapping("/admin")
    public String adminEndpoint() {
        return "WELCOME ADMIN!";
    }
}