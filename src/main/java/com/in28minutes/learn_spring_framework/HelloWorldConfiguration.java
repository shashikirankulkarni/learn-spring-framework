package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {
	
	//Here we can define the Beans
	//These are managed by Spring
	
	@Bean
	public String name() {
		
		return "Shashi";
	}

}
