package com.spring.security.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    private ResponseEntity<String> getHello(HttpServletRequest request) {
        return new ResponseEntity<>("Hello " + request.getSession().getId(),
                HttpStatusCode.valueOf(200));
    }

    @GetMapping("/about")
    private ResponseEntity<String> getAbout(HttpServletRequest request) {
        return new ResponseEntity<>("About Dharani " + request.getSession().getId(),
                HttpStatusCode.valueOf(200));
    }
}
