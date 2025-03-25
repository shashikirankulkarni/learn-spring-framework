package com.in28minutes.learn_spring_framework;

public class Education {
	
	private String degree;
    private String branch;
	
	public Education(String degree, String branch) {
		this.degree = degree;
		this.branch = branch;
	}
	
	@Override
    public String toString() {
        return "Education{degree='" + degree + "', branch='" + branch + "'}";
    }

}
