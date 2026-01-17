package com.ecommerce.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cart")
public class CartController {

    @GetMapping("/{userId}")
    public Map<String, Object> getCart(@PathVariable String userId) {
        Map<String, Object> cart = new HashMap<>();
        cart.put("userId", userId);
        cart.put("items", Arrays.asList(
                Map.of("productId", 1, "name", "Laptop", "price", 999.99, "quantity", 1),
                Map.of("productId", 2, "name", "Phone", "price", 699.99, "quantity", 2)
        ));
        cart.put("total", 2399.97);
        return cart;
    }

    @PostMapping("/add")
    public String addToCart(@RequestParam String userId,
            @RequestParam String productId) {
        return "Product " + productId + " added to cart for user " + userId;
    }
}
