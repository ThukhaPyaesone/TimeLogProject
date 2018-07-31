package com.ace.web.timelog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TimeLogApplication {

	public static void main(String[] args) {
		SpringApplication.run(TimeLogApplication.class, args);
	}
	
	public String returnString() {
		return "Hello";
	}
}
