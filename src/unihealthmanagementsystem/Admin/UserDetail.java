package unihealthmanagementsystem.Admin;

import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import unihealthmanagementsystem.dbClass;

public class UserDetail extends javax.swing.JFrame {

    public UserDetail() {
        initComponents();
        ImageIcon img = new ImageIcon("src\\icon\\LoginIcoSm.png");
        this.setIconImage(img.getImage());
        fetchData();
    }
    
    dbClass dc = new dbClass();
    
    public void fetchData(){
        dc.Connect();
        ResultSet rs = dc.userDetails();
        tblUser.setModel(DbUtils.resultSetToTableModel(rs));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblUser = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("User Details");
        setMinimumSize(new java.awt.Dimension(850, 550));
        getContentPane().setLayout(null);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        tblUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Username", "Password", "Email", "Salary", "Address", "Mobile"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.Long.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblUser);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 110, 840, 410);

        jPanel1.setBackground(new java.awt.Color(204,0,204,150));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("User Details");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(2, 2, 833, 50);

        jPanel2.setLayout(null);
        jPanel2.add(txtSearch);
        txtSearch.setBounds(0, 0, 170, 40);

        btnSearch.setBackground(new java.awt.Color(255, 255, 204));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/searcIco.png"))); // NOI18N
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchMouseClicked(evt);
            }
        });
        jPanel2.add(btnSearch);
        btnSearch.setBounds(170, 0, 50, 40);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(540, 60, 220, 40);

        btnBack.setText("Back");
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });
        jPanel1.add(btnBack);
        btnBack.setBounds(50, 60, 90, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 840, 110);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/3574.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 940, 580);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        AdminPanel ap = new AdminPanel();
        ap.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnBackMouseClicked

    private void btnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseClicked
        try{
            if(txtSearch.getText().equals("")){
                fetchData();
            } else{
                dc.Connect();
                ResultSet res = dc.SearchName(txtSearch.getText(), "userLogin");
                if(res != null){
                    DefaultTableModel model = (DefaultTableModel)this.tblUser.getModel();
                    model.setRowCount(0);
                    model.addRow(new Object[]{res.getString(1), res.getString(2), res.getString(3), res.getString(4),
                    res.getString(6), res.getString(7), res.getString(5)});    
                }else if(res == null){
                    System.out.println("");
                    JOptionPane.showMessageDialog(null, "User not found");
                    fetchData();
                } 
            } 
        } catch(HeadlessException | SQLException ex){ 
           JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnSearchMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new UserDetail().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblUser;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
