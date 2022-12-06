package sn.isi.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AbonnementEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_ab;
    @Column(nullable = false, length = 100)
    private int numero;
    @Column(nullable = false, length = 100)
    private String texte;
    @OneToOne
    private ClientEntity clients;
}
