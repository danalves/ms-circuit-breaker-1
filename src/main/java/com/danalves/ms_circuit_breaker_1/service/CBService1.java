package com.danalves.ms_circuit_breaker_1.service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Service
public class CBService1 {

    private final RestTemplate restTemplate;

    public CBService1() {
        this.restTemplate = new RestTemplate();
    }

    @CircuitBreaker(name = "cbService1")
    public String listAnimals() {
        return restTemplate.getForObject("http://localhost:8082/list", String.class);
    }
//
//    public String fallback(Throwable throwable) {
//        return "Serviço temporariamente indisponível. Por favor, tente novamente mais tarde.";
//    }
}
