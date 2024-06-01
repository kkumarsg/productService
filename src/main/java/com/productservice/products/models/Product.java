package com.productservice.products.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Product extends BaseModel{

    private String descr;
    private String image;
    private float price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private Category category;
}
