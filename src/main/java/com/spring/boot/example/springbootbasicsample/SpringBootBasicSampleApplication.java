package com.spring.boot.example.springbootbasicsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootBasicSampleApplication {

    public static void main(String[] args) {
        //Instance of new sort algorithm
        BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
        // Search for the result
        int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);
        // Print the result
        System.out.println(result);
        // Start application
        SpringApplication.run(SpringBootBasicSampleApplication.class, args);
    }

}

