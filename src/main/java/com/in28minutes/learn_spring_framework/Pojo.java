package com.in28minutes.learn_spring_framework;

import java.io.Serializable;

// Plain old Java Object: any regular java object
public class Pojo {
	private String text;
	private int number;
	
	public String toString() {
		
		return text + " " + number;
	}
	
	
	//EJB: Enterprise Java Beans
	//
	public class JavaBean implements Serializable{
		
		//No Args Constructor
		public JavaBean() {
			
		}
		private String text;
		private int number;
		
		
		//getters and setters
		
		public String getText() {
			return text;
		}
		public void setText(String text) {
			this.text = text;
		}
		public int getNumber() {
			return number;
		}
		public void setNumber(int number) {
			this.number = number;
		}
		
		//Instance of this class becomes Java Bean
		
	}

}



