package com.babalola.dependencyinjection.services;

import com.babalola.repositories.EnglishRepository;

public class I18nEnglishService implements GreetingService {

    private final EnglishRepository englishRepository;

    public I18nEnglishService(EnglishRepository englishRepository) {
        this.englishRepository = englishRepository;
    }

    @Override
    public String displayGreeting() {
        return "English based service is up and running";
    }
}
