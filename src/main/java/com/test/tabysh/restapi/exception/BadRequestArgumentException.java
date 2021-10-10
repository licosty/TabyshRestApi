package com.test.tabysh.restapi.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class BadRequestArgumentException extends RuntimeException{

    public BadRequestArgumentException(String message) {
        super(message);
    }
}
