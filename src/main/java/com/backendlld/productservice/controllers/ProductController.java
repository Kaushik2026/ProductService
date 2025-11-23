package com.backendlld.productservice.controllers;

import com.backendlld.productservice.models.Product;
import com.backendlld.productservice.services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
@AllArgsConstructor
public class ProductController {
    private ProductService productService;
    @GetMapping("/{id}")
    public Product getSingleProduct(@PathVariable("id") Long productId) {
        return productService.getSingleProduct(productId);
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping
    public Product createProduct(Product product) {
        return new Product();
    }

    @DeleteMapping("/{id}")
    public void DeleteProduct(@PathVariable("id") Long productId) {

    }

    @PatchMapping("/{id}")//for partial update
    public void UpdateProduct(@PathVariable("id")  Long productId, @RequestBody Product product) {

    }

    @PutMapping("/id")//for entire replacement
    public void replaceProduct(@PathVariable("id") Long productId,@RequestBody Product product) {

    }
}
