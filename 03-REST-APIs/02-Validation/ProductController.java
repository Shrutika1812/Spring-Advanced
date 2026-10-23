package com.shrutika.examples.rest.validation;
import com.shrutika.examples.rest.dto.ProductRequest;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/products")
public class ProductController {
    @PostMapping
    ResponseEntity<ProductRequest> create(@Valid @RequestBody ProductRequest request) {
        return ResponseEntity.ok(request);
    }
}
