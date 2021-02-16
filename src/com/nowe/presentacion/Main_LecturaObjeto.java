/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nowe.presentacion;

import com.nowe.modelo.Alumno;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author agarm
 */
public class Main_LecturaObjeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Leer de un fichero los objetos almacenados ahí
        
        //1. Declaración de variables
        Alumno a1;
        FileInputStream ficheroEntrada;
        ObjectInputStream s;
        
        try {
            //2. Instanciar los objetos
            // no tenemos que instanciar el alumno, pero sí el fichero de entrada
            ficheroEntrada = new FileInputStream("objeto1.dat");
            s = new ObjectInputStream(ficheroEntrada);
            
            //como es una lectura voy a hacer un bucle infinito
            while (true) {
                a1 = (Alumno) s.readObject(); //hago un casting
                System.out.println("Información alumno -> " + a1.toString());
            }

        } catch (FileNotFoundException ex) {
            System.out.println(ex.toString());
        } catch (IOException ex) {
            System.out.println(ex.toString());
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.toString());
        }

    }
    
}
