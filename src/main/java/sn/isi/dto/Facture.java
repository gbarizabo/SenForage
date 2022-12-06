package sn.isi.dto;

import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




@Data
@NoArgsConstructor
@AllArgsConstructor
public class Facture {
     private int id_fac;
    @NotNull(message = "La consommation ne doit pas etre null")
    private String consommation;
    @NotNull(message = "Le prix ne doit pas etre null")
    private String prix;
    @NotNull(message = "L'etat ne doit pas etre null")
    private int etat_facture;
}
