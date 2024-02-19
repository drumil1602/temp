package com.example.demo34;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Demo34Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo34Application.class, args);
	}

}
