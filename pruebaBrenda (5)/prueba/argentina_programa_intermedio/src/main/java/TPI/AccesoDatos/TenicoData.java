package TPI.AccesoDatos;

import TPI.Model.Especializacion;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;

public class TenicoData {
    private EntityManager getEntityManager(){

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA_PU");
        EntityManager manager = factory.createEntityManager();
        return manager;
    }
 Scanner leer= new Scanner(System.in);
    EntityManager em = getEntityManager();
    EspecializacionData ed = new EspecializacionData();

    public void registrarTecnico(){
        ed.getEspecializacion();

        System.out.println("Ingrese un correo");
        String correo = leer.next();
        System.out.println("Ingrese los dias necesarios para reparacion");
        int dias= leer.nextInt();

    }
}
