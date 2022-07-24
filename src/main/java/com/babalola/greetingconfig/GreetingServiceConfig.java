package com.babalola.greetingconfig;

import com.babalola.dependencyinjection.services.*;
import com.babalola.pets.PetServiceFactory;
import com.babalola.pets.PetService;
import com.babalola.repositories.EnglishRepository;
import com.babalola.repositories.EnglishRepositoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Bean
    PetServiceFactory petServiceFactory() {
        return new PetServiceFactory();
    }

    @Profile({"dog", "default"})
    @Bean
    PetService dogService(PetServiceFactory petServiceFactory){
        return petServiceFactory.getPetService("dog");
    }

    @Profile("cat")
    @Bean
    PetService catService(PetServiceFactory petServiceFactory) {
        return petServiceFactory.getPetService("cat");
    }

    @Bean
    EnglishRepository englishRepository(){
        return new EnglishRepositoryImpl();
    }

    I18nYorubaService i18nYorubaService() {
        return new I18nYorubaService();
    }

    @Profile("EN")
    @Bean
    I18nEnglishService ProfileService(EnglishRepository englishRepository) {
        return new I18nEnglishService(englishRepository);
    }


    //Using @Primary makes this service the defacto service for all injections implementing the greeting service
    @Primary
    @Bean
    PrimaryService primaryService() {
        return new PrimaryService();
    }




    @Bean
    ConstructorBasedService constructorBasedService() {
        return new ConstructorBasedService();
    }

    @Bean
    PropertyBasedService propertyBasedService() {
        return new PropertyBasedService();
    }


}
