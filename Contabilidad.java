
package maselu;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;




/**
 *
 * @author santi
 */
public class Contabilidad extends javax.swing.JFrame {
    Conectar cc = new Conectar();
    Connection cn = cc.Conexion();
    Statement st;
    ResultSet rs;
    int Tiva, Tica, Trete =0;
    
    public Contabilidad() {
        initComponents();
        setLocationRelativeTo(this);
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("Fecha");
    modelo.addColumn("Factura");
    modelo.addColumn("IVA");
    modelo.addColumn("ICA");
    modelo.addColumn("RETEFUENTE");
    tabliña.setModel(modelo);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabliña = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ivames = new javax.swing.JTextField();
        icames = new javax.swing.JTextField();
        retemes = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Fecha2 = new javax.swing.JTextField();
        Fecha1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 90, 30));

        tabliña.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Factura", "IVA", "ICA", "Retefuente"
            }
        ));
        jScrollPane1.setViewportView(tabliña);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 540, 250));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mes y año donde buscar impuestos:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Retefuente Total:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 330, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fecha Fin:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 90, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Iva Total:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, 90, -1));

        ivames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ivamesActionPerformed(evt);
            }
        });
        jPanel1.add(ivames, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 230, 120, -1));
        jPanel1.add(icames, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 150, 120, -1));

        retemes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retemesActionPerformed(evt);
            }
        });
        jPanel1.add(retemes, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 330, 120, -1));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 410, 110, -1));

        Fecha2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fecha2ActionPerformed(evt);
            }
        });
        jPanel1.add(Fecha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 80, -1));

        Fecha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fecha1ActionPerformed(evt);
            }
        });
        jPanel1.add(Fecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 80, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ica Total:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 90, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fecha Inicio:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 90, -1));

        fondo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maselu/fondo.jpg"))); // NOI18N
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ivamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ivamesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ivamesActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
    buscarEntreFechas();

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void retemesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retemesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_retemesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Sesion abrir = new Sesion();
        abrir.setVisible(true);
        this.setVisible(false);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Fecha2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fecha2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Fecha2ActionPerformed

    private void Fecha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fecha1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Fecha1ActionPerformed

   
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
            java.util.logging.Logger.getLogger(Contabilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Contabilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Contabilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Contabilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Contabilidad().setVisible(true);
            }
        });
    }
    
  public void buscarEntreFechas() {
    String fechaInicio = Fecha1.getText(); // en el formato año-mes-dia"2024-05-01"
    String fechaFin = Fecha2.getText();       

    if (fechaInicio.isEmpty() || fechaFin.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Por favor introduzca ambas fechas");
        return;
    }

    Tiva = 0;
    Tica = 0;
    Trete = 0;

    DefaultTableModel modelo = (DefaultTableModel) tabliña.getModel();
    modelo.setRowCount(0);

    try {
        String sql = "SELECT Fecha, NumFact, IVA, ICA, Retefuente FROM maselu WHERE STR_TO_DATE(fecha, '%Y-%m-%d') BETWEEN ? AND ?";
        PreparedStatement ps = cn.prepareStatement(sql);
        ps.setString(1, fechaInicio);
        ps.setString(2, fechaFin);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            String fecha = rs.getString("Fecha");
            int numfact = rs.getInt("Numfact");
            int iva = rs.getInt("IVA");
            int ica = rs.getInt("ICA");
            int retefuente = rs.getInt("Retefuente");

            Tiva += iva;
            Tica += ica;
            Trete += retefuente;

            modelo.addRow(new Object[]{fecha, numfact, iva, ica, retefuente});
        }

        ivames.setText(Integer.toString(Tiva));
        icames.setText(Integer.toString(Tica));
        retemes.setText(Integer.toString(Trete));

    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos");
    }
}
    
////    
//////    public void buscarfecha(){
//////        String Sfecha = FeSfechacha.getText();
//////        if(Sfecha==null){
//////            JOptionPane.showMessageDialog(null, "Por favor seleccione una fecha");
//////            
//////        }
//////        Calendar cal = Calendar.getInstance();
//////        cal.setTime(Sfecha);
//////        int mes = cal.get(Calendar.MONTH)+1;
//////        int año = cal.get(Calendar.YEAR);
//////        Tiva = 0;
//////        Tica = 0;
//////        Trete = 0;
//////         DefaultTableModel modelo = (DefaultTableModel) tabliña.getModel();
//////        modelo.setRowCount(0);
//////        
//////        
//////        try {
//////        String sql = "SELECT Fecha, NumFact, IVA, ICA, Retefuente FROM maselu WHERE MONTH(STR_TO_DATE(fecha, '%Y-%m-%d')) = ? AND YEAR(STR_TO_DATE(fecha, '%Y-%m-%d')) = ?";
//////        PreparedStatement ps = (PreparedStatement) cn.prepareStatement(sql);
//////        ps.setInt(1, mes);
//////        ps.setInt(2, año);
//////        java.sql.ResultSet rs = ps.executeQuery();
//////            while (rs.next()) {
//////                String fecha = rs.getString("Fecha");
//////                int numfact = rs.getInt("Numfact");
//////                int iva = rs.getInt("IVA");
//////                int ica = rs.getInt("ICA");
//////                int retefuente = rs.getInt("Retefuente");
//////                Tiva += iva;
//////                Tica += ica;
//////                Trete += retefuente;
//////                modelo.addRow(new Object[]{fecha, numfact, iva, ica, retefuente});
//////
//////                
//////            }
//////                ivames.setText(Integer.toString(Tiva));
//////                icames.setText(Integer.toString(Tica));
//////                retemes.setText(Integer.toString(Trete));
//////
//////        } catch (Exception e) {
//////            e.printStackTrace();
//////            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos");
//////            
//////        }
//////    }
//////    
   
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Fecha1;
    private javax.swing.JTextField Fecha2;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel fondo;
    private javax.swing.JTextField icames;
    private javax.swing.JTextField ivames;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField retemes;
    private javax.swing.JTable tabliña;
    // End of variables declaration//GEN-END:variables
}
