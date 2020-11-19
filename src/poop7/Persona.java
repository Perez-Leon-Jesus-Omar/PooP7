/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop7;

/**
 * Esta es la clase Alumno que se utilizo en la Practica 7
 * @author Jesus Omar, Yesenia Sarahi
 */
public class Persona {
   private String nombre;
   private int Edad;
   private String Genero;

   /**
    * Se genera la persona
    */
    public Persona() {
    }

    /**
     * Este constuctor recibe 3 parametros
     * @param nombre nombre de la persona, tipo string
     * @param Edad edad de la persona, tipo entero
     * @param Genero genero de la persona, tipo string
     */
    public Persona(String nombre, int Edad, String Genero) {
        this.nombre = nombre;
        this.Edad = Edad;
        this.Genero = Genero;
    }

    /**
     * 
     * @return nombre de la persona, tipo string
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * 
     * @param nombre Es el nombre de la persona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * 
     * @return edad de la persona, tipo entero
     */
    public int getEdad() {
        return Edad;
    }

    /**
     * 
     * @param Edad Es la edad de la persona
     */
    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getGenero() {
        return Genero;
    }

    /**
     * 
     * @param Genero genero de la persona, tipo string
     */
    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    /**
     * 
     * @return Aqui se imprimen los datos de la clase Persona
     */
    @Override
    public String toString() {
        return " nombre = " + nombre + ", Edad = " + Edad + ", Genero = " + Genero + '}';
    }
   
   
}
