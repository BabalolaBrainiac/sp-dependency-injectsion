package com.babalola.dependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorBasedService implements GreetingService{

    @Override
    public String displayGreeting() {
        return "Constructor Based Service is up and running";
    }

}
