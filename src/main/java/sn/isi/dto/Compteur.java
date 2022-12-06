package sn.isi.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Compteur {
    private int id_compteur;
    @NotNull(message = "Le releve ne doit pas etre null")
    private String releve;
    @NotNull(message = "Le numero ne doit pas etre null")
    private int numero;
    @NotNull(message = "La consommation ne doit pas etre null")
    private int totalconso;
    @NotNull(message = "L'etat ne doit pas etre null")
    private int etat_compteur;
}
