package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Kafka2Application {

	public static void main(String[] args) {
		SpringApplication.run(Kafka2Application.class, args);
		System.out.println("Kafka2 Application Started.");
	}

}
