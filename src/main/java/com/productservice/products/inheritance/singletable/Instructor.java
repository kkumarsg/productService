package com.productservice.products.inheritance.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@DiscriminatorValue("1")
@Entity
public class Instructor extends User {

    private String specialization;
}
