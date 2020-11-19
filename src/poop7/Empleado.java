/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop7;

/**
 * Esta es la clase Empleado que se utilizo en la Practica 7
 * @author Jesus Omar, Yesenia Sarahi
 */
public class Empleado {
    private String nombre;
    private int numEmpleado;
    private int sueldo;

    /**
     * Se genera el empleado
     */
    public Empleado() {
    }

    /**
     * Este constuctor recibe 3 parametros
     * @param nombre nombre del empleado, del tipo string
     * @param numEmpleado numero de empleado, de tipo entero
     * @param sueldo sueldo del empleado, de tipo entero
     */
    public Empleado(String nombre, int numEmpleado, int sueldo) {
        this.nombre = nombre;
        this.numEmpleado = numEmpleado;
        this.sueldo = sueldo;
    }
     
    /**
     * 
     * @param nombre Es el nombre del empleado
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    /**
     * 
     * @return nombre del empleado, del tipo string
     */
    public String getNombre(){
        return this.nombre;
    }
    
    /**
     * 
     * @param numEmpleado Es el numero del empleado
     */
    public void setNumEmpleado(int numEmpleado){
        this.numEmpleado = numEmpleado;
    }
    
    /**
     * 
     * @return numero de empleado, de tipo entero
     */
    public int getNumEmpleado (){
        return this.numEmpleado;
    }
    
    /**
     * 
     * @param sueldo Es el sueldo del empleado, el cual debe ser mayor a cero
     */
    public void setSueldo(int sueldo){
        if (sueldo >= 0)
            this.sueldo = sueldo;
    }
    
    /**
     * 
     * @return sueldo del empleado, de tipo entero
     */
    public int getSueldo (){
        return this.sueldo;
    }

    /**
     * 
     * @return Aqui se imprimen los datos de la clase Empleado
     */
    @Override
    public String toString() {
        return "Empleado{ " + "nombre = " + nombre + ", numEmpleado = " + numEmpleado + ", sueldo = " + sueldo + '}';
    }
    
    /**
     * Constructor de 2 parametros
     * @param porcentaje porcentaje, de tipo entero
     * @return retorna el sueldo, de tipo entero
     */
    public int aumentarSueldo (int porcentaje){
        sueldo += (int)(sueldo * porcentaje / 100);
        return sueldo;
    }
}

