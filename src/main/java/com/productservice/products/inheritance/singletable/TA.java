package com.productservice.products.inheritance.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@DiscriminatorValue("3")
@Entity
public class TA extends User {

    private int noOfSession;
    private float avgRating;
}
