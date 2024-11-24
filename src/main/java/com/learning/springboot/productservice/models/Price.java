package com.learning.springboot.productservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Price extends BaseModel{
    private String currency;
    private double cost;
}
