package com.babalola.dependencyinjection.services;

public class PrimaryService implements GreetingService{

    @Override
    public String displayGreeting() {
        return "Primary Beans Service is up and running";
    }
}
