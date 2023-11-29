package TPI.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Table(name = "incidentes")
public class Incidentes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idIncidente;
    private String tipoDeProblema;


    @OneToOne
    @JoinColumn(name = "idCliente")
    private Cliente cliente;

 @OneToOne
    @JoinColumn(name="idtecnico")
 private Tecnico tecnico;
    private String descripcion;











}
