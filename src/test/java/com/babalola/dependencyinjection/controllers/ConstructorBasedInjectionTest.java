package com.babalola.dependencyinjection.controllers;

import com.babalola.dependencyinjection.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorBasedInjectionTest {

    ConstructorBasedInjection controller;

    @BeforeEach
    void setUp() {

        controller = new ConstructorBasedInjection(new GreetingServiceImpl());
    }

    @Test
    void greeting() {
        System.out.println(controller.greeting());
    }
}