package com.example.container.service;

import com.example.container.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    private final List<Product> products = Arrays.asList(
            new Product(1L, "Laptop", 75000.0),
            new Product(2L, "Mobile", 35000.0),
            new Product(3L, "Headphones", 5000.0)
    );

    public List<Product> getAllProducts() {
        return products;
    }

    public Product getProductById(Long id) {
        return products.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}