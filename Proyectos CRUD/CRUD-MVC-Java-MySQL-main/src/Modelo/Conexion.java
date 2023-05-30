package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author MRoblesDev
 */
public class Conexion {

    Connection con = null;

    String base = "tienda"; //Nombre de la base de datos
    String url = "jdbc:mysql://localhost:8111/" + base; //Direccion, puerto y nombre de la Base de Datos
    String user = "prueba"; //Usuario de Acceso a MySQL
    String password = "12345678"; //Password del usuario

    public Connection getConexion() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e);
        }
        return con;
    }
}
