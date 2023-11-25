/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.core;

import com.conexion.Conexion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
public class FrmProveedores extends javax.swing.JFrame {

    /**
     * Creates new form FrmProveedores
     */
    public FrmProveedores() {
        initComponents();
        mostrarProveedoresEnTabla(tablaPrincipal);
        // Configurar un MouseListener para la tabla para manejar la selección de filas
        tablaPrincipal.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Llama al método para cargar datos en campos de texto al seleccionar una fila
                cargarDatosEnCamposDeTexto(tablaPrincipal, txtId, txtNombre, txtDireccion);
            }
        });
        this.setLocationRelativeTo(this);

        // Configurar el evento de clic directamente en el botón
        btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Llama al método para eliminar datos al hacer clic en el botón
                eliminarRegistro(txtId);
            }
        });
        // Configurar el evento de clic directamente en el botón
        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Llama al método para guardar datos
                guardarDatosEnBaseDeDatos();
            }
        });
        // Configurar un MouseListener para la tabla para manejar la selección de filas
        tablaPrincipal.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Llama al método para cargar datos en campos de texto al seleccionar una fila
                cargarDatosEnCamposDeTexto(tablaPrincipal, txtId, txtNombre, txtDireccion);
            }
        });

        // Configurar el evento de clic directamente en el botón
        btnActualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Llama al método para actualizar datos al hacer clic en el botón
                actualizarDatosEnTabla(txtId, txtNombre, txtDireccion);
            }
        });
    }
    // Método simplificado para guardar datos en la base de datos utilizando los valores de los campos de texto

    // Método para eliminar un registro en la base de datos
    private void eliminarRegistro(JTextField txtId) {
        int filaSeleccionada = tablaPrincipal.getSelectedRow();

        // Asegúrate de que se haya seleccionado una fila
        if (filaSeleccionada >= 0) {
            try {
                Conexion conexion = new Conexion();
                Connection cn = conexion.getConnection();

                // Obtener el ID de la fila seleccionada
                int proveedorID = Integer.parseInt(txtId.getText());

                // Consulta SQL para eliminar un proveedor en la tabla
                String query = "DELETE FROM proveedores WHERE ProveedorID=?";
                try (PreparedStatement pst = cn.prepareStatement(query)) {
                    // Configura el parámetro del PreparedStatement con el ID de la fila seleccionada
                    pst.setInt(1, proveedorID);

                    // Ejecuta la consulta de eliminación
                    int filasAfectadas = pst.executeUpdate();

                    if (filasAfectadas > 0) {
                        JOptionPane.showMessageDialog(null, "Registro eliminado correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);

                        // Actualizar la tabla después de la eliminación
                        mostrarProveedoresEnTabla(tablaPrincipal);

                        // Limpiar los campos de texto después de la eliminación
                        limpiarCamposDeTexto();
                    } else {
                        JOptionPane.showMessageDialog(null, "No se pudo eliminar el registro", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }

                // Cierra la conexión después de usarla
                conexion.close();
            } catch (SQLException | NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Error al eliminar registro", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, selecciona una fila para eliminar", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void limpiarCamposDeTexto() {

        txtId.setText(" ");
        txtNombre.setText(" ");
        txtDireccion.setText(" ");

    }
// Método para cargar datos en campos de texto al seleccionar una fila en la tabla

    private void cargarDatosEnCamposDeTexto(JTable tabla, JTextField txtId, JTextField txtNombre, JTextField txtDireccion) {
        int filaSeleccionada = tabla.getSelectedRow();

        // Asegúrate de que se haya seleccionado una fila
        if (filaSeleccionada >= 0) {
            // Obtén el modelo de la tabla
            DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();

            // Llena los campos de texto con los datos de la fila seleccionada
            txtId.setText(modelo.getValueAt(filaSeleccionada, 0).toString());
            txtNombre.setText(modelo.getValueAt(filaSeleccionada, 1).toString());
            txtDireccion.setText(modelo.getValueAt(filaSeleccionada, 2).toString());
        }
    }

    // Método para actualizar datos en la tabla
    private void actualizarDatosEnTabla(JTextField txtId, JTextField txtNombre, JTextField txtDireccion) {
        try {
            Conexion conexion = new Conexion();
            Connection cn = conexion.getConnection();

            // Consulta SQL para actualizar un proveedor en la tabla
            String query = "UPDATE proveedores SET NombreProveedor=?, Direccion=? WHERE ProveedorID=?";

            try (PreparedStatement pst = cn.prepareStatement(query)) {
                // Configura los parámetros del PreparedStatement con los valores de los campos de texto
                pst.setString(1, txtNombre.getText());
                pst.setString(2, txtDireccion.getText());
                pst.setInt(3, Integer.parseInt(txtId.getText()));

                // Ejecuta la consulta de actualización
                int filasAfectadas = pst.executeUpdate();

                if (filasAfectadas > 0) {
                    JOptionPane.showMessageDialog(null, "Datos actualizados correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);

                    // Actualizar la tabla después de la actualización
                    mostrarProveedoresEnTabla(tablaPrincipal);
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo actualizar el registro", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

            // Cierra la conexión después de usarla
            conexion.close();
        } catch (SQLException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error al actualizar datos", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }

    private void guardarDatosEnBaseDeDatos() {
        try {
            Conexion conexion = new Conexion();
            Connection cn = conexion.getConnection();

            // Consulta SQL para insertar un nuevo registro en la tabla
            String query = "INSERT INTO proveedores (ProveedorID, NombreProveedor, Direccion) VALUES (?, ?, ?)";

            try (PreparedStatement pst = cn.prepareStatement(query)) {
                // Configura los parámetros del PreparedStatement con los valores de los campos de texto
                pst.setInt(1, Integer.parseInt(txtId.getText()));
                pst.setString(2, txtNombre.getText());
                pst.setString(3, txtDireccion.getText());

                // Ejecuta la consulta de inserción
                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "Datos guardados correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                mostrarProveedoresEnTabla(tablaPrincipal);
            }

            // Cierra la conexión después de usarla
            conexion.close();
        } catch (SQLException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error al guardar datos", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPrincipal = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 750));

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Proveedores");

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 229, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(226, 226, 226))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jButton1)))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 760, -1));

        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, -1, -1));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 180, 40));

        jLabel3.setText("Id");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, -1));
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 180, 40));

        jLabel4.setText("Direccion");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, -1, -1));
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 40, 40));

        btnEliminar.setText("Eliminar");
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, -1, -1));

        btnGuardar.setText("Guardar");
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, -1, -1));

        btnActualizar.setText("Actualizar");
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, -1, -1));

        tablaPrincipal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaPrincipal);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 530, 230));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        FrmPrincipal frmPrincipal = new FrmPrincipal();
        frmPrincipal.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton1ActionPerformed
    public void mostrarProveedoresEnTabla(JTable tabla) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0); // Limpia la tabla antes de agregar nuevos datos

        try {
            Conexion conexion = new Conexion();
            Connection cn = conexion.getConnection();

            String query = "SELECT ProveedorID, NombreProveedor, Direccion FROM proveedores";
            try (PreparedStatement pst = cn.prepareStatement(query); ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    int proveedorID = rs.getInt("ProveedorID");
                    String nombreProveedor = rs.getString("NombreProveedor");
                    String direccion = rs.getString("Direccion");

                    // Agrega una nueva fila a la tabla con los datos obtenidos de la base de datos
                    modelo.addRow(new Object[]{proveedorID, nombreProveedor, direccion});
                }
            }

            conexion.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error al mostrar proveedores en la tabla", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmProveedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaPrincipal;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
