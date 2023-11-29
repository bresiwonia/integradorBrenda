package TPI.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Table(name = "mesadeayuda")
public class MesaDeAyuda {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idMesaDeAyuda;


        @OneToOne
    @JoinColumn(name="idContrato")
    private Contrato contrato;
   @OneToOne
    @JoinColumn(name="idIncidentes")
   private Incidentes incidente;

}
