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
public class subjects extends javax.swing.JFrame {

    /**
     * Creates new form subjects
     */
    public subjects() {
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

        lblsubjectname = new javax.swing.JLabel();
        txtsubjectname = new javax.swing.JTextField();
        lbldescription = new javax.swing.JLabel();
        txtdescription = new javax.swing.JTextField();
        lbltestmaxmarks = new javax.swing.JLabel();
        txttestmaxmarks = new javax.swing.JTextField();
        lblexammaxmarks = new javax.swing.JLabel();
        txtexammaxmarks = new javax.swing.JTextField();
        btnaddsubjectinfo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("s");
        setBackground(new java.awt.Color(255, 51, 51));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        lblsubjectname.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblsubjectname.setText("Subject Name");

        txtsubjectname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsubjectnameActionPerformed(evt);
            }
        });

        lbldescription.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbldescription.setText("Description");

        lbltestmaxmarks.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbltestmaxmarks.setText("Test Marks(Max)");

        lblexammaxmarks.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblexammaxmarks.setText("Exam Marks(Max)");

        btnaddsubjectinfo.setText("Add Subject Info");
        btnaddsubjectinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddsubjectinfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblexammaxmarks, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(lbltestmaxmarks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbldescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblsubjectname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtsubjectname)
                            .addComponent(txtdescription)
                            .addComponent(txttestmaxmarks)
                            .addComponent(txtexammaxmarks, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(btnaddsubjectinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblsubjectname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsubjectname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldescription, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdescription, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltestmaxmarks, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttestmaxmarks, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblexammaxmarks, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtexammaxmarks, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnaddsubjectinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtsubjectnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsubjectnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsubjectnameActionPerformed

    private void btnaddsubjectinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddsubjectinfoActionPerformed
        // TODO add your handling code here:
        if(evt.getActionCommand().equals("Add Subject Info"))
        {
            try
            {
                st = objcn.cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
                rs = st.executeQuery("select subjectname,description,testmarks,exammarks from subjects");
                if(rs!=null)
                {
                    rs.moveToInsertRow();
                    rs.updateString("subjectname",txtsubjectname.getText());
                    rs.updateString("description",txtdescription.getText());
                    rs.updateString("testmarks",txttestmaxmarks.getText());
                    rs.updateString("exammarks",txtexammaxmarks.getText());
                    rs.insertRow();
                }
            }
            catch(SQLException sqle)
            {

            }
        }
    }//GEN-LAST:event_btnaddsubjectinfoActionPerformed

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
            java.util.logging.Logger.getLogger(subjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(subjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(subjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(subjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new subjects().setVisible(true);
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
    private javax.swing.JButton btnaddsubjectinfo;
    private javax.swing.JLabel lbldescription;
    private javax.swing.JLabel lblexammaxmarks;
    private javax.swing.JLabel lblsubjectname;
    private javax.swing.JLabel lbltestmaxmarks;
    private javax.swing.JTextField txtdescription;
    private javax.swing.JTextField txtexammaxmarks;
    private javax.swing.JTextField txtsubjectname;
    private javax.swing.JTextField txttestmaxmarks;
    // End of variables declaration//GEN-END:variables
}
