package br.com.dogla.agrotis.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@EqualsAndHashCode
@Entity
@Table(name = "laboratory" )
public class Laboratory {
    @Id
    @SequenceGenerator(name = "laboratory_sequence", sequenceName = "laboratory_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "laboratory_sequence")
    @Column(name = "id" ,nullable = false)
    private Long id;

    @Column(name = "name",nullable = false)
    private String nome;

//    @ManyToOne
//    @JoinColumn(name = "solicitation_id")
//    private Solicitation solicitation;
}
