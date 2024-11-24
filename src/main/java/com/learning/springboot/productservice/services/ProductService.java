package com.learning.springboot.productservice.services;

import com.learning.springboot.productservice.Exceptions.ProductNotFoundException;
import com.learning.springboot.productservice.models.Category;
import com.learning.springboot.productservice.models.Product;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProductService {
    Optional<Product> getSingleProduct(UUID productID) throws ProductNotFoundException;

    List<Product> getAllProducts();


    // Add a product
    void createProduct(Product P);

    void deleteProduct(UUID productID);
}
