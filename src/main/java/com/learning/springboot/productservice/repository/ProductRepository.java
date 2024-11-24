package com.learning.springboot.productservice.repository;

import com.learning.springboot.productservice.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;
@Repository
public interface ProductRepository extends JpaRepository<Product, UUID> {
//    @Query("select Product from Product where Product.title = :title")
//    Product findByTitleEquals(String Title);

    List<Product> findAllByCategory_Title(String title);
}
