package com.babalola.dependencyinjection.services;


import org.springframework.stereotype.Service;

@Service
public class PropertyBasedService implements GreetingService{

    @Override
    public String displayGreeting() {
        return "Property Based Service is up and running";
    }
}
