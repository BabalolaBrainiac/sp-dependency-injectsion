package com.babalola.dependencyinjection.controllers;

import com.babalola.dependencyinjection.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectorTest {

    PropertyInjector controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjector();

        controller.greetingService = new GreetingServiceImpl();

    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}