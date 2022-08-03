package com.springdemo.springproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringProjectController {

    @RequestMapping
    public String helloWorld(){
        return "Hello World from Spring Boot";
    }

    @RequestMapping("/goodbye")
    public String goodbye(){
        return "Goofbye from Spring Boot";
    }
}
