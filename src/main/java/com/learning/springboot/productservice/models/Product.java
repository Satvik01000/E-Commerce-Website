package com.learning.springboot.productservice.models;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Product extends BaseModel{


    private String title;

    private String description;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private Price price;

    private String imageUrl;

    @ManyToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "category")
    private Category category;
}
