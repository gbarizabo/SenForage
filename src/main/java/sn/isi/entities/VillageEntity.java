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
public class VillageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_village;
    @Column(nullable = false, length = 100)
    private String nom_village;
    @Column(nullable = false, length = 100)
    private String chef_village;
    @OneToMany(mappedBy ="village")
    private List<ClientEntity> client;
}
