package com.spring.boot.example.springbootbasicsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootBasicSampleApplication {

    // What are the beans?
    // What are the dependencies of a bean?
    // Where to search for beans? => No need

    public static void main(String[] args) {
        // Set Application Context
        ApplicationContext applicationContext = SpringApplication.run(SpringBootBasicSampleApplication.class, args);
        BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
        // Search for the result
        int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);
        // Print the result
        System.out.println(result);
    }

}

