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
    private int HP;
    private int CS;
    private int AC;
    private int DG;

    public Personajes() {
    }

    public Personajes(String personaje, String nombre, String raza, Double estatura, Double peso, int anios, String descripcion, String nacionalidad, int HP, int CS, int AC, int DG) {
        this.personaje = personaje;
        this.nombre = nombre;
        this.raza = raza;
        this.estatura = estatura;
        this.peso = peso;
        this.anios = anios;
        this.descripcion = descripcion;
        this.nacionalidad = nacionalidad;
        this.HP = HP;
        this.CS = CS;
        this.AC = AC;
        this.DG = DG;
    }

    public Personajes(int HP, int CS, int AC, int DG) {
        this.HP = HP;
        this.CS = CS;
        this.AC = AC;
        this.DG = DG;
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

    public int getHP() {
        return HP;
    }

    public int getCS() {
        return CS;
    }

    public int getAC() {
        return AC;
    }

    public int getDG() {
        return DG;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public void setCS(int CS) {
        this.CS = CS;
    }

    public void setAC(int AC) {
        this.AC = AC;
    }

    public void setDG(int DG) {
        this.DG = DG;
    }
    
    

    @Override
    public String toString() {

        return " " + " Personaje= " + personaje + "||  nombre = " + nombre + "||  Raza = " + raza + "||  Estatura = " + estatura + "||  peso = " + peso + "||  edad = " + anios + "||  Descripcion = " + descripcion + "||  Nacionalidad = " + nacionalidad + "|| Hit points = " + HP + "||  Cistric Strike = " + CS + "||  Armor Class= " + AC + "||  Damage = " + DG;
    }
    
     public String toStringg() {

        return " " +" Hit points = " + HP + "||  Cistric Strike = " + CS + "||  Armor Class= " + AC + "||  Damage = " + DG;
    }
     

}
