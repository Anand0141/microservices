package com.example.microservice.exception;

import com.example.microservice.payload.APIResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<APIResponse> handleResourceNotFoundException(ResourceNotFoundException ex) {

//        String message = ex.getMessage();
        APIResponse response = APIResponse.builder().message(ex.getMessage()).success(true).status(HttpStatus.NOT_FOUND).build();
        return new ResponseEntity<APIResponse>(response, HttpStatus.NOT_FOUND);
    }
}
