/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author SENA
 */
public class JavaApplication11 {

    private static final ArrayList<Rum> lista = new ArrayList<>();
    private static final Scanner teclado = new Scanner(System.in);

    private static boolean ExisteAprendiz(String identificacion) {
        boolean exite = false;
        for (Rum apr : lista) {
            if (apr.getIdentificacion().equals(identificacion)) {
                exite = true;
                break;
            }
        }
        return exite;
    }

    private static void Agregar() {
        System.out.println("Ingrese identificacion del aprendiz");
        String identificacion = teclado.nextLine();
        boolean exite = ExisteAprendiz(identificacion);
        System.out.println("________________________________________");
        if (exite) {
            System.out.println("El aprendiz ya existe");
        } else {
            System.out.println("Ingrese Nombre del aprendiz");
            String nombre = teclado.nextLine();
            System.out.println("____________________________________");
            System.out.println("Ingrese el puntaje del aprendiz");
            int icfes = Integer.parseInt(teclado.nextLine());
            System.out.println("____________________________________");
            Rum apr = new Rum(identificacion, nombre, icfes);
            lista.add(apr);
            System.out.println("Aprendiz agregado correctamente");
            System.out.println("____________________________________");
        }
    }

    private static void consultaAprendizPorIdentificacion() {
        System.out.println("Ingrese identificacion aprendiz a consultar");
        String identificacion = teclado.nextLine();
        System.out.println("_________________________________________");
        boolean exite = false;
        for (Rum Rum : lista) {
            if (Rum.getIdentificacion().equals(identificacion)) {
                System.out.println("Nombre del aprendiz " + Rum.getNombre());
                System.out.println("Puntaje icfes " + Rum.getIcfes());
                exite = true;
                System.out.println("________________________________");
                break;
                
            }
        }
        if (!exite) {
            System.out.println("No existe aprendiz con la identificacion ");
            System.out.println("__________________________________________");
        }   
    }

    private static void ObtenerAprendizMayor() {
      int mayor=0, posicion=0;
 
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getIcfes()>= mayor)
              posicion=i;
        }
        System.out.println("La identificacion del puntaje mayor es " + lista.get(posicion).getIdentificacion() );
        System.out.println("El nombre del puntaje mayor es " + lista.get(posicion).getNombre());
        System.out.println("El puntaje mayor es " + lista.get(posicion).getIcfes());

        System.out.println("_________________________________");
    }

    private static void ActualizarAprendiz() {
         System.out.println("Ingrese identificacion aprendiz a modificar");
        String identificacion = teclado.nextLine();
        System.out.println("_________________________________________");
        boolean exite = false;
        for (Rum rum : lista) {
            if (rum.getIdentificacion().equals(identificacion)) {
                System.out.println("Nombre del aprendiz ");
                String nombre = teclado.nextLine();
                rum.setNombre(nombre);
                
                System.out.println("Puntaje icfes");
                int icfes = Integer.parseInt( teclado.nextLine());
                rum.setIcfes(icfes);
                System.out.println("________________________________");
                rum.setIcfes(icfes);
                exite= true;
                break;
            }
        }
    }

    private static void menu() {
        int option = 0;
        do {
            System.out.println("Menu Gestion De Aprendiz");
            System.out.println("1. Agregar");
            System.out.println("2. Consultar por identificacion");
            System.out.println("3. Consultar Aprendiz con el mayor puntaje");
            System.out.println("4. Actualizar aprendiz");
            System.out.println("5. Salir");
            System.out.println("Ingrese opcion: ");
            option = Integer.parseInt(teclado.nextLine());
            System.out.println("_______________________________");
            switch (option) {
                case 1:
                    Agregar();
                    break;
                case 2:
                    consultaAprendizPorIdentificacion();
                    break;
                case 3:
                    ObtenerAprendizMayor();
                    break;
                case 4:
                    ActualizarAprendiz();
                    break;
                case 5:
                    System.out.println("Saliendo");
            }

        } while (option != 5);

    }

    public static void main(String[] args) {
        // TODO code application logic here
        menu();
    }

}
