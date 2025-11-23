package com.backendlld.productservice.services;

import com.backendlld.productservice.dtos.FakeStoreProductDto;
import com.backendlld.productservice.models.Category;
import com.backendlld.productservice.models.Product;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {
    private RestTemplate restTemplate;
    @Override
    public Product getSingleProduct(Long productId) {
        FakeStoreProductDto fakeStoreProductDto = restTemplate.getForObject("https://fakestoreapi.com/products/" + productId, FakeStoreProductDto.class);

        return convertFakeStoreProductDtoToProduct(fakeStoreProductDto);

    }

    @Override
    public List<Product> getAllProducts() {
        FakeStoreProductDto[] fakeStoreProductDtoList = restTemplate.getForObject("https://fakestoreapi.com/products",
                FakeStoreProductDto[].class);
        List<Product> products = new ArrayList<>();
        for(FakeStoreProductDto fakeStoreProductDto : fakeStoreProductDtoList){
            products.add(convertFakeStoreProductDtoToProduct(fakeStoreProductDto));
        }
        return products;
    }

    @Override
    public Product createProduct(@RequestBody Product product) {
        return null;
    }

    @Override
    public void DeleteProduct(Long productId) {

    }

    @Override
    public void UpdateProduct(Product product, Long productId) {

    }

    @Override
    public void replaceProduct(Long productId, Product product) {

    }

    private Product convertFakeStoreProductDtoToProduct(FakeStoreProductDto fakeStoreProductDto){
        Product product = new Product();
        product.setCategory(new Category());
        product.setId(fakeStoreProductDto.getId());
        product.setImage(fakeStoreProductDto.getImage());
        product.setTitle(fakeStoreProductDto.getTitle());
        product.setDescription(fakeStoreProductDto.getDescription());
        product.setPrice(fakeStoreProductDto.getPrice());
        product.getCategory().setValue(fakeStoreProductDto.getCategory());

        return product;
    }
}
