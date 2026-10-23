package com.shrutika.examples.rest.pagination;
import java.util.List;
import org.springframework.data.domain.*;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/search")
public class ProductSearchController {
    @GetMapping
    Page<String> search(Pageable pageable) {
        return new PageImpl<>(List.of("Laptop", "Monitor", "Keyboard"), pageable, 3);
    }
}
