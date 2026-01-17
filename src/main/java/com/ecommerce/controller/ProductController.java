package com.ecommerce.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private List<Map<String, Object>> products = new ArrayList<>();

    public ProductController() {
        // Initialize sample products
        products.add(createProduct(1L, "Laptop", "High performance laptop", 999.99, 50));
        products.add(createProduct(2L, "Smartphone", "Latest smartphone", 699.99, 100));
        products.add(createProduct(3L, "Headphones", "Noise cancelling", 199.99, 150));
    }

    @GetMapping
    public List<Map<String, Object>> getAllProducts() {
        return products;
    }

    @GetMapping("/{id}")
    public Map<String, Object> getProductById(@PathVariable Long id) {
        return products.stream()
                .filter(p -> id.equals(p.get("id")))
                .findFirst()
                .orElse(null);
    }

    @PostMapping
    public Map<String, Object> addProduct(@RequestBody Map<String, Object> product) {
        products.add(product);
        return product;
    }

    private Map<String, Object> createProduct(Long id, String name,
            String description,
            Double price, Integer stock) {
        Map<String, Object> product = new HashMap<>();
        product.put("id", id);
        product.put("name", name);
        product.put("description", description);
        product.put("price", price);
        product.put("stock", stock);
        return product;
    }
}
