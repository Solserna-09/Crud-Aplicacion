/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

import recurso.Conexion;

/**
 *
 * @author Daniel
 */
public class NewMain {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Conexion conexion= new Conexion("localhost", "prueba", "postgres", "admin1");
        conexion.getConexion();
    }
    
}
