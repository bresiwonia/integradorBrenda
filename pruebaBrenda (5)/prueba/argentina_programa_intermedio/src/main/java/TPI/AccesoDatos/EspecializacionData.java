package TPI.AccesoDatos;

import TPI.Model.Especializacion;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.*;

public class EspecializacionData {
    private EntityManagerFactory factory;
    private EntityManager em;
    private Scanner leer;
    Especializacion nuevaEspecialidad = new Especializacion();

    public EspecializacionData() {
        leer = new Scanner(System.in);
        factory = Persistence.createEntityManagerFactory("JPA_PU");
        em = factory.createEntityManager();
    }

    public void crearEspecializacion() {
        em.getTransaction().begin();

        List<Especializacion> listaEspecialidades = em.createQuery("SELECT t FROM Especializacion t", Especializacion.class).getResultList();
        System.out.println();
        if (listaEspecialidades.isEmpty()) {
            String[] especialidades = {"Windows", "Ubuntu", "Linux", "Sap", "Tango"};

            for (String especialidad : especialidades) {

                nuevaEspecialidad.setEspecialidad(especialidad);
                em.persist(nuevaEspecialidad);
            }

            em.getTransaction().commit();
        } else {
            em.getTransaction().rollback(); // No hay cambios, revertimos la transacción
        }
    }

    public void getEspecializacion(){
        List<Especializacion> listEsp = em.createQuery("SELECT t FROM Especializacion t", Especializacion.class).getResultList();

        for (Especializacion esplist: listEsp) {

            System.out.println("Id: "+esplist.getIdEspecializacion()+" Especialidad: "+esplist.getEspecialidad());

        }
    }

    public void cerrarConexion() {
        em.close();
        factory.close();
    }
}