package com.spring.security.controller;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    private ResponseEntity<String> getHello() {
        return new ResponseEntity<>("hello", HttpStatusCode.valueOf(200));
    }
}
