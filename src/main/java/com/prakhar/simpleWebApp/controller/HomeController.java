package com.prakhar.simpleWebApp.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet() {
        return "Welcome!!";
    }

    @RequestMapping("/about")
    public String about() {
        return "Welcome to about!!";
    }
}
