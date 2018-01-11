package com.swisscom.iam.sit.rest;

import com.swisscom.iam.sit.service.GreetService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnotherRestController {

    private final GreetService greetService;

    public AnotherRestController(GreetService greetService) {
        this.greetService = greetService;
    }


    @GetMapping
    public String bla(){
        return "blu";
    }
}
