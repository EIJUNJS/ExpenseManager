package com.example.expensemanager.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Entity
@Table(name = "tbl_expense")
@Setter
@Getter
@ToString
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "descrip")
    private String expense_name;

    private BigDecimal amount;

    private String note;

    private long created_at;
}
