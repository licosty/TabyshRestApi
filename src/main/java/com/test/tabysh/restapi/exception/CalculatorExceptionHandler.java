package com.test.tabysh.restapi.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CalculatorExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(BadRequestArgumentException.class)
    protected ResponseEntity<BadRequestArgumentExceptionModel> handleThereIsNoSuchUserException(BadRequestArgumentException ex) {
        return new ResponseEntity<>(new BadRequestArgumentExceptionModel(ex.getMessage()), HttpStatus.BAD_REQUEST);
    }

    @Data
    @AllArgsConstructor
    private static class BadRequestArgumentExceptionModel {
        private String error;
    }
}
