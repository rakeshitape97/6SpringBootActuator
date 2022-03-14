package com.wcs.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args)
	{
		System.out.println("Welcome To Spring Boot...");
		SpringApplication.run(Application.class, args);
	}

}
