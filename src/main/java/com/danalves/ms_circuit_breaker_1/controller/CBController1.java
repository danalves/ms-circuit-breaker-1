package com.danalves.ms_circuit_breaker_1.controller;

import com.danalves.ms_circuit_breaker_1.service.CBService1;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/animal")
@Slf4j
@RequiredArgsConstructor
public class CBController1 {

    private final CBService1 cbService1;

    @GetMapping("/list")
    public ResponseEntity<String> listAnimals() {
        String result = cbService1.listAnimals();
        return ResponseEntity.ok(result);
    }
}
