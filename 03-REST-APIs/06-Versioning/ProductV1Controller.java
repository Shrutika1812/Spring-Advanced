package com.shrutika.examples.rest.versioning;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/v1/products")
public class ProductV1Controller {
    @GetMapping("/{id}")
    String get(@PathVariable Long id) { return "Product v1: " + id; }
}
