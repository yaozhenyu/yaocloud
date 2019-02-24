package com.yaozhenyu.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProviderApplication {
	public static void main(String[] args) {
		System.out.println("--------------- Service provider is starting! -----------------");
		SpringApplication.run(ProviderApplication.class, args);
		System.out.println("--------------- Service provider has been started on port 9000! -----------------");
	}
}
