package com.crud.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.project.repository.ProductoRepository;

@RestController
@RequestMapping("/hello")
public class HelloController {
    
    @Autowired
    public ProductoRepository productoRepository;

    @GetMapping(value ="/world")
    public String getAllProductos(){
        return "Hello world";
    }

}

