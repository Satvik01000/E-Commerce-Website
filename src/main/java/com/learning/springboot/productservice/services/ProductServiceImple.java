package com.learning.springboot.productservice.services;

import com.learning.springboot.productservice.Exceptions.ProductNotFoundException;
import com.learning.springboot.productservice.models.Category;
import com.learning.springboot.productservice.models.Product;
import com.learning.springboot.productservice.repository.CategoryRepository;
import com.learning.springboot.productservice.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProductServiceImple implements ProductService{

    private final ProductRepository p;

    public ProductServiceImple(ProductRepository p) {
        this.p = p;
    }

    // Get a single Product
    @Override
    public Optional<Product> getSingleProduct(UUID productID) throws ProductNotFoundException {
        return p.findById(productID);
    }

    // Get all products
    @Override
    public List<Product> getAllProducts() {
        return p.findAll();
    }

    // Add a product
    @Override
    public void createProduct(Product P) {
        p.save(P);
    }

    @Override
    public void deleteProduct(UUID productID) {
        p.deleteById(productID);
    }

}
