package lab.pkg2_judaponce;

import java.util.ArrayList;

public class Personajes {

    private String personaje;
    private String nombre;
    private String raza;
    private Double estatura;
    private Double peso;
    private int anios;
    private String descripcion;
    private String nacionalidad;

    public Personajes() {
    }

    public Personajes(String personaje,String nombre, String raza, Double estatura, Double peso, int anios, String descripcion, String nacionalidad) {
        this.personaje=personaje;
        this.nombre = nombre;
        this.raza = raza;
        this.estatura = estatura;
        this.peso = peso;
        this.anios = anios;
        this.descripcion = descripcion;
        this.nacionalidad = nacionalidad;
    }

    public String getPersonaje() {
        return personaje;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public Double getEstatura() {
        return estatura;
    }

    public Double getPeso() {
        return peso;
    }

    public int getAnios() {
        return anios;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setEstatura(Double estatura) {
        this.estatura = estatura;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void setAnios(int anios) {
        this.anios = anios;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
     @Override
    public String toString() {

        return " " + " Personaje= " + personaje + "||   nombre = " + nombre + "||    Raza = " + raza + "||    Estatura = " + estatura + "||    peso = " + peso + "||    edad = " + anios + "||    Descripcion = " + descripcion + "||    Nacionalidad = " + nacionalidad;
    }

}
