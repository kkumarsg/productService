package com.productservice.products.inheritance.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@DiscriminatorValue("2")
@Entity
public class Mentor extends User {

    private String company;
    private float avgRating;
}
