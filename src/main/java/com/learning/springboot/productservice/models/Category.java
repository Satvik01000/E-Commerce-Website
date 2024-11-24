package com.learning.springboot.productservice.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Category extends BaseModel{
    private String title;
    @OneToMany(mappedBy = "category")
    @JsonIgnore
    private List<Product> products;
}