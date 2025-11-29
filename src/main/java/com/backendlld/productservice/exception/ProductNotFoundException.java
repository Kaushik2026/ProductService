package com.backendlld.productservice.exception;

public class ProductNotFoundException extends Exception {
    public ProductNotFoundException() {
        super("Product Not Found");
    }
}
