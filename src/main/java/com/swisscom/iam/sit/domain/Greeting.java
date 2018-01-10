package com.swisscom.iam.sit.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Greeting {

    @Id
    @GeneratedValue
    private long id;
    private String greeting;
    private String name;

    public Greeting(String greeting, String name) {
        this.greeting = greeting;
        this.name = name;
    }


}
