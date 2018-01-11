package com.swisscom.iam.sit;

import com.swisscom.iam.sit.domain.Greeting;
import com.swisscom.iam.sit.repository.GreetingRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleDataInitializr implements ApplicationRunner {

    private final GreetingRepository greetingRepository;

    public SampleDataInitializr(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public void run(ApplicationArguments args) {
        greetingRepository.save(new Greeting("Na du", "Lappen"));
    }
}
