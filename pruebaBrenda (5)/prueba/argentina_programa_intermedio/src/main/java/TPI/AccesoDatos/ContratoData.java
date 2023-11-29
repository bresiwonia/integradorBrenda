package TPI.AccesoDatos;

import TPI.Model.Cliente;
import TPI.Model.Contrato;
import TPI.Model.Especializacion;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;

public class ContratoData {

    private EntityManager getEntityManager(){

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA_PU");
        EntityManager manager = factory.createEntityManager();
        return manager;
    }
    private Scanner leer;
    EntityManager em = getEntityManager();
   Cliente cliente =new Cliente();
    Especializacion especializacion= new Especializacion();


    public ContratoData(){
        leer = new Scanner(System.in);
    }



    public void crearContrato(){

        em.getTransaction().begin();
        double cuotaMensual=0;
        EspecializacionData ed = new EspecializacionData();
        System.out.println("Escriba su especialidad");
       ed.getEspecializacion();
        String especialidad = leer.next();
ClienteData pd=new ClienteData();

        System.out.println("Seleccione una Persona");

        System.out.println(pd.getCliente());
        long persona = leer.nextInt();



       ;
        if(especialidad.equals("Tango")){
            cuotaMensual=1500;
        }else if(especialidad.equals("Sap")){
            cuotaMensual=2000;
        }else if(especialidad.equals("Linux")){
            cuotaMensual=2800;
        }else if(especialidad.equals("Ubuntu")){
            cuotaMensual=3200;
        }else if(especialidad.equals("Windows")){
            cuotaMensual=4000;

    }
        System.out.println("Usted a seleccionado la especialidad: "+especialidad+" y la cuota mensual de esta  especialidad es de: " + cuotaMensual );


        Cliente cliente = em.find(Cliente.class, persona);

        Contrato contrato= new Contrato();

        contrato.setCliente(cliente);
        contrato.setEspecializacion(especialidad);
        contrato.setCuotaMensual(cuotaMensual);
        em.persist(contrato);
        em.getTransaction().commit();
        em.close();


    }

}
