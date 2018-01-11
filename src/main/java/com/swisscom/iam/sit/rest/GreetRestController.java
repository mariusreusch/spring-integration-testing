package com.swisscom.iam.sit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRestController {

    @GetMapping("/sayHello")
    public String hello(){
        return "Hello";
    }
}
