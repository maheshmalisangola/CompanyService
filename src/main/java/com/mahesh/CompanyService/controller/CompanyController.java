package com.mahesh.CompanyService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello Mahesh welcome to Intellij";
    }

    @GetMapping("/hellodev")
    public String sayHelloodev(){
        return "Hello Mahesh welcome to Intellij";
    }

    //comment added in main branch
}
