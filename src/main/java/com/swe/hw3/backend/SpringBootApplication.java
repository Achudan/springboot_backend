package com.swe.hw3.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.swe.hw3.backend.repository")
@org.springframework.boot.autoconfigure.SpringBootApplication
public class SpringBootApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootApplication.class, args);

	}

}
