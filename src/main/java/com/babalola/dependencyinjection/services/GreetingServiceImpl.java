package com.babalola.dependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String displayGreeting() {
        return "Initial dependency is up and running";
    }
}
