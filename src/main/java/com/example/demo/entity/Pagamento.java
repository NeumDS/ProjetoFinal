package com.example.demo.entity;

import java.time.LocalDateTime;
import java.math.BigDecimal;

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
@Table (name = "pagamento")
public class Pagamento {

    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal valor;

    private LocalDateTime dataPagamento;

    @Enumerated(EnumType.STRING)
    private FormaPagamento formaPagamento;  

    @Enumerated (EnumType.STRING)
    private StatusPagamento statusPagamento;

    @ManyToOne 
    @JoinColumn (name = "reserva_id")
    private Reserva reserva;
    
}
