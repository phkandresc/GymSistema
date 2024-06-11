/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author ASUS
 */
public class RegistroSociosView extends javax.swing.JFrame {

    /**
     * Creates new form RegistroSociosView
     */
    public RegistroSociosView() {
        initComponents();
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
        lblDescripcionMembresia = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ButtonRegistrar = new javax.swing.JButton();
        ButtonCancelar = new javax.swing.JButton();
        txtCedula = new NumericTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        txtApellidos = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        txtEmail = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        txtTelefono = new NumericTextField();
        jLabel7 = new javax.swing.JLabel();
        cmbTipoMembresia = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        dcFechaNacimiento = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDescripcionMembresia.setFont(new java.awt.Font("Poppins Light", 0, 16)); // NOI18N
        lblDescripcionMembresia.setText("Descripcion de la membresia");
        jPanel1.add(lblDescripcionMembresia, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 250, -1));

        jLabel3.setFont(new java.awt.Font("Poppins Light", 1, 16)); // NOI18N
        jLabel3.setText("Telefono:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 159, 29));

        jLabel4.setFont(new java.awt.Font("Poppins Light", 1, 16)); // NOI18N
        jLabel4.setText("Nombres:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 108, 30));

        jLabel5.setFont(new java.awt.Font("Poppins Light", 1, 16)); // NOI18N
        jLabel5.setText("Direccion:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 210, 30));

        jLabel6.setFont(new java.awt.Font("Poppins Light", 1, 16)); // NOI18N
        jLabel6.setText("Apellidos:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 96, 24));

        jLabel8.setFont(new java.awt.Font("Poppins Light", 1, 16)); // NOI18N
        jLabel8.setText("Email:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 87, 28));

        ButtonRegistrar.setBackground(new java.awt.Color(242, 68, 5));
        ButtonRegistrar.setFont(new java.awt.Font("Poppins Medium", 0, 15)); // NOI18N
        ButtonRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        ButtonRegistrar.setText("Registar");
        ButtonRegistrar.setBorder(null);
        jPanel1.add(ButtonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 490, 136, 37));

        ButtonCancelar.setBackground(new java.awt.Color(242, 68, 5));
        ButtonCancelar.setFont(new java.awt.Font("Poppins Medium", 0, 15)); // NOI18N
        ButtonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        ButtonCancelar.setText("Cancelar");
        ButtonCancelar.setBorder(null);
        jPanel1.add(ButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 490, 153, 38));

        txtCedula.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        txtCedula.setBorder(null);
        txtCedula.setPreferredSize(new java.awt.Dimension(645, 22));
        jPanel1.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 240, 30));

        jLabel10.setFont(new java.awt.Font("Poppins Medium", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Registro de Socio");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/barraTitulo.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 60));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 240, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 240, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 240, -1));

        txtApellidos.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        txtApellidos.setBorder(null);
        txtApellidos.setPreferredSize(new java.awt.Dimension(645, 22));
        jPanel1.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 240, 30));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 240, -1));

        txtEmail.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        txtEmail.setBorder(null);
        txtEmail.setPreferredSize(new java.awt.Dimension(645, 22));
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 240, 30));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 240, -1));

        txtTelefono.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        txtTelefono.setBorder(null);
        txtTelefono.setPreferredSize(new java.awt.Dimension(645, 22));
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 240, 30));

        jLabel7.setFont(new java.awt.Font("Poppins Light", 1, 16)); // NOI18N
        jLabel7.setText("Cedula:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 135, -1));

        cmbTipoMembresia.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        cmbTipoMembresia.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        cmbTipoMembresia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoMembresiaActionPerformed(evt);
            }
        });
        jPanel1.add(cmbTipoMembresia, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 220, 30));

        jLabel9.setFont(new java.awt.Font("Poppins Light", 1, 16)); // NOI18N
        jLabel9.setText("Elegir tipo de membresia:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 220, -1));

        dcFechaNacimiento.setDateFormatString("yyyy-MM-dd");
        dcFechaNacimiento.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        jPanel1.add(dcFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 240, 30));

        jLabel11.setFont(new java.awt.Font("Poppins Light", 1, 16)); // NOI18N
        jLabel11.setText("Fecha de nacimiento:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 210, 30));

        txtNombres.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        txtNombres.setBorder(null);
        txtNombres.setPreferredSize(new java.awt.Dimension(645, 22));
        jPanel1.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 240, 30));

        txtDireccion.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        txtDireccion.setBorder(null);
        txtDireccion.setPreferredSize(new java.awt.Dimension(645, 22));
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 240, 30));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 240, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbTipoMembresiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoMembresiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTipoMembresiaActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroSociosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroSociosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroSociosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroSociosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroSociosView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton ButtonCancelar;
    public javax.swing.JButton ButtonRegistrar;
    public javax.swing.JComboBox<String> cmbTipoMembresia;
    public com.toedter.calendar.JDateChooser dcFechaNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    public javax.swing.JLabel lblDescripcionMembresia;
    public javax.swing.JTextField txtApellidos;
    public javax.swing.JTextField txtCedula;
    public javax.swing.JTextField txtDireccion;
    public javax.swing.JTextField txtEmail;
    public javax.swing.JTextField txtNombres;
    public javax.swing.JTextField txtTelefono;

    // End of variables declaration//GEN-END:variables
}
