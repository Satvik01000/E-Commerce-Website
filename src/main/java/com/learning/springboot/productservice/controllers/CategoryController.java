package com.learning.springboot.productservice.controllers;

import com.learning.springboot.productservice.models.Category;
import com.learning.springboot.productservice.models.Product;
import com.learning.springboot.productservice.services.CategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    private final CategoryService c;

    public CategoryController(CategoryService c) {
        this.c = c;
    }

    //Get all categories
    @GetMapping()
    List<Category> getAllCategories(){
        return c.getAllCategories();
    }

    //Get all products in a category
    @GetMapping("/products/{title}")
    List<Product> getAllInCategory(@PathVariable String title){
        return c.getProductsInSpecificCategory(title);
    }
}
