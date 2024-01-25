package com.example.microservice.payload;

import lombok.*;
import org.springframework.http.HttpStatus;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class APIResponse {

    private String message;
    private boolean success;

    private HttpStatus status;
}
