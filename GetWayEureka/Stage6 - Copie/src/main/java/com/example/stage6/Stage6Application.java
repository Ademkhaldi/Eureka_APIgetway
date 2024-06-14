package com.example.stage6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Stage6Application {

    public static void main(String[] args) {
        SpringApplication.run(Stage6Application.class, args);
    }

}
