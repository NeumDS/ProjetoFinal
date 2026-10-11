package com.example.demo.entity;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity 
@Table (name = "reserva_servico")
public class ReservaServico {
    
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne 
    @JoinColumn (name = "reserva_id")
    private Reserva reserva;

    @ManyToOne 
    @JoinColumn (name = "servico_id")
    private Servico servico;

    private Integer quantidade;

    private BigDecimal valorUnitario;

}
