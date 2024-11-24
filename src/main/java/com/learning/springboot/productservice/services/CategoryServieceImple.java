package com.learning.springboot.productservice.services;

import com.learning.springboot.productservice.models.Category;
import com.learning.springboot.productservice.models.Product;
import com.learning.springboot.productservice.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServieceImple implements CategoryService{
    private final CategoryRepository c;

    public CategoryServieceImple(CategoryRepository c) {
        this.c = c;
    }

    // Get all products in a specific category
    @Override
    public List<Product> getProductsInSpecificCategory(String category) {
        return c.findProductByTitle(category);
    }

    // Get all categories
    @Override
    public List<Category> getAllCategories(){
        return c.findAll();
    }

}
