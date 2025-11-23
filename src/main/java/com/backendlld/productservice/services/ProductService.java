package com.backendlld.productservice.services;

import com.backendlld.productservice.models.Product;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

public interface ProductService {
    Product getSingleProduct(Long productId);

    List<Product> getAllProducts();

    Product createProduct(Product product);

    void DeleteProduct(Long productId);


    void UpdateProduct(Product product,Long productId);


    void replaceProduct(Long productId,Product product);
}
