/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop7;

/**
 * Esta es la clase trabajador que se utilizo en la Practica 7
 * @author Jesus Omar, Yesenia Sarahi
 */
public class Trabajador extends Persona {
    private int numTrabajador;
    private int sueldo;

    /**
     * Se genera el trabajador
     */
    public Trabajador() {
    }

    /**
     * Este constuctor recibe 2 parametros
     * @param numTrabajador numero de trabajador, tipo entero
     * @param sueldo sueldo del director, tipo entero
     */
    public Trabajador(int numTrabajador, int sueldo) {
        this.numTrabajador = numTrabajador;
        this.sueldo = sueldo;
    }

    /**
     * Este constuctor recibe 6 parametros
     * @param numTrabajador numero de trabajador, tipo entero
     * @param sueldo sueldo del director, tipo entero
     * @param nombre nombre del director, tipo string
     * @param Edad edad del director, tipo entero
     * @param Genero genero del director, tipo string
     */
    public Trabajador(int numTrabajador, int sueldo, String nombre, int Edad, String Genero) {
        super(nombre, Edad, Genero);
        this.numTrabajador = numTrabajador;
        this.sueldo = sueldo;
    }

    /**
     * 
     * @return numero de trabjador, de tipo entero
     */
    public int getNumTrabajador() {
        return numTrabajador;
    }

    /**
     * 
     * @param numTrabajador Es el numero del trabajador
     */
    public void setNumTrabajador(int numTrabajador) {
        this.numTrabajador = numTrabajador;
    }

    /**
     * 
     * @return sueldo, de tipo entero
     */
    public int getSueldo() {
        return sueldo;
    }

    /**
     * 
     * @param sueldo Es el sueldo que recibe el trabajador
     */
    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * 
     * @return Aqui se imprimen los datos de la clase Trabajador y sus extensiones
     */
    @Override
    public String toString() {
        return super.toString() + " numTrabajador = " + numTrabajador + ", sueldo = " + sueldo + '}';
    }
    
    
}
