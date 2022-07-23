package com.babalola.greetingconfig;

import com.babalola.dependencyinjection.services.ConstructorBasedService;
import com.babalola.dependencyinjection.services.PropertyBasedService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingServiceConfig {

    @Bean
    ConstructorBasedService constructorBasedService() {
        return new ConstructorBasedService();
    }

    @Bean
    PropertyBasedService propertyBasedService() {
        return new PropertyBasedService();
    }


}
