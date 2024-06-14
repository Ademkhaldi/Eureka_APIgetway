package com.example.apigetway2.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudConfig {

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("dashboardsModule", r -> r.path("/dashboards/**")
                        .uri("http://localhost:8099/"))
                .route("user2Module", r -> r.path("/user2/**")
                        .uri("http://localhost:8098/"))
                .build();
    }
}
