package com.learning.springboot.productservice.repository;

public interface CustomQueries{
    String FIND_ALL_BY_TITLE = "select* from Product where title = :title";
}
