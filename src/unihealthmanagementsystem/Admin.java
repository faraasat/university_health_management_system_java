package unihealthmanagementsystem;

import static java.lang.System.exit;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Admin extends javax.swing.JFrame {
 
    public Admin() {
        initComponents();
        ImageIcon img = new ImageIcon("src\\icon\\LoginIcoSm.png");
        this.setIconImage(img.getImage());
    }
    
    dbClass db = new dbClass();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        passPass = new javax.swing.JPasswordField();
        BtnOk = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnAdminMode = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Login");
        setMinimumSize(new java.awt.Dimension(430, 230));
        setPreferredSize(new java.awt.Dimension(430, 230));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/loginIcoLg.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 40, 100, 100);

        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        getContentPane().add(txtUser);
        txtUser.setBounds(200, 60, 180, 30);

        passPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passPassActionPerformed(evt);
            }
        });
        getContentPane().add(passPass);
        passPass.setBounds(200, 100, 180, 30);

        BtnOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/tick.png"))); // NOI18N
        BtnOk.setText("Ok");
        BtnOk.setToolTipText("Ok to proceed");
        BtnOk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnOkActionPerformed(evt);
            }
        });
        getContentPane().add(BtnOk);
        BtnOk.setBounds(170, 150, 100, 30);

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cross.png"))); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.setToolTipText("Cancel to Exit");
        btnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
        });
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel);
        btnCancel.setBounds(280, 150, 100, 30);

        btnAdminMode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/adminLogIco.png"))); // NOI18N
        btnAdminMode.setText("User Mode");
        btnAdminMode.setToolTipText("Go to Admin Mode");
        btnAdminMode.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdminMode.setFocusPainted(false);
        btnAdminMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminModeActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdminMode);
        btnAdminMode.setBounds(270, 10, 130, 30);

        jLabel6.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel6.setText("Admin Login");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(90, 10, 160, 30);

        jLabel5.setText("UHM System 2020");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 160, 140, 16);

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel4.setText("Password");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(120, 100, 70, 20);

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel3.setText("Username");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(120, 60, 70, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/loginImg.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 479, 240);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdminModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminModeActionPerformed
        Login login = new Login();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAdminModeActionPerformed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void BtnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnOkActionPerformed
        try {
            db.Connect();
            ResultSet rs = db.findUsername(txtUser.getText(), "adminLogin");
            if(txtUser.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Please enter the username");
            } else if(rs == null){
                JOptionPane.showMessageDialog(null, "User not Found", "Error", JOptionPane.ERROR_MESSAGE);                
            } else if(passPass.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Please Enter Password");
            } else if(rs.getString(3).equals(passPass.getText())) {
                AdminPanel au = new AdminPanel();
                au.setVisible(true);
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Password Incorrect", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_BtnOkActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        exit(0);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelMouseClicked

    private void passPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passPassActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnOk;
    private javax.swing.JButton btnAdminMode;
    private javax.swing.JButton btnCancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField passPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
