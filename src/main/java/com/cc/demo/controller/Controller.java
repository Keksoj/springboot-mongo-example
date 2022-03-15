package com.cc.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Controller {
    
    @RequestMapping("/")
    public String index() {
        return "Clever-Cloud demo für Florian und David. It is made of java with maven, spring-boot and mongodb.";
    }

}