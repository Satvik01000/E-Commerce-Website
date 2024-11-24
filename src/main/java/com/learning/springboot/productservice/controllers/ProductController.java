package com.learning.springboot.productservice.controllers;

import com.learning.springboot.productservice.Exceptions.ProductNotFoundException;
import com.learning.springboot.productservice.models.Category;
import com.learning.springboot.productservice.models.Product;
import com.learning.springboot.productservice.services.CategoryService;
import com.learning.springboot.productservice.services.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService p;


    public ProductController(ProductService p) {
        this.p = p;
    }

    //Get all products
    @GetMapping
    List<Product> getAllProducts(){
        return p.getAllProducts();
    }

    //Get all product names
    @GetMapping("/names")
    List<String> getAllProductNames(){
        List<Product> temp = getAllProducts();
        List<String> names = new ArrayList<>();
        for(Product name : temp)
            names.add(name.getTitle());
        return names;
    }

    //Get a single product
    @GetMapping("/{id}")
    Optional<Product> getProduct(@PathVariable("id") UUID product_id) throws ProductNotFoundException {
        Optional<Product> product = p.getSingleProduct(product_id);

        if(product.isEmpty())
            throw new ProductNotFoundException("Look For another Product this does not exist");
        return product;
    }

    //Add a new product
    @PostMapping
    ResponseEntity<Product> addNewProduct(@RequestBody Product product){
        p.createProduct(product);
        return ResponseEntity.status(HttpStatus.CREATED).body(product);
    }

    @DeleteMapping("/{id}")
    void deleteProduct(@PathVariable UUID id){
        p.deleteProduct(id);
    }
}
