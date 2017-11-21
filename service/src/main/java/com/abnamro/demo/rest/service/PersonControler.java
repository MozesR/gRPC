package com.abnamro.demo.rest.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonControler {
	
	private static final String template = "Hello, %s!";
	
	 @RequestMapping("/getPerson")
	    public Person greeting(@RequestParam(value="name", defaultValue="unknown") String name) {
	        return new Person(String.format(template, name), 12);
	    }
}
