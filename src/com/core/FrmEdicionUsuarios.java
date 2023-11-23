/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.core;

import com.conexion.Conexion;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hetzo
 */
public class FrmEdicionUsuarios extends javax.swing.JFrame {

    /**
     * Creates new form FrmUsuarios
     */
    public FrmEdicionUsuarios() {
        initComponents();
        this.setLocationRelativeTo(this);
        ClsUsuario clsUsuario = new ClsUsuario();
        clsUsuario.mostrarDatosEnTabla(tablaPrincipal);
        tablaPrincipal.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int filaSeleccionada = tablaPrincipal.getSelectedRow();
                llenarCamposDesdeTabla(filaSeleccionada, txtId, txtNombre, txtApellido, txtEdad, txtContraseña, cmbUsuario);
            }
        });
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
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPrincipal = new javax.swing.JTable();
        cmbUsuario = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();

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
            .addGap(0, 660, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 660));

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Edicion/Usuarios");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addContainerGap(373, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 670, -1));

        jLabel2.setText("Id");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, -1, -1));
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 40, 40));

        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, -1, -1));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 180, 40));
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 180, 40));

        jLabel4.setText("Apellido");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, -1, -1));
        jPanel1.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 180, 40));

        jLabel5.setText("Edad");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));
        jPanel1.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 180, 40));

        jLabel6.setText("Contraseña");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, -1, -1));

        jLabel7.setText("Tipo de usario");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, -1, -1));

        tablaPrincipal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "Nombre", "apellido", "edad", "tipo de usuario"
            }
        ));
        tablaPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaPrincipalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaPrincipal);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 570, 310));

        cmbUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario", "Administrador", "Visitante", " " }));
        jPanel1.add(cmbUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, 150, 40));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 190, -1, -1));

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 190, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        guardarDatosEnTabla(txtId, txtNombre, txtApellido, txtEdad, txtContraseña, cmbUsuario);


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        actualizarDatosEnTabla(txtId, txtNombre, txtApellido, txtEdad, txtContraseña, cmbUsuario);


    }//GEN-LAST:event_btnActualizarActionPerformed
    // Método para actualizar datos en la tabla
    private void llenarCamposDesdeTabla(int filaSeleccionada, JTextField txtId, JTextField txtNombre,
            JTextField txtApellido, JTextField txtEdad, JTextField txtContraseña, JComboBox<String> cmbUsuario) {

        // Asegúrate de que se haya seleccionado una fila
        if (filaSeleccionada >= 0) {
            // Obtén el modelo de la tabla
            DefaultTableModel modelo = (DefaultTableModel) tablaPrincipal.getModel();

            // Llena los campos de texto con los datos de la fila seleccionada
            txtId.setText(modelo.getValueAt(filaSeleccionada, 0).toString());
            txtNombre.setText(modelo.getValueAt(filaSeleccionada, 1).toString());
            txtApellido.setText(modelo.getValueAt(filaSeleccionada, 2).toString());
            txtEdad.setText(modelo.getValueAt(filaSeleccionada, 3).toString());
            txtContraseña.setText(modelo.getValueAt(filaSeleccionada, 4).toString());
            cmbUsuario.setSelectedItem(modelo.getValueAt(filaSeleccionada, 5).toString());
        }
    }

    private void actualizarDatosEnTabla(JTextField txtId, JTextField txtNombre, JTextField txtApellido,
            JTextField txtEdad, JTextField txtContraseña, JComboBox<String> cmbUsuario) {

        try {
            Conexion conexion = new Conexion();
            Connection cn = conexion.getConnection();

            // Consulta SQL para actualizar un usuario en la tabla
            String query = "UPDATE usuarios SET Nombre=?, Apellido=?, Edad=?, Contraseña=?, Usuario=? WHERE UserID=?";

            try (PreparedStatement pst = cn.prepareStatement(query)) {
                // Configura los parámetros del PreparedStatement con los valores de los campos del formulario
                pst.setString(1, txtNombre.getText());
                pst.setString(2, txtApellido.getText());
                pst.setInt(3, Integer.parseInt(txtEdad.getText()));
                pst.setString(4, txtContraseña.getText());
                pst.setString(5, cmbUsuario.getSelectedItem().toString());
                pst.setInt(6, Integer.parseInt(txtId.getText()));

                // Ejecuta la consulta de actualización
                int filasAfectadas = pst.executeUpdate();

                if (filasAfectadas > 0) {
                    JOptionPane.showMessageDialog(null, "Datos actualizados correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
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

    private void tablaPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaPrincipalMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaPrincipalMouseClicked

    private void limpiar() {
        txtId.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtContraseña.setText("");
        txtEdad.setText("");
    }

    private void guardarDatosEnTabla(JTextField txtId, JTextField txtNombre, JTextField txtApellido,
            JTextField txtEdad, JTextField txtContraseña, JComboBox<String> cmbUsuario) {

        try {
            Conexion conexion = new Conexion();
            Connection cn = conexion.getConnection();

            // Consulta SQL para insertar un nuevo usuario en la tabla
            String query = "INSERT INTO usuarios (UserID, Nombre, Apellido, Edad, Contraseña, Usuario) VALUES (?, ?, ?, ?, ?, ?)";

            try (PreparedStatement pst = cn.prepareStatement(query)) {
                // Configura los parámetros del PreparedStatement con los valores de los campos del formulario
                pst.setInt(1, Integer.parseInt(txtId.getText()));
                pst.setString(2, txtNombre.getText());
                pst.setString(3, txtApellido.getText());
                pst.setInt(4, Integer.parseInt(txtEdad.getText()));
                pst.setString(5, txtContraseña.getText());
                pst.setString(6, cmbUsuario.getSelectedItem().toString());

                // Ejecuta la consulta de inserción
                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "Datos guardados correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            }
            ClsUsuario clsUsuario = new ClsUsuario();
            clsUsuario.mostrarDatosEnTabla(tablaPrincipal);
            limpiar();
            // Cierra la conexión después de usarla
            conexion.close();
        } catch (SQLException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error al guardar datos", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(FrmEdicionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEdicionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEdicionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEdicionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEdicionUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cmbUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaPrincipal;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
