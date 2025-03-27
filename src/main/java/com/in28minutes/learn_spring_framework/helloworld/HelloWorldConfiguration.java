package com.in28minutes.learn_spring_framework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.in28minutes.learn_spring_framework.Education;

//Eliminate the verbocity in creating Java Beans
//Public accessor Methods, Constructor
//Equals, Hashcode, and toString are automatically created
//Released in JDK 16
record Person(String name, int age, Address address) {}
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
	@Primary
	public Person person() {
		
		var person = new Person("Sandeep",30,this.address());
		
		return person;
	}
	
	
	//Autowiring using Method call
	@Bean
	public Person person2MethodCall(){
		return new Person(this.name(), this.age(), new Address("Velakani Drive","Bangalore")); //name, age, address
	}
	
	//Autowiring using Parameters
	@Bean
	public Person person3Parameters(String name, int age, Address postalAddress){
		return new Person(name, age, postalAddress); //name, age, postalAddress
	}
	
	
	@Bean
	public Person person4Qualifier(String name, int age, @Qualifier("addressQualifier") Address finalAddress){
		return new Person(name, age, finalAddress); //name, age, postalAddress
	}
	
	
	
	@Bean(name = "postalAddress")
	@Primary
	public Address address() {
		return new Address("1st Cross Siddarameshwar","Jamkhandi");
	}
	
	@Bean(name = "finalAddress")
	@Qualifier("addressQualifier")
	public Address address2() {
		return new Address("Electronic city","Bangalore");
	}
	
	@Bean
	public Education education() {
		return new Education("Engineering","CSE");
	}
	
	

}
