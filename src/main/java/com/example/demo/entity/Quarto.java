package com.example.demo.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity 
@Table (name = "quartos")
public class Quarto {

    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Integer numero;
    
    @ManyToOne 
    @JoinColumn (name = "tipo_quarto_id")
    private TipoQuarto tipoQuarto;

    @Enumerated(EnumType.STRING)
    private StatusQuarto status;

}