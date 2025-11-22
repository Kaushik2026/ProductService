package com.backendlld.productservice.controllers;

import com.backendlld.productservice.models.Product;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @GetMapping("/{id}")
    public Product getSingleProduct(@PathVariable("id") Long productId) {
        return new Product();
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return new ArrayList<Product>();
    }

    @PostMapping
    public Product createProduct(Product product) {
        return new Product();
    }

    @DeleteMapping("/{id}")
    public void DeleteProduct(@PathVariable("id") Long productId) {

    }

    @PatchMapping("/id")//for partial update
    public void UpdateProduct(@PathVariable("id") Product product, @RequestBody Long productId) {

    }

    @PutMapping("/id")//for entire replacement
    public void replaceProduct(@PathVariable("id") Long productId,@RequestBody Product product) {

    }
}
