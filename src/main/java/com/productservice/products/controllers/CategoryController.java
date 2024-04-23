package com.productservice.products.controllers;

// break till 7:45


import com.productservice.products.models.Category;
import com.productservice.products.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class CategoryController {

    @Autowired
    CategoryRepository categoryRepository;

    @GetMapping("/category")
    public Optional<Category> getCategory(){

        return categoryRepository.findById(1L);
    }
}
