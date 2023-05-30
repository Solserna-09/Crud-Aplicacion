/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.ConsultasProveedores;
import modelo.Proveedores;
import vista.FrmProveedor;
import javax.swing.JOptionPane;

/**
 *
 * @author SOL
 */
public class CtrlProveedor implements  ActionListener {
     private final Proveedores modelo;
    private final ConsultasProveedores consultas;
    private final FrmProveedor vista;

    public CtrlProveedor(Proveedores modelo, ConsultasProveedores consultas, FrmProveedor vista) {
        this.modelo = modelo;
        this.consultas = consultas;
        this.vista = vista;
        this.vista.btnGuardar.addActionListener(this);
        this.vista.btnModificar.addActionListener(this);
        this.vista.btnEliminar.addActionListener(this);
        this.vista.btnLimpiar.addActionListener(this);
        this.vista.btnBuscar.addActionListener(this);
      
    }

    public void iniciar() {
        vista.setTitle("Proveedores");
        vista.setLocationRelativeTo(null);
        vista.txtId.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vista.btnGuardar) {
            modelo.setNit(vista.txtNit.getText());
            modelo.setNombre(vista.txtNombre.getText());
            modelo.setDireccion(vista.txtDireccion.getText());
            modelo.setTelefono(vista.txtTelefono.getText());

            if (consultas.registrar(modelo)) {
                JOptionPane.showMessageDialog(null, "Registro Guardado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Guardar");
                limpiar();
            }
        }

        if (e.getSource() == vista.btnModificar) {
            modelo.setId(Integer.parseInt(vista.txtId.getText()));
            modelo.setNit(vista.txtNit.getText());
            modelo.setNombre(vista.txtNombre.getText());
            modelo.setDireccion(vista.txtDireccion.getText());
            modelo.setTelefono(vista.txtTelefono.getText());

            if (consultas.modificar(modelo)) {
                JOptionPane.showMessageDialog(null, "Registro Modificado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Modificar");
                limpiar();
            }
        }

        if (e.getSource() == vista.btnEliminar) {
            modelo.setId(Integer.parseInt(vista.txtId.getText()));

            if (consultas.eliminar(modelo)) {
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Eliminar");
                limpiar();
            }
        }

        if (e.getSource() == vista.btnBuscar) {
            modelo.setNit(vista.txtNit.getText());

            if (consultas.buscar(modelo)) {
            modelo.setId(Integer.parseInt(vista.txtId.getText()));
            modelo.setNit(vista.txtNit.getText());
            modelo.setNombre(vista.txtNombre.getText());
            modelo.setDireccion(vista.txtDireccion.getText());
            modelo.setTelefono(vista.txtTelefono.getText());
           

            } else {
                JOptionPane.showMessageDialog(null, "No se encontro registro");
                limpiar();
            }
        }

        if (e.getSource() == vista.btnLimpiar) {
            limpiar();
        }
    }

    public void limpiar() {
        vista.txtId.setText(null);
        vista.txtNit.setText(null);
        vista.txtNombre.setText(null);
        vista.txtDireccion.setText(null);
        vista.txtTelefono.setText(null);
    }
    
}
