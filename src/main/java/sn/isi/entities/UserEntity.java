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
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_user;
    @Column(nullable = false, length = 100)
    private String nom;
    @Column(nullable = false, length = 100)
    private String prenom;
    @Column(unique=true,nullable = false, length = 100)
    private String email;
    @Column(unique=true,nullable = false, length = 100)
    private String password;
    @Column(nullable = false, length = 100)
    private int etat;
    @ManyToMany
    private List<RoleEntity> role;

}
