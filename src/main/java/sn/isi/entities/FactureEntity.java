package sn.isi.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FactureEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_fac;
    @Column(nullable = false, length = 100)
    private String consommation;
    @Column(nullable = false, length = 100)
    private String prix;
    @Column(nullable = false, length = 100)
    private int etat_facture;
    @ManyToOne
    private ClientEntity client;
}
