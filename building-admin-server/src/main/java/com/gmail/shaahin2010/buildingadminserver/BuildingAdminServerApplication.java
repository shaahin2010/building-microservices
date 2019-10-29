package com.gmail.shaahin2010.buildingadminserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@EnableAdminServer
@EnableEurekaClient
@SpringBootApplication
public class BuildingAdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuildingAdminServerApplication.class, args);
	}

}
