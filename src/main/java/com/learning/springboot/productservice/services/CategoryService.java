package com.learning.springboot.productservice.services;

import com.learning.springboot.productservice.models.Category;
import com.learning.springboot.productservice.models.Product;

import java.util.List;

public interface CategoryService {
    List<Product> getProductsInSpecificCategory(String category);
    List<Category> getAllCategories();
}
