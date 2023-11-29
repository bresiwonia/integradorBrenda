package TPI.AccesoDatos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;

public class IncidentesData {

    private EntityManager getEntityManager(){

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA_PU");
        EntityManager manager = factory.createEntityManager();
        return manager;
    }
    private Scanner leer;
    EntityManager em = getEntityManager();
    public IncidentesData(){
        leer = new Scanner(System.in);
    }
    public void  CreaTipoDeProblema(){



    }
}
