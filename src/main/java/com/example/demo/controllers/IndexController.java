package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class IndexController {
    @GetMapping("/")
    public String index() {
        return "Hello World";
    }

    @GetMapping("/tutorials")
    public String primero() {
        return "Primer API";
    }
}
