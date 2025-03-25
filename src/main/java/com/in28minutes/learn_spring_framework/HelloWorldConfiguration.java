package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Eliminate the verbocity in creating Java Beans
//Public accessor Methods, Contructor
//Equals, Hashcode, and toString are automatically created
//Released in JDK 16
record Person(String name, int age) {}
record Address(String firstLine, String city) {}

@Configuration
public class HelloWorldConfiguration {
	
	//Here we can define the Beans
	//These are managed by Spring
	
	@Bean
	public String name() {
		
		return "Shashi";
	}
	
	@Bean
	public int age() {
		
		return 26;
	}
	
	@Bean
	public Person person() {
		
		var person = new Person("Sandeep",30);
		
		
		
		return person;
	}
	
	@Bean
	public Address address() {
		return new Address("1st Cross Siddarameshwar","Jamkhandi");
	}
	
	@Bean
	public Education education() {
		return new Education("Engineering","CSE");
	}
	
	

}
