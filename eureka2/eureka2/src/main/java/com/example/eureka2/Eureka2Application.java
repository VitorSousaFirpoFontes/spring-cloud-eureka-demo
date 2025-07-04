package com.example.eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Eureka2Application {

	public static void main(String[] args) {
		SpringApplication.run(Eureka2Application.class, args); // <-- Correto agora
	}
}
