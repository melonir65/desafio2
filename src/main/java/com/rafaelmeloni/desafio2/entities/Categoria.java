package com.rafaelmeloni.desafio2.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_categoria")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY);
    private Long id;
    private String descricao;

}
