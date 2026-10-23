package com.shrutika.examples.advanced.cache;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
@Service
public class ProductService {
    @Cacheable(cacheNames="products", key="#id")
    public String findById(Long id) { return "Database lookup for " + id; }
}
