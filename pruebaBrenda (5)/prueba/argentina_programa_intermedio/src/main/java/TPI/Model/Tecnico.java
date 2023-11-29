package TPI.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Table(name = "tecnico")
public class Tecnico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idTecnico;

    @OneToOne
    @JoinColumn(name="idEspecializacion")
    private Especializacion especialidad;

    private String contacto;
    private int tiempoEstimado;


}
