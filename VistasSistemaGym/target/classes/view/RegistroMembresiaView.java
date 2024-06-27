/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author kacor
 */
public class RegistroMembresiaView extends javax.swing.JFrame {

    /**
     * Creates new form RegistroMembresiaView
     */
    public RegistroMembresiaView() {
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

        bg = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        cmbTipoMembresia = new javax.swing.JComboBox<>();
        lblNombreMembresia = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        lblPrecioTotal = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        txtBusqueda = new javax.swing.JTextField();
        cmbCriterioBusqueda = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnCobrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de membresia");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(255, 51, 51)));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Poppins Medium", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Registro de Membresia");
        bg.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 10, 690, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/barraTitulo.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 60));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 0, 0, 0, new java.awt.Color(242, 98, 15)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Metodos de Pago");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 250, 30));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/metodosPago.png"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 210, 40));

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 270, 110));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 0, 0, 0, new java.awt.Color(242, 98, 15)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel11.setText("Membresia:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 90, 30));

        cmbTipoMembresia.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        cmbTipoMembresia.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        cmbTipoMembresia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoMembresiaActionPerformed(evt);
            }
        });
        jPanel2.add(cmbTipoMembresia, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 160, 30));

        lblNombreMembresia.setBackground(new java.awt.Color(255, 255, 204));
        lblNombreMembresia.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        lblNombreMembresia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreMembresia.setText("Membresia UN MES");
        jPanel2.add(lblNombreMembresia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 250, 40));

        lblDescripcion.setFont(new java.awt.Font("Poppins", 0, 16)); // NOI18N
        lblDescripcion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDescripcion.setText("Acceso a las instalaciones básicas del gimnasio");
        jPanel2.add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 250, 80));

        bg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 270, 250));

        lblPrecioTotal.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        lblPrecioTotal.setText("$30.00");
        bg.add(lblPrecioTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 480, 90, -1));

        jLabel19.setBackground(new java.awt.Color(255, 255, 204));
        jLabel19.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Total:");
        bg.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 70, 30));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 0, 0, 0, new java.awt.Color(242, 98, 15)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBuscar.setBackground(new java.awt.Color(242, 98, 15));
        btnBuscar.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/iconoSocioNegro.png"))); // NOI18N
        btnBuscar.setBorder(null);
        jPanel3.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 60, 30));

        txtBusqueda.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        jPanel3.add(txtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 150, 30));

        cmbCriterioBusqueda.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        cmbCriterioBusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Cedula", "Apellido" }));
        jPanel3.add(cmbCriterioBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 80, 30));

        jLabel3.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Socio");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 330, 30));

        jLabel4.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel4.setText("Cedula:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        txtCedula.setEditable(false);
        txtCedula.setBackground(new java.awt.Color(255, 255, 255));
        txtCedula.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        txtCedula.setEnabled(false);
        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });
        jPanel3.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 310, 27));

        jLabel12.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel12.setText("Email:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        txtEmail.setEditable(false);
        txtEmail.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        txtEmail.setEnabled(false);
        jPanel3.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 150, 27));

        txtTelefono.setEditable(false);
        txtTelefono.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        txtTelefono.setEnabled(false);
        jPanel3.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 150, 27));

        jLabel8.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel8.setText("Telefono:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, -1, -1));

        txtNombre.setEditable(false);
        txtNombre.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        txtNombre.setEnabled(false);
        jPanel3.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 150, 27));

        jLabel5.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel5.setText("Nombre:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel6.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel6.setText("Apellido:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));

        txtApellido.setEditable(false);
        txtApellido.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        txtApellido.setEnabled(false);
        jPanel3.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 150, 27));

        txtDireccion.setEditable(false);
        txtDireccion.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        txtDireccion.setEnabled(false);
        jPanel3.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 310, 27));

        jLabel9.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel9.setText("Direccion:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        btnCobrar.setBackground(new java.awt.Color(242, 98, 15));
        btnCobrar.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        btnCobrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCobrar.setText("Registrar membresia");
        btnCobrar.setBorder(null);
        btnCobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCobrarActionPerformed(evt);
            }
        });
        jPanel3.add(btnCobrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 310, 30));

        bg.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 350, 450));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbTipoMembresiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoMembresiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTipoMembresiaActionPerformed

    private void btnCobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCobrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCobrarActionPerformed

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroMembresiaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroMembresiaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroMembresiaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroMembresiaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroMembresiaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnCobrar;
    public javax.swing.JComboBox<String> cmbCriterioBusqueda;
    public javax.swing.JComboBox<String> cmbTipoMembresia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JLabel lblDescripcion;
    public javax.swing.JLabel lblNombreMembresia;
    public javax.swing.JLabel lblPrecioTotal;
    public javax.swing.JTextField txtApellido;
    public javax.swing.JTextField txtBusqueda;
    public javax.swing.JTextField txtCedula;
    public javax.swing.JTextField txtDireccion;
    public javax.swing.JTextField txtEmail;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
