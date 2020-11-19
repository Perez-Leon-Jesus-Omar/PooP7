/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop7;

/**
 * Esta es la clase Gerente que se utilizo en la Practica 7
 * @author Jesus Omar, Yesenia Sarahi
 */
public class Gerente extends Empleado {
    private int presupuesto;

    /**
     * Se general al gerente
     */
    public Gerente() {
    }

    /**
     * Este constuctor recibe 1 parametro
     * @param presupuesto presupuesto es de tipo entero
     */
    public Gerente(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    /**
     * Este constuctor recibe 4 parametros
     * @param presupuesto presupuesto es de tipo entero
     * @param nombre nombre del gerente, del tipo string
     * @param numEmpleado numero de empleado, de tipo entero
     * @param sueldo sueldo del empleado, de tipo entero
     */
    public Gerente(int presupuesto, String nombre, int numEmpleado, int sueldo) {
        super(nombre, numEmpleado, sueldo);
        this.presupuesto = presupuesto;
    }
    
    /**
     * 
     * @param presupuesto Es el presupuesto con el que cuenta el gerente
     */
    public void setPresupuesto(int presupuesto){
        this.presupuesto = presupuesto;
    }
    
    /**
     * 
     * @return presupuesto es de tipo entero
     */
    public int getPresupuesto(){
        return this.presupuesto;
    }
    
    /**
     * Este constuctor recibe 2 parametros
     * @param anio anio, de tipo entero
     * @param tasa tasa, de tipo flotante
     */
    public void setPresupuesto(int anio, float tasa){
        this.presupuesto = (int)(presupuesto / tasa * anio);
    }
    
    /**
     * 
     * @return Aqui se imprimen los datos de la clase Gerente y sus extensiones
     */
    @Override
    public String toString() {
        return super.toString() +" Gerente{ " + "presupuesto = " + presupuesto + '}';
    }
    
}
