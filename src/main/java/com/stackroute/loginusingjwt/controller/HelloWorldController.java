package com.stackroute.loginusingjwt.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class HelloWorldController {
    @GetMapping({"/hello"})
    public String firstPage() {
        return "Hello World";
    }
}
