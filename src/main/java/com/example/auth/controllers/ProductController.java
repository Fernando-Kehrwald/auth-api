package com.example.auth.controllers;

import com.example.auth.domain.product.Product;
import com.example.auth.domain.product.ProductDTO;
import com.example.auth.repositories.ProductRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("product")
public class ProductController {
    @Autowired
    private ProductRepository repository;

    @GetMapping
    public ResponseEntity<?> getAllProduct(){
        var products = repository.findAll();
        return ResponseEntity.ok(products);
    }

    @PostMapping
    public ResponseEntity<?> registerProduct(@RequestBody @Valid ProductDTO body){
        Product newProduct = new Product(body);
        repository.save(newProduct);
        return ResponseEntity.ok().build();
    }
}
