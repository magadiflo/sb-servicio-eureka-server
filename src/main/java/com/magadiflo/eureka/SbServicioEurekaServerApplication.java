package com.magadiflo.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer //Habilitamos Eureka Server
@SpringBootApplication
public class SbServicioEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbServicioEurekaServerApplication.class, args);
	}

}
