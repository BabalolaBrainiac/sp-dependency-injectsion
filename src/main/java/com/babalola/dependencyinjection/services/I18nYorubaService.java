package com.babalola.dependencyinjection.services;

public class I18nYorubaService implements GreetingService{
    @Override
    public String displayGreeting() {
        return "Yoruba based service is up and running";
    }
}
