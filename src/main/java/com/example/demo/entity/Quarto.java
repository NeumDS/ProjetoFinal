package com.example.demo.entity;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table (name = "quartos")
public class Quarto {

    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    
    private int numero;

    private int capacidade;

    private BigDecimal valor;

    @Enumerated(EnumType.STRING)
    private StatusQuarto status;

}