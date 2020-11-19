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
public class Alumno extends Persona {
    private long NumCuenta;
    private float promedio;

    /**
     * Se genera el alumno
     */
    public Alumno() {
    }

    /**
     * Este constuctor recibe 5 parametros
     * @param NumCuenta numero de cuenta del alumno, tipo entero
     * @param promedio promedio del alumno, tipo flotante
     * @param nombre nombre del alumno, tipo string
     * @param Edad edad del alumno, tipo entero
     * @param Genero genero del alumno, tipo string
     */
    public Alumno(int NumCuenta, float promedio, String nombre, int Edad, String Genero) {
        super(nombre, Edad, Genero);
        this.NumCuenta = NumCuenta;
        this.promedio = promedio;
    }

    /**
     * 
     * @return numero de cuenta del alumno, tipo entero
     */
    public long getNumCuenta() {
        return NumCuenta;
    }

    /**
     * 
     * @param NumCuenta Es el numero de cuenta del alumno
     */
    public void setNumCuenta(int NumCuenta) {
        this.NumCuenta = NumCuenta;
    }

    /**
     * 
     * @return promedio del alumno, tipo flotante
     */
    public float getPromedio() {
        return promedio;
    }

    /**
     * 
     * @param promedio Es el promedio del alumno
     */
    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    /**
     * 
     * @return Aqui se imprimen los datos de la clase Alumno
     */
    @Override
    public String toString() {
        return " Alumno " + super.toString() + "NumCuenta = " + NumCuenta + ", promedio = " + promedio + '}';
    }
    
    
    
}

