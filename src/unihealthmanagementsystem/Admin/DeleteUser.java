package unihealthmanagementsystem.Admin;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import unihealthmanagementsystem.DbClass;

public class DeleteUser extends javax.swing.JFrame {

    // Objects, Variables and Instances
    DbClass dbClass = DbClass.getInstance();
    
    // Constructor
    public DeleteUser() {
        initComponents();
        ImageIcon img = new ImageIcon("src\\icon\\LoginIcoSm.png");
        this.setIconImage(img.getImage());
        btnDelete.setVisible(false);
    }
    
    // Creating Instance
    private static DeleteUser instance = null;
    public static DeleteUser getInstance() {
        if(instance == null)
            instance = new DeleteUser();
        return instance;
    }
    
    // Swing Generated Code
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnDetails = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDet = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Delete User");
        setMinimumSize(new java.awt.Dimension(400, 450));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255,204,204,255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel3.setText("Enter Username:");

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/backIco.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });

        btnDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/detIco.png"))); // NOI18N
        btnDetails.setText("Details");
        btnDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDetailsMouseClicked(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delIco.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });

        jScrollPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtDet.setEditable(false);
        txtDet.setColumns(20);
        txtDet.setRows(5);
        jScrollPane1.setViewportView(txtDet);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(40, 40, 40)
                        .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 50, 400, 370);

        jPanel1.setBackground(new java.awt.Color(204,0,204,150));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Delete User");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/3574.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 500, 440);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // btnBackMouseClicked Mouse Event
    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        
        AdminPanel ap = AdminPanel.getInstance();
        ap.setVisible(true);
        this.setVisible(false);
        txtUser.setText("");
        this.dispose();
        
    }//GEN-LAST:event_btnBackMouseClicked

    // btnDetailsMouseClicked Mouse Event
    private void btnDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDetailsMouseClicked
        
        dbClass.Connect();
        ResultSet rs = dbClass.findUsername(txtUser.getText(), "UserLogin");
        
        try {
            if(rs == null){
                JOptionPane.showMessageDialog(null, "User not found!");
            }
            txtDet.setText("ID: \t" + rs.getString(1) + "\nUsername: \t" + rs.getString(2)
            + "\nPassword: \t" + rs.getString(3) + "\nEmail: \t" + rs.getString(4)
            + "\nSalary: \t" + rs.getString(7) + "\nAddress: \t" + rs.getString(5)
            + "\nMobile: \t" + rs.getString(6));
            btnDelete.setVisible(true);
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Exception: \n" + ex, "Error", JOptionPane.ERROR_MESSAGE);
        } 
        catch (NullPointerException ex) { }
        
    }//GEN-LAST:event_btnDetailsMouseClicked

    // btnDeleteMouseClicked Mouse Event
    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        
        int a = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete user?");
        switch (a) {
            case 0:
                dbClass.Connect();
                boolean val = dbClass.deleteUser(txtUser.getText(), "userLogin");
                if(!val){
                    JOptionPane.showMessageDialog(null, "Deleted Successfully!");
                    txtDet.setText("");
                } else{
                    JOptionPane.showMessageDialog(null, "Error Deletin!g");
                }   break;
            case 2:
                txtDet.setText("");
                break;
            case 1:
                break;
            default:
                break;
        }
        
    }//GEN-LAST:event_btnDeleteMouseClicked

    // Main Method
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new DeleteUser().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDetails;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtDet;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
