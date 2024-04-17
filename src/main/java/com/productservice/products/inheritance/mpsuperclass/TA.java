package com.productservice.products.inheritance.mpsuperclass;

import jakarta.persistence.Entity;

@Entity(name = "mp_ta")
public class TA extends User{

    private int noOfSession;
    private float avgRating;
}
