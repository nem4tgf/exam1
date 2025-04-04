package com.example.example1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/public")
    public String publicEndpoint() {
        return "Đây là endpoint công khai!";
    }

    @GetMapping("/user")
    public String userEndpoint() {
        return "Chào mừng USER!";
    }

    @GetMapping("/admin")
    public String adminEndpoint() {
        return "Chào mừng ADMIN!";
    }
}