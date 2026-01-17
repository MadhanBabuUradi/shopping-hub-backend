package com.ecommerce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SimpleController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from E-commerce Backend!";
    }

    @GetMapping("/test")
    public String test() {
        return "Server is running!";
    }
}
