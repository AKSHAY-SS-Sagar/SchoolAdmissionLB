/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package schooladmisssion;
import java.sql.*;
/**
 *
 * @author Administrator
 */
public class fee extends javax.swing.JFrame {

    /**
     * Creates new form fee
     */
    public fee() {
        objcn = new DBConnection();
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

        lblapplication = new javax.swing.JLabel();
        txtappication = new javax.swing.JTextField();
        lbltution = new javax.swing.JLabel();
        txttuition = new javax.swing.JTextField();
        lblcomputer = new javax.swing.JLabel();
        txtcomputer = new javax.swing.JTextField();
        lblsmartclass = new javax.swing.JLabel();
        txtsmartclass = new javax.swing.JTextField();
        lbldevelopment = new javax.swing.JLabel();
        txtdevelopment = new javax.swing.JTextField();
        lblentery = new javax.swing.JLabel();
        txtentry = new javax.swing.JTextField();
        lbltc = new javax.swing.JLabel();
        txttc = new javax.swing.JTextField();
        lblcertificate = new javax.swing.JLabel();
        txtcertificate = new javax.swing.JTextField();
        lblstaffconcession = new javax.swing.JLabel();
        txtstaffconcession = new javax.swing.JTextField();
        lblclassfrom = new javax.swing.JLabel();
        btnaddstudentinfo = new javax.swing.JButton();
        lblclassto = new javax.swing.JLabel();
        txtclassfrom = new javax.swing.JTextField();
        txtclassto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setEnabled(false);

        lblapplication.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblapplication.setText("Application Fee");

        lbltution.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbltution.setText("Tuition Fee");

        lblcomputer.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblcomputer.setText("Computer Fee");

        lblsmartclass.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblsmartclass.setText("Smartclass Fee");

        lbldevelopment.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbldevelopment.setText("Development Fee");

        lblentery.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblentery.setText("Entery Fee");

        lbltc.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbltc.setText("TC Fee");

        lblcertificate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblcertificate.setText("Certificate Fee");

        lblstaffconcession.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblstaffconcession.setText("Staff Concession");

        lblclassfrom.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblclassfrom.setText("Class From");

        btnaddstudentinfo.setText("Add Student Info");
        btnaddstudentinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddstudentinfoActionPerformed(evt);
            }
        });

        lblclassto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblclassto.setText("Class To");

        txtclassfrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtclassfromActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblclassto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblclassfrom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblstaffconcession, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblcertificate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbltc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblentery, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbldevelopment, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(lblsmartclass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblcomputer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbltution, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblapplication, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtappication)
                            .addComponent(txttuition)
                            .addComponent(txtcomputer)
                            .addComponent(txtsmartclass)
                            .addComponent(txtdevelopment)
                            .addComponent(txtentry)
                            .addComponent(txttc)
                            .addComponent(txtcertificate)
                            .addComponent(txtstaffconcession)
                            .addComponent(txtclassfrom)
                            .addComponent(txtclassto, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(btnaddstudentinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(210, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblapplication, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtappication, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltution, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttuition, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcomputer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcomputer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblsmartclass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsmartclass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldevelopment, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdevelopment, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblentery, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtentry, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcertificate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcertificate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblstaffconcession, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtstaffconcession, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblclassfrom, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(txtclassfrom))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblclassto, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(txtclassto))
                .addGap(33, 33, 33)
                .addComponent(btnaddstudentinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(359, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddstudentinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddstudentinfoActionPerformed
        // TODO add your handling code here:
        if(evt.getActionCommand().equals("Add Student Info"))
        {
            try
            {
                st = objcn.cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
                rs = st.executeQuery("select application,tution,computer,smartclass,development,entry,tc,certificate,classfrom,classto,staffconcession from  fee");
                if(rs!=null)
                {
                    rs.moveToInsertRow();
                    rs.updateString("application",txtappication.getText());
                    rs.updateString("tution",txttuition.getText());
                    rs.updateString("computer",txtcomputer.getText());
                    rs.updateString("smartclass",txtsmartclass.getText());
                    rs.updateString("development",txtdevelopment.getText());
                    rs.updateString("entry",txtentry.getText());
                    rs.updateString("tc",txttc.getText());
                    rs.updateString("certificate",txtcertificate.getText());
                    rs.updateString("classfrom",txtclassfrom.getText());
                    rs.updateString("classto",txtclassto.getText());
                    rs.updateString("staffconcession",txtstaffconcession.getText());
                    rs.insertRow();
                }
            }
            catch(SQLException sqle)
            {

            }
        }
    }//GEN-LAST:event_btnaddstudentinfoActionPerformed

    private void txtclassfromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtclassfromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtclassfromActionPerformed

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
            java.util.logging.Logger.getLogger(fee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fee().setVisible(true);
            }
        });
    }

    //dbconnection object
     DBConnection objcn;
     //Statement st
    Statement st;
    //ResultSet
    ResultSet rs;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddstudentinfo;
    private javax.swing.JLabel lblapplication;
    private javax.swing.JLabel lblcertificate;
    private javax.swing.JLabel lblclassfrom;
    private javax.swing.JLabel lblclassto;
    private javax.swing.JLabel lblcomputer;
    private javax.swing.JLabel lbldevelopment;
    private javax.swing.JLabel lblentery;
    private javax.swing.JLabel lblsmartclass;
    private javax.swing.JLabel lblstaffconcession;
    private javax.swing.JLabel lbltc;
    private javax.swing.JLabel lbltution;
    private javax.swing.JTextField txtappication;
    private javax.swing.JTextField txtcertificate;
    private javax.swing.JTextField txtclassfrom;
    private javax.swing.JTextField txtclassto;
    private javax.swing.JTextField txtcomputer;
    private javax.swing.JTextField txtdevelopment;
    private javax.swing.JTextField txtentry;
    private javax.swing.JTextField txtsmartclass;
    private javax.swing.JTextField txtstaffconcession;
    private javax.swing.JTextField txttc;
    private javax.swing.JTextField txttuition;
    // End of variables declaration//GEN-END:variables
}
