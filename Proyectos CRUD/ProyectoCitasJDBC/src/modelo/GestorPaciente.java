
package modelo;

import java.util.LinkedList;
import java.sql.*;
import javax.swing.JOptionPane;
import recurso.Conexion;

public class GestorPaciente {
    
    private static Connection conn;//Declaración de un objeto de tipo Connection que recibe la conexión con la base de datos

    public GestorPaciente() {//Constructor de la clase que envía a la clase Conexion los parámetros 
        //específicos de la base de datos y obtiene la conexión con la misma
        //recurso.Conexion conexion = new recurso.Conexion("localhost", "XE", "citas", "555555");
        Conexion conexion= new Conexion("localhost", "prueba", "postgres", "admin");
        conn = conexion.getConexion();
    }
    
    public void registrarPacientes(Paciente paciente){
        try{
         //Se crea un objeto de tipo PreparedStatement, a partir de la conexión
         //creada en el constructor y se establece la sentencia insert, dejando los
         //valores de la misma para ser establecidos posteriormente
            PreparedStatement pst = conn.prepareStatement("insert into PACIENTES values (?,?,?,?,?)");
            //Definición de los valores que se deben insertar a través de la sentencia insert
            pst.setString(1, paciente.getIdentificacion());
            pst.setString(2, paciente.getNombres());
            pst.setString(3, paciente.getApellidos());
            pst.setString(4, paciente.getFechaNacimiento());
            pst.setString(5, paciente.getSexo());
            pst.executeUpdate();//ejecuta la secuencia INSERT sobre la BD
            JOptionPane.showMessageDialog(null, "Paciente Registrado!");
        }catch(SQLException exc){
            JOptionPane.showMessageDialog(null, exc.getMessage());
        }
    }
    
    public LinkedList<Paciente> getPacienteBy(int parametro, String valor){
        LinkedList<Paciente> resultado = new LinkedList<Paciente>();//LinkedList para retornar los pacientes consultados de la base de datos
        String sql = "";
        switch(parametro){
            case 1: sql = "select * from pacientes where pac_identificacion ='"+valor+"'";
                break;
            case 2: sql = "select * from pacientes where pac_nombres ='"+valor+"'";
                break;
            case 3: sql = "select * from pacientes where pac_apellidos ='"+valor+"'";
                break;
            case 4: sql = "select * from pacientes where pac_sexo ='"+valor+"'";
                break;
        }
        try{
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                resultado.add(new Paciente(rs.getString("pac_Identificacion"),
                        rs.getString("pac_Nombres"),
                        rs.getString("pac_Apellidos"),
                        rs.getString("pac_FechaNacimiento"),
                        rs.getString("pac_Sexo")));
            }
            st.close();
            rs.close();
        }catch(SQLException exc){
            JOptionPane.showMessageDialog(null, exc.getMessage());
        }
        finally{
            return resultado;
        }
    }

    
}
