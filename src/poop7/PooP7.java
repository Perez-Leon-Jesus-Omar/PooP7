/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop7;

/**
 * Practica 7. Herencia
 * @author Jesus Omar, Yesenia Sarahi
 */
public class PooP7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("1*******************");///Empleado
        Empleado empleado = new Empleado();
        
        empleado.setNombre("Angel");
        empleado.setNumEmpleado(123);
        empleado.setSueldo(16000);
        System.out.println(empleado);
        
        empleado.aumentarSueldo(100);
        System.out.println(empleado);
        
        System.out.println("\n2*******************");///Gerente 1
        Gerente gerente1 = new Gerente ();
        gerente1.setNombre("Cesar");
        gerente1.setNumEmpleado(12);
        gerente1.setSueldo(25000);
        gerente1.setPresupuesto(100000);
        System.out.println("Nombre: " + gerente1.getNombre());
        System.out.println("Numero de empleado: " + gerente1.getNumEmpleado());
        System.out.println("Sueldo: " + gerente1.getSueldo());
        System.out.println("Presupuesto: " + gerente1.getPresupuesto());
        gerente1.setPresupuesto(500000);
        System.out.println("Presupuesto: " + gerente1.getPresupuesto());
        
        System.out.println("\n3*******************");///Gerente 2
        Gerente gerente2 = new Gerente (500000,"Julio",88,200000);
        System.out.println("Nombre: " + gerente2.getNombre());
        System.out.println("Numero de empleado: " + gerente2.getNumEmpleado());
        System.out.println("Sueldo: " + gerente2.getSueldo());
        System.out.println("Presupuesto: " + gerente2.getPresupuesto());
                
        System.out.println("\n4*******************");///Sobreescritura
        System.out.println(gerente2);
        
        System.out.println("\n5*******************");///Sobrecarga
        System.out.println("Presupuesto: " + gerente2.getPresupuesto());
        gerente2.setPresupuesto(100000);
        System.out.println("Presupuesto: " + gerente2.getPresupuesto());
        gerente2.setPresupuesto(5, 5.5f);
        System.out.println("Presupuesto: " + gerente2.getPresupuesto());
        
        
        System.out.println("\n6*******************");
        ///Realizar 2 herencias Persona hereda en alumno y empleado, de trabajador heredan profe y director
        ///Clase base Persona
        ///     Sub-clase Alumno
        ///     Sub-clase Trabajador
        ///             Sub-clase Director
        ///             Sub-clase Profesor
        
        
        //Persona
        Persona persona = new Persona();
        
        persona.setNombre("Luis");
        persona.setEdad(20);
        persona.setGenero("Hombre");
        System.out.println("Persona " +persona);
        
        //Alumno
        Alumno alumno = new Alumno();
        
        alumno.setNombre("Luisa");
        alumno.setEdad(19);
        alumno.setGenero("Mujer");
        alumno.setNumCuenta(312467895);
        alumno.setPromedio(8.7f);
        System.out.println(alumno);
        
        //Trabajador
        Trabajador traba = new Trabajador();
        
        traba.setNombre("Paco");
        traba.setEdad(40);
        traba.setGenero("Hombre");
        traba.setNumTrabajador(23456781);
        traba.setSueldo(1500);
        System.out.println("Trabajador{" + traba);
        
        //Profesor
        Profesor profre = new Profesor();
        
        profre.setNombre("Francisco");
        profre.setEdad(30);
        profre.setGenero("Hombre");
        profre.setNumClases(4);
        profre.setNumTrabajador(1468984);
        profre.setSueldo(2000);
        System.out.println(profre);
        
        //Director
        Director dire = new Director();
        
        dire.setNombre("Alexis");
        dire.setEdad(50);
        dire.setGenero("Hombre");
        dire.setNumTrabajador(986543);
        dire.setPresupuesto(5000000);
        dire.setSueldo(10000);
        System.out.println(dire);
        
    }
    
}
