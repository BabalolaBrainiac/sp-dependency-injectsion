package com.babalola.dependencyinjection.services;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//Using @Primary makes this service the defacto service for all injections implementing the greeting service
@Primary
@Service
public class PrimaryService implements GreetingService{

    @Override
    public String displayGreeting() {
        return "Primary Beans Service is up and running";
    }
}
