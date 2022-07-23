package com.babalola.dependencyinjection.controllers;

import com.babalola.dependencyinjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;


@Controller
public class ProfileBasedInjection {

    public final GreetingService greetingService;

    public ProfileBasedInjection(@Qualifier("ProfileService")GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String greeting() {
        return greetingService.displayGreeting();
    }
}
