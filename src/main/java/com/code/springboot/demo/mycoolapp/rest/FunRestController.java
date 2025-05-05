package com.code.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${app.name}")
    private String Course;

    @Value("${learning.status}")
    private String status;

    @GetMapping("/")
    public String sayhello(){
        return "Hello World";
    }

    @GetMapping("/Mystatus")
    public String status(){
        return "learning "+ Course +" is "+status;
    }

}
