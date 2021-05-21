package com.mindex.challenge.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

public class CompensationExistsException extends ResponseStatusException {
    public CompensationExistsException(String errorMessage) {
    	super(HttpStatus.CONFLICT, errorMessage);
    }
}
