package sn.isi.dto;

import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




@Data
@NoArgsConstructor
@AllArgsConstructor
public class Abonnement {
    private int id_ab;
    @NotNull(message = "Le numero ne doit pas etre null")
    private int numero;
    @NotNull(message = "Le texte ne doit pas etre vide")
    private String texte;
}
