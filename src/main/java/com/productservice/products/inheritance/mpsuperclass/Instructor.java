package com.productservice.products.inheritance.mpsuperclass;

import jakarta.persistence.Entity;

@Entity(name = "mp_instructor")
public class Instructor extends User{

    private String specialization;
}
