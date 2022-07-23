package com.babalola.dependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("ProfileService")
public class I18nEnglishService implements GreetingService {
    @Override
    public String displayGreeting() {
        return "English based service is up and running";
    }
}
