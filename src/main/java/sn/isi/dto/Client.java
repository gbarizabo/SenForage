package sn.isi.dto;

import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




@Data
@NoArgsConstructor
@AllArgsConstructor
public class Client {
   private int id_client;
    @NotNull(message = "Le nom ne doit pas etre null")
    private String nom_client;
    @NotNull(message = "L'adresse ne doit pas etre null")
    private String adresse;
    @NotNull(message = "Le numero ne doit pas etre null")
    private int numtel;

}
