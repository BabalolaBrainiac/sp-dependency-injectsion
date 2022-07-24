package com.babalola.repositories;

public class EnglishRepositoryImpl implements EnglishRepository {
    @Override
    public String getGreeting() {
         return "English based service is up and running";
    }
}
