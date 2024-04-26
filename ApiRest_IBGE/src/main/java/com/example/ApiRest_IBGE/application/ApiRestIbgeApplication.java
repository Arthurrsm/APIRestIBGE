package com.example.ApiRest_IBGE.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example"})
public class ApiRestIbgeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiRestIbgeApplication.class, args);
	}

}
