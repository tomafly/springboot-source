package com.example.springboottestown.controller;

import com.example.springboottestown.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private HelloService helloService;

    @GetMapping("/test")
    public String sayHello() {
        return helloService.hello();
    }
}
