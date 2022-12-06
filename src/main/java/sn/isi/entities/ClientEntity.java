package sn.isi.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_client;
    @Column(nullable = false, length = 100)
    private String nom_client;
    @Column(nullable = false, length = 100)
    private String adresse;
    @Column(nullable = false, length = 100)
    private int numtel;
    @OneToMany
    private List<CompteurEntity> compteur;
    @ManyToOne
    private AbonnementEntity abonnement;
    @OneToMany
    private List<ClientEntity> facture;
    @ManyToOne
    private VillageEntity village;

}
