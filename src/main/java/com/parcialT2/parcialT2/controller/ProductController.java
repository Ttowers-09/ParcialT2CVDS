package com.parcialT2.parcialT2.controller;

import com.parcialT2.parcialT2.models.Product;
import com.parcialT2.parcialT2.service.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/api/v1/product")
public class ProductController {
    // Injecting the ProductServices class using Spring's @Autowired annotation.
    @Autowired
    private ProductServices productServices;

    @PostMapping("/save")
    public ResponseEntity save(@RequestBody Product product) {
        return ResponseEntity.ok().body(productServices.save(product));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable String id) {
        return ResponseEntity.ok(productServices.getProductById(id));
    }

}
