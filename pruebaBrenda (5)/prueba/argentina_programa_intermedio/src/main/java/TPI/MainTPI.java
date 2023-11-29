package TPI;

import TPI.AccesoDatos.*;
import TPI.AccesoDatos.ContratoData;

import TPI.AccesoDatos.EspecializacionData;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;

public class MainTPI {

    public static EntityManager getEntityManager(){
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory(
                                "JPA_PU");
        EntityManager manager = factory.createEntityManager();
        return manager;
    }

    public static void main(String[] args) {
        EntityManager em = getEntityManager();

        ClienteData cd = new ClienteData();


        Scanner leer = new Scanner(System.in);
        ContratoData cont= new ContratoData();

       TenicoData tecnico=new TenicoData();
        EspecializacionData ed = new EspecializacionData();


//tecnico.registrarTecnico();
      //  ed.crearEspecializacion();
     cont.crearContrato();

     //   cd.registrarCliente();


/*
        int opcion;
        long nroCliente;
        do {
            System.out.println("Menú Principal");
            System.out.println("1. Registrar Cliente");
            System.out.println("2. Registrar Técnico");
            System.out.println("3. Mostrar Clientes");
            System.out.println("4. Mostrar Técnicos");
            System.out.println("5. Registrar Especialidad");
            System.out.println("6. Registrar Incidente");
            System.out.println("0. Salir");
            System.out.print("Ingrese su opción: ");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    cd.agregarCliente(scanner);
                    break;
                case 2:
                    cd.agregarTecnico(scanner);
                    break;
                case 3:
                    cd.mostrarClientes();
                    break;
                case 4:
                   // mostrarTecnicos();
                    break;
                case 5:
                    cd.agregarEspecialidad();
                    break;
                case 6:
                    cd.mostrarClientes();
                    System.out.println("Ingrese el numero del cliente");
                    nroCliente = scanner.nextLong();
                    cd.agregarIncidente(
                            cd.buscarClienteId(nroCliente)
                    );
                    break;
                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 0);



*/
}
}