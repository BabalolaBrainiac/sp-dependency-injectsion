package com.babalola.dependencyinjection.services;

public class I18nEnglishService implements GreetingService {
    @Override
    public String displayGreeting() {
        return "English based service is up and running";
    }
}
