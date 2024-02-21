package com.example.t2207a_springboot.controller;

import com.example.t2207a_springboot.entity.Product;
import com.example.t2207a_springboot.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;
    @GetMapping()
    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }

    @PostMapping()
    public Product createProduct(@RequestBody Product product){
        return productRepository.save(product);
    }
}
