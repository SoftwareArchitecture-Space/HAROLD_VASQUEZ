package com.example.demo_circuit_breaker.infrastructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class BeanConfiguration {
    @Bean
    public RestTemplate ResTemplate(){
        return new RestTemplate();
    }
}
