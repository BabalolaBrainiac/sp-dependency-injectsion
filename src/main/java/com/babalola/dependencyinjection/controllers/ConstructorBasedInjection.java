package com.babalola.dependencyinjection.controllers;

import com.babalola.dependencyinjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorBasedInjection {

   public final GreetingService greetingService;

    public ConstructorBasedInjection( @Qualifier("constructorBasedService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public  String greeting() {
        return greetingService.displayGreeting();
    }


}
