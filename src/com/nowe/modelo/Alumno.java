/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nowe.modelo;

import java.io.Serializable;

/**
 *
 * @author agarm
 */
public class Alumno implements Serializable{  //Serializable e importo
    private String DNI, nombre;
    private double nota;

    @Override
    public String toString() {
        return "Alumno{" + "DNI=" + DNI + ", nombre=" + nombre + ", nota=" + nota + '}';
    }
    
    
    public Alumno() {
    }

    public Alumno(String DNI, String nombre, double nota) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
    
    
    
    
}
