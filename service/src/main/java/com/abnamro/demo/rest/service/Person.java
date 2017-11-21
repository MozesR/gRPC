package com.abnamro.demo.rest.service;

public class Person {
	    private final String name;
	    private final long age;

	    public  Person(String name, long age) {
	        this.name = name;
	        this.age = age;
			
	    }

	    public String getName() {
	        return name;
	    }

	    public long getAge() {
	        return age;
	    }
}
