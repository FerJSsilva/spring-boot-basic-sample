package com.spring.boot.example.springbootbasicsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootBasicSampleApplication {

    public static void main(String[] args) {
        BinarySearchImpl binarySearch = new BinarySearchImpl();
        SpringApplication.run(SpringBootBasicSampleApplication.class, args);
    }

}

