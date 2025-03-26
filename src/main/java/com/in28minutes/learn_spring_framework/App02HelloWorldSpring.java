package com.in28minutes.learn_spring_framework;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		
		//1. Launch a Spring Context
		
		 var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class); 
		
		//2. Configure the things that we want to Spring to manage @Configuration
		
		 //3. Retrive the beans managed by Spring
		 System.out.println(context.getBean("name"));
		 System.out.println(context.getBean("age"));
		 System.out.println(context.getBean("person"));
		 System.out.println(context.getBean(Person.class));
		 System.out.println(context.getBean("postalAddress"));
		 System.out.println(context.getBean("education"));
		 System.out.println(context.getBean(Address.class));
		 System.out.println(context.getBean(Education.class));
		 System.out.println(context.getBean("person2MethodCall"));
		 System.out.println(context.getBean("person3Parameters"));
		 System.out.println(context.getBean("person4Qualifier"));
		 
		 Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		 
		 
		 
		
		
		
		

	}

}
