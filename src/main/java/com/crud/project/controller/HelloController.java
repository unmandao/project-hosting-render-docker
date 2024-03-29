package com.crud.project.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    
    @Value("${MI_ENV_VARIABLE}")
    private String miEnvVariable;

    @GetMapping(value ="/world")
    public String getAllProductos(){
        return "Hello world: " + miEnvVariable;
    }

}

