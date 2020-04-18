package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String getMessage() {
        return "Rohini";
    }

    @GetMapping("/user")
    public String getUser() {
        return "Sathwik";
    }

    @GetMapping("/admin")
    public String getAdmin() {
        return "Neeha";
    }
}
