
package maselu;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class Sesion extends javax.swing.JFrame {                
//    String usuario = "admin";
//    String contraseña = "2003";
     Conectar cc = new Conectar();
    Connection cn = cc.Conexion();
    Statement st;
    ResultSet rs;
    
    
    public Sesion() {
        initComponents();
        this.setLocationRelativeTo(this);
        
       
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        pass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INICIO DE SESION");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 160, 40));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 70, 20));
        jPanel1.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 160, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Usuario:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, 20));

        jButton1.setText("Inicio");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, -1));
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 160, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maselu/fondoo.jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -4, 580, 280));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
        
        try{
        String User = user.getText(); 
        String password = pass.getText();
        String sql = "SELECT * FROM usuarios WHERE usuario=? AND contras=?";
        PreparedStatement statement = (PreparedStatement) cn.prepareStatement(sql);
        statement.setString(1, User);
        statement.setString(2, password);
        ResultSet rs = (ResultSet) statement.executeQuery();

        if (rs.next()) {
        
        String userName = rs.getString("Usuario");
        String userPassword = rs.getString("contras");
        switch (userName) {
            case "Admin":
                if (userPassword.equals(password)) {
                    JOptionPane.showMessageDialog(null, "Bievenido a Compras!" );
                    Productos a = new Productos();
                    a.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Credenciales incorrectas");
                }
                break;
            case "David":
                if (userPassword.equals(password)) {
                    
                    JOptionPane.showMessageDialog(null, "Bievenido a Ventas!" );
                    Ventas b = new Ventas();
                    b.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Credenciales incorrectas");
                }
                break;
            case "Francisco":
                if (userPassword.equals(password)) {
                    JOptionPane.showMessageDialog(null, "Bievenido a Contabilidad" );
                    Contabilidad c = new Contabilidad();
                    c.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Credenciales incorrectas");
                }
                break;
            default:
                // Usuario no registrado
                JOptionPane.showMessageDialog(null, "Usuario no tiene acceso a ningún formulario");
        }
    } else {
        
        JOptionPane.showMessageDialog(null, "Usuario no encontrado en la base de datos");
    }
} catch (Exception e) {
    System.out.println("Fallo: " + e);
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        if (usuario.equals(U)){
//                if(contraseña.equals(C)){
//                JOptionPane.showMessageDialog(null, "Bienvenidio a la tienda MASELU",
//                        "MASELU", JOptionPane.INFORMATION_MESSAGE);
//                Productos abrir = new Productos();
//                abrir.setVisible(true);
//                this.setVisible(false);
//                }else{
//                  JOptionPane.showMessageDialog(null, "La contraseña es incorrecta",
//                          "ERROR", JOptionPane.ERROR_MESSAGE);
//                    
//                }
//        }else{
//        JOptionPane.showMessageDialog(null, "El usuario es incorrecto"
//                ,"ERROR", JOptionPane.ERROR_MESSAGE);
//        }
        
        
        
        
    
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
