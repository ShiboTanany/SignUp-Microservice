package com.entryserver.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EntryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EntryServerApplication.class, args);
	}

}

