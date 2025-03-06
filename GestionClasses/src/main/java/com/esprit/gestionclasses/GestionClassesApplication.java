package com.esprit.gestionclasses;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GestionClassesApplication {
    public static void main(String[] args) {
        System.setProperty("spring.config.name", "application-docker");
        SpringApplication.run(GestionClassesApplication.class, args);
    }
}
