package TPI.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Table(name = "especializacion")
public class Especializacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEspecializacion;

    private String especialidad;
    public String toString() {
        return "ID-"+this.getIdEspecializacion()+" - "+this.getEspecialidad();
    }
}
