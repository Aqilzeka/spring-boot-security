package com.example.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/index")
    public String index() {
        return "Index page";
    }

    @GetMapping("/dashboard")
    public String dashboard() {
        return "Successfully login to dashboard";
    }
}
