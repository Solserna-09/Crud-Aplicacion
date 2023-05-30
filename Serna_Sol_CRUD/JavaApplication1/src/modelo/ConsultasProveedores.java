/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author SOL
 */
public class ConsultasProveedores extends Conexion {
    
    
    public boolean registrar(Proveedores pro) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO proveedores (nit, nombre, direccion, telefono) VALUES(?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getNit());
            ps.setString(2, pro.getNombre());
            ps.setString(3, pro.getDireccion());
            ps.setString(4,  pro.getTelefono());
         
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    public boolean modificar(Proveedores pro) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "UPDATE proveedores SET nit=?, nombre=?, direccion=?, telefono=? WHERE id=? ";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getNit());
            ps.setString(2, pro.getNombre());
            ps.setString(3, pro.getDireccion());
            ps.setString(4,  pro.getTelefono());
            ps.setInt(5, pro.getId());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    public boolean eliminar(Proveedores pro) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "DELETE FROM proveedores WHERE id=? ";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, pro.getId());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    public boolean buscar(Proveedores pro) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String sql = "SELECT * FROM proveedores WHERE nit=? ";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getNit());
            rs = ps.executeQuery();

            if (rs.next()) {
                pro.setId(Integer.parseInt(rs.getString("id")));
                pro.setNit(rs.getString("nit"));
                pro.setNombre(rs.getString("nombre"));
                pro.setDireccion(rs.getString("direccion"));
                pro.setTelefono(rs.getString("telefono"));
                return true;
            }
            return false;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    private Connection getConexion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
