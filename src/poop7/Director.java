/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop7;

/**
 *Esta es la clase director que se utilizo en la Practica 7
 * @author Jesus Omar, Yesenia Sarahi
 */
public class Director extends Trabajador {
    private int presupuesto;

    /**
     * Se genera el director
     */
    public Director() {
    }

    /**
     * El constructor tiene 1 parámetro
     * @param presupuesto Presupuesto de director, tipo entero
     */
    public Director(int presupuesto) {
        this.presupuesto = presupuesto;
    }
    
    /**
     * El constructor tiene 3 parámetros
     * @param presupuesto presupuesto de director, tipo entero
     * @param numTrabajador numero de trabajador, tipo entero
     * @param sueldo sueldo del director, tipo entero
     */
    public Director(int presupuesto, int numTrabajador, int sueldo) {
        super(numTrabajador, sueldo);
        this.presupuesto = presupuesto;
    }

    /**
     * El constructor tiene 6 parámetros
     * @param presupuesto presupuesto de director, tipo entero
     * @param numTrabajador numero de trabajador, tipo entero
     * @param sueldo sueldo del director, tipo entero
     * @param nombre nombre del director, tipo string
     * @param Edad edad del director, tipo entero
     * @param Genero genero del director, tipo string
     */
    public Director(int presupuesto, int numTrabajador, int sueldo, String nombre, int Edad, String Genero) {
        super(numTrabajador, sueldo, nombre, Edad, Genero);
        this.presupuesto = presupuesto;
    }

    /**
     * 
     * @return presupuesto, de tipo entero
     */
    public int getPresupuesto() {
        return presupuesto;
    }

    /**
     * 
     * @param presupuesto el presupuesto con el que cuenta el director
     */
    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    /**
     * 
     * @return Aqui se imprimen los datos de la clase Director y extensiones
     */
    @Override
    public String toString() {
        return " Director {" + super.toString() + "presupuesto = " + presupuesto + '}';
    }
}

