package Libreria;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Libreria {

    @Id
    @GeneratedValue

    private Integer Id;
    @Basic
    private String titulo;
    private Integer anio;
    private String editorial;

}
