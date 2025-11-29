package com.backendlld.productservice.controlleradvices;

import com.backendlld.productservice.exception.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<String> productNotFound(){
        return new ResponseEntity<>(
                "Product not found with the given id,please try passing a valid id--",HttpStatus.BAD_GATEWAY
        );
    }
}
