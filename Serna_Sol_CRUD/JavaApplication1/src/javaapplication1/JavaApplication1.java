/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import controlador.CtrlProveedor;
import modelo.Conexion;
import modelo.ConsultasProveedores;
import modelo.Proveedores;
import vista.FrmProveedor;

/**
 *
 * @author SOL
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conexion conexion = new Conexion();
        System.out.println(conexion.getCon());
        
        Proveedores mod = new Proveedores();
        ConsultasProveedores modC = new ConsultasProveedores();
        FrmProveedor frm = new FrmProveedor();
        CtrlProveedor ctrl = new CtrlProveedor(mod, modC, frm);
        ctrl.iniciar();
        frm.setVisible(true);}
                
    }
    
      
    
    
    
