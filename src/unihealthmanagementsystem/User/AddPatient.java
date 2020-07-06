package unihealthmanagementsystem.User;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class AddPatient extends javax.swing.JFrame {
    
    // Constructor
    public AddPatient() {
        initComponents();
        ImageIcon img = new ImageIcon("src\\icon\\AdminIcoSm.png");
        this.setIconImage(img.getImage());
    }
    
    // Creating Instance
    private static AddPatient instance = null;
    public static AddPatient getInstance() {
        if(instance == null)
            instance = new AddPatient();
        return instance;
    }

    // Swing Generated Code
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnPro = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        comSel = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel10.setText("Enter Address:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Patient");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0,104,234,100));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setBackground(new java.awt.Color(255, 190, 134));
        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 190, 134));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Add Patient Panel:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 50));

        btnPro.setText("Proceed");
        btnPro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProMouseClicked(evt);
            }
        });
        getContentPane().add(btnPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 190, 100, 40));

        btnBack.setText("Back");
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 100, 40));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Select Category:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 190, -1));

        comSel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Student", "Faculty", "Worker" }));
        getContentPane().add(comSel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 230, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/3574.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 250));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // btnBackMouseClicked Mouse Event
    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        
        PatientPanel patientPanel = PatientPanel.getInstance();
        patientPanel.setVisible(true);
        this.setVisible(false);
        this.dispose();
        
    }//GEN-LAST:event_btnBackMouseClicked
    
    // btnProMouseClicked Mouse Event
    private void btnProMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProMouseClicked
        
        String selection = comSel.getSelectedItem().toString();
        switch (selection) {
            case "Student":
                AddPStu ap = new AddPStu();
                ap.setVisible(true);
                this.setVisible(false);
                break;
            case "Faculty":
                AddPFac af = new AddPFac();
                af.setVisible(true);
                this.setVisible(false);
                break;
            case "Worker":
                AddPWor aw = new AddPWor();
                aw.setVisible(true);
                this.setVisible(false);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Please make a selection");
                break;
        }
        
    }//GEN-LAST:event_btnProMouseClicked

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
            java.util.logging.Logger.getLogger(AddPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new AddPatient().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnPro;
    private javax.swing.JComboBox<String> comSel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
