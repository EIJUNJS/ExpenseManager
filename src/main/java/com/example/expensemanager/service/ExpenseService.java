package com.example.expensemanager.service;

import com.example.expensemanager.model.Expense;

import java.util.List;

public interface ExpenseService {
    List<Expense> findAll();
}
