package com.jaimenavarro.snipcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/api/hello")
    public String devolverSaludo() {
        return "Hola desde SnipCloud!";
    }
}
