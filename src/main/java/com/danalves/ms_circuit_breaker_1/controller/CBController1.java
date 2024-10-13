package com.danalves.ms_circuit_breaker_1.controller;

import com.danalves.ms_circuit_breaker_1.service.CBService1;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
