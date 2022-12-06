package sn.isi.dto;

import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




@Data
@NoArgsConstructor
@AllArgsConstructor
public class Village {
    private int id_village;
    @NotNull(message = "Le nom ne doit pas etre null")
    private String nom_village;
    @NotNull(message = "Le chef est obligatoire ")
    private String chef_village;
}
