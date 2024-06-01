package com.productservice.products.controllers;

import com.productservice.products.dtos.ProductResponseSelf;
import com.productservice.products.exceptions.ProductNotPresentException;
import com.productservice.products.models.Category;
import com.productservice.products.models.Product;
import com.productservice.products.service.IProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductControllerTest {

    @Autowired
    ProductController productController;

    @MockBean
    IProductService productService;

    @Test
    public void doSomething(){

        // Arrange

        Product p1 = new Product();
        p1.setName("Appo");
        Product p2 = new Product();
        p2.setName("Appo V1");
        Product p3 = new Product();
        p3.setName("Iphone");

        List<Product> allProducts = Arrays.asList(p1, p2, p3);

        Mockito
                .when(productService.getAllProducts())
                .thenReturn(allProducts);

        // Act

//        List<Product> actual = productController.getAllProducts();

        // Assert
//        Assertions.assertTrue(actual.size()==2);
    }

    @Test
    public void productNotPresentExceptionTest() throws ProductNotPresentException {

        // Arrange
        Mockito
                .when(productService.getSingleProduct(25L))
                .thenThrow(ProductNotPresentException.class);

        // Act
        ResponseEntity<ProductResponseSelf> actual =
                productController.getSingleProduct(25L);

        // Assert
       Assertions.assertEquals(HttpStatus.NOT_FOUND, actual.getStatusCode());

    }


}