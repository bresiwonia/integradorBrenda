package TPI.AccesoDatos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import TPI.Model.*;

import java.util.List;
import java.util.Scanner;

public class ClienteData {

    private EntityManager getEntityManager(){

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA_PU");
        EntityManager manager = factory.createEntityManager();
        return manager;
    }
    private Scanner leer;
    EntityManager em = getEntityManager();
    public ClienteData(){
        leer = new Scanner(System.in);
    }
    public void registrarCliente(){
        System.out.print("Ingrese el cuit del cliente: ");
        int cuit = leer.nextInt();

        System.out.print("Ingrese la Razon Social: ");
        String razonSocial = leer.next();

        System.out.print("Ingrese el email del cliente: ");
        String email = leer.next();


        Cliente cliente = new Cliente();
        cliente.setCuit(cuit);
        cliente.setRazonSocial(razonSocial);
        cliente.setEmail(email);



        em.getTransaction().begin();
        em.persist(cliente);
        em.getTransaction().commit();
        em.close();

    }

    public List<Cliente> getCliente(){

        em.getTransaction().begin();

        List<Cliente> cliente = em.createQuery("SELECT t FROM Cliente t", Cliente.class).getResultList();
        em.getTransaction().commit();
        em.close();
        return cliente;
    }

}
