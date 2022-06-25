package br.com.dogla.agrotis.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@EqualsAndHashCode
@Entity
@Table(name = "solicitation")
public class Solicitation {
        @Id
        @Column(name = "id", nullable = false)
        private Long id;

        @Column(name = "name", nullable = false)
        private String nome;

        @Column(name = "date_init", nullable = false)
        private String dataInicial;

        @Column(name = "date_end", nullable = false)
        private String dataFinal;

        @Column(name = "cnpj", nullable = false)
        private String cnpj;

        @Column(name = "observation", nullable = false)
        private String observacoes;

        @ManyToOne(cascade = CascadeType.REFRESH)
        @JoinColumn(name = "id_property", nullable = false, foreignKey = @ForeignKey(name = "fk_property_solicitation"), referencedColumnName = "id")
        private Property infoPropriedade;

        @ManyToOne(cascade = CascadeType.REFRESH)
        @JoinColumn(name = "id_laboratory", nullable = false, foreignKey = @ForeignKey(name = "fk_laboratory_solicitation"), referencedColumnName = "id")
        private Property laboratorio;
}
