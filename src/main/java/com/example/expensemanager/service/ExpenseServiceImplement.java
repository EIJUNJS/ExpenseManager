package com.example.expensemanager.service;

import com.example.expensemanager.model.Expense;
import com.example.expensemanager.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseServiceImplement implements ExpenseService {

    @Autowired
    ExpenseRepository expenseRepository;

    @Override
    public List<Expense> findAll() {
        return expenseRepository.findAll();
    }
}
