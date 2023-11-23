/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.core;

import com.conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hetzo
 */
public class ClsUsuario {

    public void mostrarDatosEnTabla(JTable tabla) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0); // Limpia la tabla antes de agregar nuevos datos

        try {
            Conexion conexion = new Conexion();
            Connection cn = conexion.getConnection();

            String query = "SELECT UserID, Nombre, Apellido, Edad, Usuario FROM usuarios";
            try (PreparedStatement pst = cn.prepareStatement(query); ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    int userID = rs.getInt("UserID");
                    String nombre = rs.getString("Nombre");
                    String apellido = rs.getString("Apellido");
                    int edad = rs.getInt("Edad");
                    String usuario = rs.getString("Usuario");

                    // Agrega una nueva fila a la tabla con los datos obtenidos de la base de datos
                    modelo.addRow(new Object[]{userID, nombre, apellido, edad, usuario});
                }
            }

            conexion.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error al mostrar datos en la tabla", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }

    // Método para guardar datos en la tabla
 
}
