package com.babalola.dependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


@Profile({"YO", "default"})
@Service("ProfileService")
public class I18nYorubaService implements GreetingService{
    @Override
    public String displayGreeting() {
        return "Yoruba based service is up and running";
    }
}
