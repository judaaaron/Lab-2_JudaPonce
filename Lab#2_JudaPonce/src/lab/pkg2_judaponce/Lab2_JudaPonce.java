package lab.pkg2_judaponce;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab2_JudaPonce {

    static ArrayList<Personajes> personajes = new ArrayList();
    static Random R = new Random();
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        char resp = 's';
        while (resp == 's' || resp == 'S') {
            System.out.println("       Menu de juego");
            System.out.println(" 1. Creacion de jugadores  ");
            System.out.println(" 2. Modificar personajes ");
            System.out.println(" 3. Ver Atributos de un personje");
            System.out.println(" 4. Eliminar personajes");
            System.out.println(" 5. Combate");
            System.out.println(" 6. Salir");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("         Bienvenido, Por favor registre personajes en los siguientes campos");
                    System.out.println(" Escoja Personaje");
                    System.out.println(" clerigo");
                    System.out.println(" barbaro");
                    System.out.println(" mago ");
                    System.out.println(" picaro");
                    String personajjes = leer.next();
                    System.out.print(" Ingrese nombre: ");
                    String nombre = leer.next();
                    System.out.println(" Seleccione Raza: ");
                    System.out.println(" mediano");
                    System.out.println(" enano");
                    System.out.println(" elfo");
                    System.out.println(" humano");
                    String raza = leer.next();
                    System.out.print(" Ingrese estura: ");
                    double estatura = leer.nextDouble();
                    System.out.print(" Ingrese peso: ");
                    double peso = leer.nextDouble();
                    System.out.print(" Ingrese edad: ");
                    int edad = leer.nextInt();
                    System.out.print(" Ingrese descripcion: ");
                    String descripcion = leer.next();
                    System.out.print(" Ingrese nacionalidad: ");
                    System.out.println(" Norfair");
                    System.out.println(" Brinstar");
                    System.out.println(" Maridia");
                    System.out.println(" Zebes ");
                    System.out.println(" Crateria");
                    String nacionalidad = leer.next();
                    personajes.add(new Personajes(personajjes, nombre, raza, estatura, peso, edad, descripcion, nacionalidad));
                    System.out.println("       Listado de Personajes ");
                    String salida = "";

                    for (Object o : personajes) {
                        if (o instanceof Personajes) {
                            salida += " [" + personajes.indexOf(o) + "] " + o + "\n";

                        }

                    }
                    System.out.println(salida);

                    break;

                case 2:
                    if (personajes.isEmpty()) {
                        System.out.println(" No hay personajes registrados hasta el momento");
                        System.out.println();
                        break;
                    }

                    System.out.println("       Listado de Personajes ");
                    String salidas = "";

                    for (Object o : personajes) {
                        if (o instanceof Personajes) {
                            salidas += " [" + personajes.indexOf(o) + "] " + o + "\n";

                        }

                    }
                    System.out.println(salidas);
                    System.out.println("");
                    System.out.println(" Que desea modificar del personaje: ");
                    System.out.println(" 1. Tipo de personaje");
                    System.out.println(" 2. Nombre del personaje");
                    System.out.println(" 3. Raza del personaje");
                    System.out.println(" 5. Estatura del personaje");
                    System.out.println(" 6. Peso del personaje");
                    System.out.println(" 7. Edad del personaje");
                    System.out.println(" 8. Descripcion del personaje");
                    System.out.println(" 9. Nacionalidad del personaje");
                    int option = leer.nextInt();
                    switch (option) {
                        case 1:

                            System.out.println(" Opcion modificar: Tipo de personaje");
                            String newPersonaje;
                            System.out.print(" Ingrese posicion donde desea modificar: ");
                            int posicion = leer.nextInt();

                            if (personajes.get(posicion) instanceof Personajes) {
                                System.out.print(" Ingrese nuevo tipo de personaje: ");
                                newPersonaje = leer.next();
                                System.out.println();
                                ((Personajes) personajes.get(posicion)).setPersonaje(newPersonaje);
                                System.out.println(" Tipo de personaje ha sido modificado con exito");
                                System.out.println("");

                            } else {
                                System.out.println(" Error al modificar");
                            }
                            break;
                        default:
                            throw new AssertionError();
                    }
                    break;

                case 3:
                    System.out.println("       Listado de Personajes ");
                    String salidass = "";

                    for (Object o : personajes) {
                        if (o instanceof Personajes) {
                            salidass += " [" + personajes.indexOf(o) + "] " + o + "\n";

                        }

                    }
                    System.out.println(salidass);

                    break;
                default:
                    System.out.println(" Opcion Incorrecta");
                    System.out.println();
            }

        }

    }

}
