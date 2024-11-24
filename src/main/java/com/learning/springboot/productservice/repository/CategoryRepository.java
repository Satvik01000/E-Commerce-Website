package com.learning.springboot.productservice.repository;

import com.learning.springboot.productservice.models.Category;
import com.learning.springboot.productservice.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;
@Repository
public interface CategoryRepository extends JpaRepository<Category, UUID> {
    List<Category> findAll();
    List<Product> findProductByTitle(String title);
}
