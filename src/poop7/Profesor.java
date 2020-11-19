/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop7;

/**
 * Esta es la clase profesor que se utilizo en la Practica 7
 * @author Jesus Omar, Yesenia Sarahi
 */
public class Profesor extends Trabajador{
    private int numClases;

    /**
     * Se genera el profesor
     */
    public Profesor() {
    }

    /**
     * Este constuctor recibe 1 parametro
     * @param numClases Numero de clases que tiene el profesor, de tipo entero
     */
    public Profesor(int numClases) {
        this.numClases = numClases;
    }

    /**
     * Este constuctor recibe 3 parametros
     * @param numClases Numero de clases que tiene el profesor, de tipo entero
     * @param numTrabajador numero de trabajador, tipo entero
     * @param sueldo sueldo del director, tipo entero
     */
    public Profesor(int numClases, int numTrabajador, int sueldo) {
        super(numTrabajador, sueldo);
        this.numClases = numClases;
    }

    /**
     * Este constuctor recibe 6 parametros
     * @param numClases Numero de clases que tiene el profesor, de tipo entero
     * @param numTrabajador numero de trabajador, tipo entero
     * @param sueldo sueldo del director, tipo entero
     * @param nombre nombre del director, tipo string
     * @param Edad edad del director, tipo entero
     * @param Genero genero del director, tipo string
     */
    public Profesor(int numClases, int numTrabajador, int sueldo, String nombre, int Edad, String Genero) {
        super(numTrabajador, sueldo, nombre, Edad, Genero);
        this.numClases = numClases;
    }

    /**
     * 
     * @return numeo de clases, tipo entero
     */
    public int getNumClases() {
        return numClases;
    }

    /**
     * 
     * @param numClases Es el numero de clases del profesor
     */
    public void setNumClases(int numClases) {
        this.numClases = numClases;
    }

    /**
     * 
     * @return Aqui se imprimen los datos de la clase Profesor y sus extensiones
     */
    @Override
    public String toString() {
        return " Profesor {" + super.toString()+ "numClases = " + numClases + '}';
    }
    
    
}
