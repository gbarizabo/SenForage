package sn.isi.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompteurEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_compteur;
    private String releve;
    @Column(nullable = false, length = 100)
    private int numero;
    @Column(nullable = false, length = 100)
    private int totalconso;
    @Column(nullable = false, length = 100)
    private int etat_compteur;
    @ManyToOne
    private ClientEntity client;
}
