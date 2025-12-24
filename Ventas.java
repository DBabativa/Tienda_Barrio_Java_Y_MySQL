package maselu;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Ventas extends javax.swing.JFrame {
    Conectar cc = new Conectar();
    Connection cn = cc.Conexion();
    Statement st;
    ResultSet rs;
            public static String iidd;

    public Ventas() {
        initComponents();
        this.setLocationRelativeTo(this);

    

    
    }
    
    
    
    

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingrese el numero de factura que desea encontrar");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 130, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maselu/fondo.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 190));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
       iidd = JOptionPane.showInputDialog("Ingrese numero de factura para buscarla en la base");
       Factura p = new Factura();
       p.reiniciar();
       p.buscar();
       p.setVisible(true);
       

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
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventas().setVisible(true);
            }
        });
    }
//    void buscar() {
//        String iidd = numfact.getText();
//        try {
//            int numbusq = Integer.parseInt(iidd);
//            PreparedStatement ps = (PreparedStatement) cn.prepareStatement("SELECT * FROM maselu WHERE Numfact = ?");
//            ps.setInt(1, numbusq);
//            java.sql.ResultSet rs = ps.executeQuery();
//            if (rs.next()) {
//                Factura h = new Factura();
//                h.entrardatos(
//           rs.getDate("Fecha").toString(),  // DATE
//                rs.getInt("Numfact"),
//                rs.getString("Nombre"),
//                rs.getString("Apellido"),
//                rs.getInt("Cedula"),
//                rs.getInt("Telefono"),
//                rs.getString("Correo"),
//                rs.getInt("P1"),
//                rs.getInt("P2"),
//                rs.getInt("P3"),
//                rs.getInt("P4"),
//                rs.getInt("P5"),
//                rs.getInt("P6"),
//                rs.getInt("P7"),
//                rs.getInt("P8"),
//                rs.getInt("P9"),
//                rs.getInt("P10"),
//                rs.getBigDecimal("Subtotal").toString(),  // DECIMAL
//                rs.getBigDecimal("IVA").toString(),      // DECIMAL
//                rs.getBigDecimal("ICA").toString(),      // DECIMAL
//                rs.getBigDecimal("Retefuente").toString(), // DECIMAL
//                rs.getBigDecimal("AUOD").toString(),     // DECIMAL
//                rs.getBigDecimal("Total").toString()     // DECIMAL     
//            );
//            h.setVisible(true);
//        } else {
//            JOptionPane.showMessageDialog(null, "No se encontraron datos para el número de factura: " + numbusq);
//        }
//
//            
//
//        } catch (Exception e) {
//            e.printStackTrace();
//                    JOptionPane.showMessageDialog(null, "Error al buscar los datos: " + e.getMessage());
//
//        }
//    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}