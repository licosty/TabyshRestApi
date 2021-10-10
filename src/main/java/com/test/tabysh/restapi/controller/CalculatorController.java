package com.test.tabysh.restapi.controller;

import com.test.tabysh.restapi.exception.BadRequestArgumentException;
import com.test.tabysh.restapi.model.ResponseModel;
import com.test.tabysh.restapi.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class CalculatorController {
    private CalculatorService service;

    @GetMapping
    public ResponseModel calculateSumAndMultiply(
            @RequestParam Optional<String> a, @RequestParam Optional<String> b, @RequestParam Optional<String> c) {

        return service.calculateSumAndMultiply(
                a.orElseThrow(() -> new BadRequestArgumentException("параметр a не задан")),
                b.orElseThrow(() -> new BadRequestArgumentException("параметр b не задан")),
                c.orElseThrow(() -> new BadRequestArgumentException("параметр c не задан"))
        );
    }

    @Autowired
    public void setService(CalculatorService service) {
        this.service = service;
    }
}
