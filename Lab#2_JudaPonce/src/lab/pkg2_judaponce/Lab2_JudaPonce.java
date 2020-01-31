package lab.pkg2_judaponce;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab2_JudaPonce {

    static ArrayList<Personajes> personajes = new ArrayList();
    static Random R = new Random();
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        personajes.add(new Personajes("Clerigo", "Juda", "humano", 1.79, 86.5, 20, "fortaleza", "Norfair"));
        personajes.add(new Personajes("Picaro", "Paulina", "enano", 1.65, 70.5, 18, "inteligencia", "Zebes"));
        personajes.add(new Personajes("Barbaro", "David", "elfo", 1.69, 78.2, 108, "audaz guerreo", "Brinstar"));
        personajes.add(new Personajes("Mago", "Sebastian", "mediano", 2.00, 155.5, 182, "Altura", "Maridia"));
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
                    String personajjes = "";
                    String raza = "";
                    String nacionalidad = "";
                    System.out.println("         Bienvenido, Por favor registre personajes en los siguientes campos");
                    System.out.println(" Escoja Personaje");
                    System.out.println(" 1. clerigo");
                    System.out.println(" 2. barbaro");
                    System.out.println(" 3. mago ");
                    System.out.println(" 4. picaro");
                    int op = leer.nextInt();
                    switch (op) {
                        case 1:
                            personajjes = "Clerigo";
                            break;

                        case 2:
                            personajjes = "Barbaro";
                            break;

                        case 3:
                            personajjes = "Mago";
                            break;

                        case 4:
                            personajjes = "Picaro";
                            break;
                        default:
                            System.out.println(" Opcion incorrecta");
                            System.out.println();
                    }

                    System.out.print(" Ingrese nombre: ");
                    String nombre = leer.next();
                    System.out.println(" Seleccione Raza: ");
                    System.out.println(" 1. Mediano");
                    System.out.println(" 2. Eano");
                    System.out.println(" 3. Efo");
                    System.out.println(" 4. Humano");
                    int opp = leer.nextInt();
                    switch (opp) {
                        case 1:
                            raza = " Mediano ";
                            break;

                        case 2:
                            raza = " Enano ";
                            break;

                        case 3:

                            raza = " Elfo ";
                            break;

                        case 4:
                            raza = " Humano ";
                            break;
                        default:
                            System.out.println(" Opcion incorrecta");
                            System.out.println();
                    }

                    System.out.print(" Ingrese estura: ");
                    double estatura = leer.nextDouble();
                    System.out.print(" Ingrese peso: ");
                    double peso = leer.nextDouble();
                    System.out.print(" Ingrese edad: ");
                    int edad = leer.nextInt();
                    System.out.print(" Ingrese descripcion: ");
                    String descripcion = leer.nextLine();
                    leer.nextLine();
                    System.out.println(" Ingrese nacionalidad: ");
                    System.out.println(" 1. Norfair");
                    System.out.println(" 2. Brinstar");
                    System.out.println(" 3. Maridia");
                    System.out.println(" 4. Zebes ");
                    System.out.println(" 5. Crateria");
                    int optionn = leer.nextInt();
                    switch (optionn) {
                        case 1:
                            nacionalidad = " Nosfair";
                            break;

                        case 2:
                            nacionalidad = " Brinstar";
                            break;

                        case 3:
                            nacionalidad = " Meridia";
                            break;
                        case 4:
                            nacionalidad = " Zebes";
                            break;

                        case 5:
                            nacionalidad = " Crateria";
                            break;
                        default:
                            System.out.println(" Opcion Incorrecta");
                            System.out.println();
                    }

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
                    System.out.println(" 4. Estatura del personaje");
                    System.out.println(" 5. Peso del personaje");
                    System.out.println(" 6. Edad del personaje");
                    System.out.println(" 7. Descripcion del personaje");
                    System.out.println(" 8. Nacionalidad del personaje");
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

                        case 2:
                            System.out.println(" Opcion modificar: Nombre de personaje");
                            String newNombre;
                            System.out.print(" Ingrese posicion donde desea modificar: ");
                            int posicio = leer.nextInt();

                            if (personajes.get(posicio) instanceof Personajes) {
                                System.out.print(" Ingrese nueva raza de personaje: ");
                                newNombre = leer.next();
                                System.out.println();
                                ((Personajes) personajes.get(posicio)).setNombre(newNombre);
                                System.out.println(" Nombre de personaje ha sido modificado con exito");
                                System.out.println("");

                            } else {
                                System.out.println(" Error al modificar");
                            }

                            break;

                        case 3:
                            System.out.println(" Opcion modificar: Raza de personaje");
                            String newRaza;
                            System.out.print(" Ingrese posicion donde desea modificar: ");
                            int posici = leer.nextInt();

                            if (personajes.get(posici) instanceof Personajes) {
                                System.out.print(" Ingrese nueva estatura de personaje: ");
                                newRaza = leer.next();
                                System.out.println();
                                ((Personajes) personajes.get(posici)).setRaza(newRaza);
                                System.out.println(" Raza de personaje ha sido modificado con exito");
                                System.out.println("");

                            } else {
                                System.out.println(" Error al modificar");
                            }

                            break;

                        case 4:
                            System.out.println(" Opcion modificar: Estatura de personaje");
                            Double newEstatura;
                            System.out.print(" Ingrese posicion donde desea modificar: ");
                            int posic = leer.nextInt();
                            if (personajes.get(posic) instanceof Personajes) {
                                System.out.print(" Ingrese nuevo tipo de personaje: ");
                                newEstatura = leer.nextDouble();
                                System.out.println();
                                ((Personajes) personajes.get(posic)).setEstatura(newEstatura);
                                System.out.println(" Estatura de personaje ha sido modificado con exito");
                                System.out.println("");

                            } else {
                                System.out.println(" Error al modificar");
                            }
                            break;

                        case 5:
                            System.out.println(" Opcion modificar: Estatura de personaje");
                            Double newPeso;
                            System.out.print(" Ingrese posicion donde desea modificar: ");
                            int posi = leer.nextInt();
                            if (personajes.get(posi) instanceof Personajes) {
                                System.out.print(" Ingrese nuevo peso de personaje: ");
                                newPeso = leer.nextDouble();
                                System.out.println();
                                ((Personajes) personajes.get(posi)).setPeso(newPeso);
                                System.out.println(" Peso de personaje ha sido modificado con exito");
                                System.out.println("");

                            } else {
                                System.out.println(" Error al modificar");
                            }

                            break;

                        case 6:
                            System.out.println(" Opcion modificar: Edad de personaje");
                            int newEdad;
                            System.out.print(" Ingrese posicion donde desea modificar: ");
                            int pos = leer.nextInt();
                            if (personajes.get(pos) instanceof Personajes) {
                                System.out.print(" Ingrese nueva edad de personaje: ");
                                newEdad = leer.nextInt();
                                System.out.println();
                                ((Personajes) personajes.get(pos)).setAnios(newEdad);
                                System.out.println(" Edad de personaje ha sido modificado con exito");
                                System.out.println("");

                            } else {
                                System.out.println(" Error al modificar");
                            }

                            break;

                        case 7:
                            System.out.println(" Opcion modificar: Descripcion de personaje");
                            String newDescripcion;
                            System.out.print(" Ingrese posicion donde desea modificar: ");
                            int position = leer.nextInt();
                            if (personajes.get(position) instanceof Personajes) {
                                System.out.print(" Ingrese nueva descripcion de personaje: ");
                                newDescripcion = leer.nextLine();
                                leer.nextLine();
                                System.out.println();
                                ((Personajes) personajes.get(position)).setDescripcion(newDescripcion);
                                System.out.println(" Descripcion de personaje ha sido modificado con exito");
                                System.out.println("");

                            } else {
                                System.out.println(" Error al modificar");
                            }

                            break;

                        case 8:
                            System.out.println(" Opcion modificar: Ncionalidad de personaje");
                            String newNacionalidad;
                            System.out.print(" Ingrese posicion donde desea modificar: ");
                            int positionn = leer.nextInt();
                            if (personajes.get(positionn) instanceof Personajes) {
                                System.out.print(" Ingrese nueva nacionalidad de personaje: ");
                                newNacionalidad = leer.next();
                                System.out.println();
                                ((Personajes) personajes.get(positionn)).setNacionalidad(newNacionalidad);
                                System.out.println(" Nacionalidad de personaje ha sido modificado con exito");
                                System.out.println("");

                            } else {
                                System.out.println(" Error al modificar");
                            }

                            break;
                        default:
                            System.out.println(" Opcion Incorrecta");
                    }
                    break;

                case 3:
                    if (personajes.isEmpty()) {
                        System.out.println(" No hay personajes registrados hasta el momento");
                        System.out.println();
                        break;
                    }
                    System.out.println("       Listado de Personajes ");
                    String salidass = "";

                    for (Object o : personajes) {
                        if (o instanceof Personajes) {
                            salidass += " [" + personajes.indexOf(o) + "] " + o + "\n";

                        }

                    }
                    System.out.println(salidass);

                    break;

                case 4:
                    if (personajes.isEmpty()) {
                        System.out.println(" No hay personajes registrados hasta el momento");
                        System.out.println();
                        break;
                    }
                    int posicion;
                    System.out.print(" Ingrese posicion para eliminar personaje: ");
                    posicion = leer.nextInt();
                    personajes.remove(posicion);
                    System.out.println(" Personaje eliminado con exito ");
                    System.out.println();

                    break;
                default:
                    System.out.println(" Opcion Incorrecta");
                    System.out.println();
            }

        }

    }

}
