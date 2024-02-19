package controllers;

import entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repositories.ProductRepository;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @GetMapping()
    public String getAll(){
        return "Hello";
    }
}
