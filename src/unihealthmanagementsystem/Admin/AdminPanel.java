package unihealthmanagementsystem.Admin;

import javax.swing.ImageIcon;

public class AdminPanel extends javax.swing.JFrame {

    // Constructor
    public AdminPanel() {
        initComponents();
        ImageIcon img = new ImageIcon("src\\icon\\LoginIcoSm.png");
        this.setIconImage(img.getImage());
    }
    
    // Creating Instance
    private static AdminPanel instance = null;
    public static AdminPanel getInstance() {
        if(instance == null)
            instance = new AdminPanel();
        return instance;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pp4 = new javax.swing.JPanel();
        txtPp4 = new javax.swing.JLabel();
        pp2 = new javax.swing.JPanel();
        txtPp2 = new javax.swing.JLabel();
        pp3 = new javax.swing.JPanel();
        txtPp3 = new javax.swing.JLabel();
        pp1 = new javax.swing.JPanel();
        txtPp1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Panel");
        setMinimumSize(new java.awt.Dimension(389, 525));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0,104,234,150));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 44)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 194, 38));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ADMIN PANEL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 70);

        jPanel2.setBackground(new java.awt.Color(204,255,255,100));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setForeground(new java.awt.Color(51, 255, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pp4.setBackground(new java.awt.Color(204, 255, 204));
        pp4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pp4.setForeground(new java.awt.Color(102, 0, 255));
        pp4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtPp4.setBackground(new java.awt.Color(204, 255, 204));
        txtPp4.setFont(new java.awt.Font("Times New Roman", 1, 19)); // NOI18N
        txtPp4.setForeground(new java.awt.Color(102, 102, 255));
        txtPp4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPp4.setText("View User Details");
        txtPp4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        txtPp4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPp4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pp4Layout = new javax.swing.GroupLayout(pp4);
        pp4.setLayout(pp4Layout);
        pp4Layout.setHorizontalGroup(
            pp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtPp4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
        );
        pp4Layout.setVerticalGroup(
            pp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtPp4, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jPanel2.add(pp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        pp2.setBackground(new java.awt.Color(204, 255, 204));
        pp2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pp2.setForeground(new java.awt.Color(102, 0, 255));
        pp2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtPp2.setFont(new java.awt.Font("Times New Roman", 1, 19)); // NOI18N
        txtPp2.setForeground(new java.awt.Color(102, 102, 255));
        txtPp2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPp2.setText("Add Admin");
        txtPp2.setToolTipText("");
        txtPp2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        txtPp2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPp2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pp2Layout = new javax.swing.GroupLayout(pp2);
        pp2.setLayout(pp2Layout);
        pp2Layout.setHorizontalGroup(
            pp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtPp2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pp2Layout.setVerticalGroup(
            pp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtPp2, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jPanel2.add(pp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 329, -1));

        pp3.setBackground(new java.awt.Color(204, 255, 204));
        pp3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pp3.setForeground(new java.awt.Color(102, 0, 255));
        pp3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtPp3.setBackground(new java.awt.Color(204, 255, 204));
        txtPp3.setFont(new java.awt.Font("Times New Roman", 1, 19)); // NOI18N
        txtPp3.setForeground(new java.awt.Color(102, 102, 255));
        txtPp3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPp3.setText("Delete User");
        txtPp3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        txtPp3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPp3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pp3Layout = new javax.swing.GroupLayout(pp3);
        pp3.setLayout(pp3Layout);
        pp3Layout.setHorizontalGroup(
            pp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtPp3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pp3Layout.setVerticalGroup(
            pp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtPp3, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jPanel2.add(pp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 329, -1));

        pp1.setBackground(new java.awt.Color(204, 255, 204));
        pp1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pp1.setForeground(new java.awt.Color(102, 0, 255));
        pp1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtPp1.setBackground(new java.awt.Color(0, 102, 51));
        txtPp1.setFont(new java.awt.Font("Times New Roman", 1, 19)); // NOI18N
        txtPp1.setForeground(new java.awt.Color(102, 102, 255));
        txtPp1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPp1.setText("Add user");
        txtPp1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        txtPp1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPp1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pp1Layout = new javax.swing.GroupLayout(pp1);
        pp1.setLayout(pp1Layout);
        pp1Layout.setHorizontalGroup(
            pp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtPp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pp1Layout.setVerticalGroup(
            pp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtPp1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jPanel2.add(pp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 329, -1));

        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logout.png"))); // NOI18N
        btnBack.setText("Logout");
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });
        jPanel2.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 230, 50));

        getContentPane().add(jPanel2);
        jPanel2.setBounds(-10, 70, 410, 450);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/3040791.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 3000, 2000);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // txtPp1MouseClicked Mouse Event
    private void txtPp1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPp1MouseClicked
        
        AddUser addUser = AddUser.getInstance();
        this.setVisible(false);
        addUser.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_txtPp1MouseClicked

    // txtPp4MouseClicked Mouse Event
    private void txtPp4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPp4MouseClicked
        
        UserDetail userDetails = UserDetail.getInstance();
        userDetails.setVisible(true);
        this.setVisible(false);
        this.dispose();
        
    }//GEN-LAST:event_txtPp4MouseClicked

    // txtPp3MouseClicked Mouse Event
    private void txtPp3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPp3MouseClicked
        
        DeleteUser deleteUser = DeleteUser.getInstance();
        deleteUser.setVisible(true);
        this.setVisible(false);
        this.dispose();
        
    }//GEN-LAST:event_txtPp3MouseClicked

    // txtPp2MouseClicked Mouse Event
    private void txtPp2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPp2MouseClicked
        
        AddAdmin addAdmin = AddAdmin.getInstance();
        addAdmin.setVisible(true);
        this.setVisible(false);
        this.dispose();
        
    }//GEN-LAST:event_txtPp2MouseClicked

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        
        Admin admin = Admin.getInstance();
        admin.setVisible(true);
        this.setVisible(false);
        this.dispose();
        
    }//GEN-LAST:event_btnBackMouseClicked

    // Main Mehtod
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new AdminPanel().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel pp1;
    private javax.swing.JPanel pp2;
    private javax.swing.JPanel pp3;
    private javax.swing.JPanel pp4;
    private javax.swing.JLabel txtPp1;
    private javax.swing.JLabel txtPp2;
    private javax.swing.JLabel txtPp3;
    private javax.swing.JLabel txtPp4;
    // End of variables declaration//GEN-END:variables
}
