package com.lcwd.hotel.exception;

import org.springframework.http.ResponseEntity;

public class ResourceNotFoundExcepiton extends RuntimeException{

    public ResourceNotFoundExcepiton() {
        super("hotel is not found in the server");
    }

    public ResourceNotFoundExcepiton(String s) {
        super(s);
    }
}
