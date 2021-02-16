/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nowe.presentacion;

import com.nowe.modelo.Alumno;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author agarm
 */
public class Main_EscribirObjeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escribir en un fichero los datos de dos objetos de tipo alumno (antes hago la clase Alumno en el paquete modelo)
        
        //1. Definir las variables
        Alumno a1, a2;
        FileOutputStream ficheroSalida;
        ObjectOutputStream s;
        
        //2. Instanciar variables
        a1 = new Alumno("12345678A", "Jose Casas", 8.5);
        a2 = new Alumno("12345678B", "Laura Casas", 9.5);
        try {
            ficheroSalida = new FileOutputStream("objeto1.dat");
            s = new ObjectOutputStream(ficheroSalida);
            s.writeObject(a1);
            s.writeObject(a2);
            
        } catch (FileNotFoundException ex) {
            System.out.println(ex.toString());
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
        
        
    }
    
}
