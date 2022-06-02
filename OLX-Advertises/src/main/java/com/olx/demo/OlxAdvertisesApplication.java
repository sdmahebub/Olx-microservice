package com.olx.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OlxAdvertisesApplication {

	public static void main(String[] args) {
		SpringApplication.run(OlxAdvertisesApplication.class, args);
	}

}
