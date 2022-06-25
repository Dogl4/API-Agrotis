package br.com.dogla.agrotis.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import javax.persistence.*;

@Data
@EqualsAndHashCode
@Entity
@Table(name = "property")
public class Property {
    @Id
    @SequenceGenerator(name = "property_sequence", sequenceName = "property_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "property_sequence")
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String nome;

//    @ManyToOne
//    @JoinColumn(name = "solicitation_id")
//    private Solicitation solicitation;
}
