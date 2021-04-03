package com.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaProjectAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaProjectAppApplication.class, args);
		System.out.println("Application Started.");
	}
}