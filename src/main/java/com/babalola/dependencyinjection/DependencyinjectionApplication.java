package com.babalola.dependencyinjection;

import com.babalola.dependencyinjection.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages = {"com.babalola.dependencyinjection", "com.babalola.pets"})
@SpringBootApplication
public class DependencyinjectionApplication {

	public static void main(String[] args) {

		ApplicationContext context =  SpringApplication.run(DependencyinjectionApplication.class, args);


		//Pet Controller
		PetController petController = context.getBean("petController", PetController.class);
		String getFavouritePet = petController.getBestPet();
		//Initial Controller
		myController controller = (myController) context.getBean("myController");
		String firstGreeting = controller.greeting();

		//Property Based Injector Controller
		PropertyInjector propertyInjector = (PropertyInjector) context.getBean("propertyInjector");
		String secondGreeting = propertyInjector.getGreeting();

		//Constructor Based Dependency Injection
		ConstructorBasedInjection constructorBasedInjection = (ConstructorBasedInjection) context.getBean("constructorBasedInjection");
		String thirdGreeting = constructorBasedInjection.greeting();

		//Profile Controller
		ProfileBasedInjection profileBasedInjection = (ProfileBasedInjection) context.getBean("profileBasedInjection") ;
		String returnProfile = profileBasedInjection.greeting();


		System.out.println( firstGreeting);
		System.out.println(secondGreeting);
		System.out.println(thirdGreeting);
		System.out.println(returnProfile);
		System.out.println(getFavouritePet);

	}



}
