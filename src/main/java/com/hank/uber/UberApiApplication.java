package com.hank.uber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UberApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(UberApiApplication.class, args);
    }

    public void Display(){
        System.out.println("this is rupesh's method");
    }

}
