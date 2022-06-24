package br.com.dogla.agrotis.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "laboratory" )
public class Laboratory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id" ,nullable = false)
    private Long id;

    @Column(name = "name",nullable = false)
    private String nome;
}
