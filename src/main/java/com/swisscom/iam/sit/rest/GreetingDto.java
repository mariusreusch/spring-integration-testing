package com.swisscom.iam.sit.rest;

import com.swisscom.iam.sit.common.OnlyForFramework;

public class GreetingDto {
    private String name;
    private String greeting;

    public GreetingDto(String name, String greeting) {
        this.name = name;
        this.greeting = greeting;
    }

    @OnlyForFramework
    private GreetingDto() {
    }

    public String getName() {
        return name;
    }

    public String getGreeting() {
        return greeting;
    }
}
