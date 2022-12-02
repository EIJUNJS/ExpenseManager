package com.example.expensemanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.expensemanager")
public class ExpenseManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExpenseManagerApplication.class, args);
    }

}
