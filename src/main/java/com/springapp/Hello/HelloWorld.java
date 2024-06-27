package com.springapp.Hello;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("This is my First Spring Boot Application with GitHub....");
	}
	
	
}
