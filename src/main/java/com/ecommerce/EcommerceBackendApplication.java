package com.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcommerceBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcommerceBackendApplication.class, args);
        System.out.println("✅ E-commerce Backend Started!");
        System.out.println("🌐 http://localhost:9091/api/hello");
    }
}
