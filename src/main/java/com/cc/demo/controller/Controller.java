package com.cc.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Controller {
    
    @RequestMapping("/")
    public String index() {
        return "<body><h1>Clever Cloud is very happy to meet you, Léa et Alexis!</h1><p>Diese Anwendung wurde mit Springboot erstellt, mit Maven gebuildet, und verbindet sich mit einem MongoDB.</p></body>";
    }

}