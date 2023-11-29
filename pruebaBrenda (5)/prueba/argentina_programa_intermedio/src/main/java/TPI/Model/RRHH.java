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
@Table(name="rrhh")

public class RRHH {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRRHH;

    @OneToOne
    @JoinColumn (name= "idTecnico")
    private Tecnico tecnicos;

    @OneToMany
    @JoinColumn(name = "incidentes")
    List<Incidentes> incidentes;




}
