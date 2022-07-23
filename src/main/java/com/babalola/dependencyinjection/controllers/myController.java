package com.babalola.dependencyinjection.controllers;

import com.babalola.dependencyinjection.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class myController {

    public final GreetingService greetingService;

    public myController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String greeting() {
       return greetingService.displayGreeting();
    }
}
