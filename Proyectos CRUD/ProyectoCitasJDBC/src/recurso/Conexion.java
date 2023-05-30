/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package recurso;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Juan Pablo
 */
public class Conexion {
    
    private String driver, url, ip, bd, usr, pass;
    private Connection conexion;

    public Conexion(String ip, String bd, String usr, String pass) {
        
        driver = "org.postgresql.Driver";
        this.bd = bd;
        this.usr = usr;
        this.pass = pass;
        url = "jdbc:postgresql://" + ip + ":5432/" + bd;
        
        try{
            Class.forName(driver).newInstance();//registro del driver en la aplicacion
            conexion = DriverManager.getConnection(url, usr, pass); //creacion de la conexion a la BD
        }catch(Exception exc){
            JOptionPane.showMessageDialog(null, "Error en la conexion con la base de Datos: "+exc);
        }
    }
    
    public Connection getConexion(){ //retorna la conexion establecida
        return conexion;
    }
    
    public Connection CerrarConexion() throws SQLException{
        conexion.close();
        conexion = null;
        return conexion;
    }
    
}
