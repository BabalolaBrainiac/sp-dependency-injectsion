package com.babalola.greetingconfig;

import com.babalola.dependencyinjection.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Profile({"YO", "Default"})
    @Bean("ProfileService")
    I18nYorubaService i18nYorubaService() {
        return new I18nYorubaService();
    }

    @Profile("EN")
    @Bean
    I18nEnglishService ProfileService() {
        return new I18nEnglishService();
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
