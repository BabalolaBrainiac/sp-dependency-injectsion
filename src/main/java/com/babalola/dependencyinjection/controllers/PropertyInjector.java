package com.babalola.dependencyinjection.controllers;

import com.babalola.dependencyinjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjector {


    @Qualifier("propertyBasedService")
    @Autowired
    GreetingService greetingService;

    public String getGreeting() {
        return greetingService.displayGreeting();
    }
}
