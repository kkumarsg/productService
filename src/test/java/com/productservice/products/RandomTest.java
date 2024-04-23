package com.productservice.products;

import com.productservice.products.controllers.ProductController;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;


public class RandomTest {


    @Test
    public void onePlusOneIsTwo(){

        // Arrange
        int a = 1, b=1;

        // Act
        int x = a+b;

        // Assert
        Assertions.assertEquals(2, x);
//        Assertions.assertThrows(NullPointerException.class,
//                ()->SampleClass.doSomething());
//        Assertions.assertNull(x);
//        Assertions.assertNotNull(x);
        int[] expecetd = {};
        int[] actual = {};

        Assertions.assertArrayEquals(expecetd, actual);

        List<String> actualWords = Arrays.asList("word1", "word2");
        List<String> expectedWords = Arrays.asList("word1", "word2");

        Assertions.assertLinesMatch(expectedWords, actualWords);

        int[] elements = {1,2 ,3};
        Assertions.assertTimeout(
                Duration.ofSeconds(1),
                ()->sortArray(elements)
        );

    }

    @SneakyThrows
    public int[] sortArray(int[] ele){

//        Thread.sleep(2000);
        return ele;
    }
}
