package unihealthmanagementsystem.User;

import java.awt.HeadlessException;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
import unihealthmanagementsystem.dbClass;
import unihealthmanagementsystem.oop.UniDReader;

public class DiagnosticDetails extends javax.swing.JFrame {
    
    public DiagnosticDetails() {
        initComponents();
        ImageIcon img = new ImageIcon("src\\icon\\AdminIcoSm.png");
        this.setIconImage(img.getImage());
        fetchData();
    }
    
    dbClass dc = new dbClass();
    
    public void fetchData(){
        dc.Connect();
        ResultSet rs = dc.getDiaDetails();
        tblShow.setModel(DbUtils.resultSetToTableModel(rs));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblShow = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Diagnostic Details");
        setMinimumSize(new java.awt.Dimension(1000, 650));
        setResizable(false);
        getContentPane().setLayout(null);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        tblShow.setModel(new javax.swing.table.DefaultTableModel(
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
        tblShow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblShowMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblShow);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 110, 1000, 490);

        jPanel1.setBackground(new java.awt.Color(204,0,204,150));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Diagnostic Details");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(2, 2, 980, 50);

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
        jPanel2.setBounds(710, 60, 220, 40);

        btnBack.setText("Back");
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });
        jPanel1.add(btnBack);
        btnBack.setBounds(50, 60, 90, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1000, 110);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/3574.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 980, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        Login lg = new Login();
        lg.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnBackMouseClicked

    private void btnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseClicked
        try{
            if(txtSearch.getText().equals("")){
                fetchData();
            } else{
                dc.Connect();
                ResultSet res = dc.getDiaDetails(txtSearch.getText(), txtSearch.getText());
                if(res != null){
                    DefaultTableModel model = (DefaultTableModel)this.tblShow.getModel();
                    model.setRowCount(0);
                    tblShow.setModel(DbUtils.resultSetToTableModel(res));
                } else if(res == null){
                    JOptionPane.showMessageDialog(null, "User not found");
                    fetchData();
                }
            } 
        } catch(HeadlessException ex){ 
           JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnSearchMouseClicked

    private void tblShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblShowMouseClicked
        int index = tblShow.getSelectedRow();
        TableModel model = tblShow.getModel();
        String val1 = (String) model.getValueAt(index, 2);
        String val2 = (String) model.getValueAt(index, 9);
        UniDReader un = new UniDReader();
        String st = un.Read(val1, val2);
        ShowResults sr = new ShowResults();
        switch (val2) {
            case "Student":
                sr.stuSplitter(st);
                break;
            case "Faculty":
                sr.FacSplitter(st);
                break;
            case "Worker":
                sr.WorSplitter(st);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_tblShowMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DiagnosticDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new DiagnosticDetails().setVisible(true);
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
    private javax.swing.JTable tblShow;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
