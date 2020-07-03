package unihealthmanagementsystem.User;

import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import unihealthmanagementsystem.dbClass;

public class AddPWor extends javax.swing.JFrame {

    public AddPWor() {
        initComponents();
        ImageIcon img = new ImageIcon("src\\icon\\AdminIcoSm.png");
        this.setIconImage(img.getImage());
        txtOW.setVisible(false);
        lblOW.setVisible(false);
    }
    
    dbClass dc = new dbClass();
    PatientPanel pp = new PatientPanel();
    static boolean isEmailValid(String email) {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);
    }
    private String Selection(){
        String s = comWork.getSelectedItem().toString();
        if(s.equals("Sweeper") || s.equals("ShopKeeper") || s.equals("Assistant")){
            return s;
        } else if(s.equals("Other")){
            return txtOW.getText();
        }
        return "";
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        txtCnic = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtGuard = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        btnOk = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtRegNo = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        comGen = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        comWork = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        comHandi = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        txtMobile = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        comShift = new javax.swing.JComboBox<>();
        comTrack = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        comMed = new javax.swing.JComboBox<>();
        comPsyco = new javax.swing.JComboBox<>();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        txtLandline = new javax.swing.JTextField();
        txtDob = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtJoin = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        txtSalary = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        comBlood1 = new javax.swing.JComboBox<>();
        lblOW = new javax.swing.JLabel();
        txtOW = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Worker");
        setMinimumSize(new java.awt.Dimension(955, 674));
        setResizable(false);
        getContentPane().setLayout(null);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txtCnic, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 216, 31));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel21.setText("Enter Date of Birth:");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 170, 31));
        jPanel1.add(txtGuard, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 40, 210, 31));

        btnCancel.setText("Cancel");
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
        });
        jPanel1.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 740, 140, 40));

        btnOk.setText("Proceed");
        btnOk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOkMouseClicked(evt);
            }
        });
        jPanel1.add(btnOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 740, 140, 40));
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 216, 31));

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel23.setText("Enter Patient Name:");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 170, 31));
        jPanel1.add(txtRegNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 216, 31));

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel25.setText("Enter Registration No:");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 170, 31));

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel26.setText("Enter CNIC No:");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 170, 31));

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel27.setText("Select Gender:");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 180, 31));

        comGen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Male", "Female" }));
        jPanel1.add(comGen, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 170, 30));

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel28.setText("Enter Work:");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 180, 31));

        comWork.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Sweeper", "Shopkeeper", "Assistant", "Other" }));
        comWork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comWorkActionPerformed(evt);
            }
        });
        jPanel1.add(comWork, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 170, 30));

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel29.setText("Any Handicap?");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, 170, 31));
        jPanel1.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, 216, 31));

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel31.setText("Enter Address:");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 170, 31));

        comHandi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Yes", "No" }));
        jPanel1.add(comHandi, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 360, 220, 30));

        jLabel32.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel32.setText("Enter Mobile No:");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 170, 31));
        jPanel1.add(txtMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 500, 180, 31));

        jLabel15.setBackground(new java.awt.Color(204, 204, 255));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 204, 0));
        jLabel15.setText("+92");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 500, 50, 30));

        jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel33.setText("Enter Joining Date:");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 170, 31));

        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel34.setText("Select Shift:");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 170, 31));

        comShift.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Morning", "Evening" }));
        jPanel1.add(comShift, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 560, 210, 30));

        comTrack.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Good", "Average", "Below Average" }));
        jPanel1.add(comTrack, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 560, 220, 30));

        jLabel35.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel35.setText("Select Track Record:");
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 560, 180, 31));

        jLabel36.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel36.setText("Select Medical Insurane:");
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 620, 180, 31));

        comMed.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Yes", "No" }));
        jPanel1.add(comMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 620, 220, 30));

        comPsyco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Yes", "No" }));
        jPanel1.add(comPsyco, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 620, 210, 30));

        jLabel37.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel37.setText("Psycologically Fit?");
        jPanel1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, 170, 31));

        jLabel38.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel38.setText("Enter Landline No:");
        jPanel1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 680, 170, 31));
        jPanel1.add(txtLandline, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 680, 210, 31));
        jPanel1.add(txtDob, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 180, 210, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("* Please fill as specified: House No, Street No, City, State");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        jLabel45.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel45.setText("Enter Guardian Name:");
        jPanel1.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, 170, 31));

        jLabel43.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel43.setText("Enter Email:");
        jPanel1.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 440, 170, 31));
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 440, 216, 31));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jPanel1.add(txtJoin, new org.netbeans.lib.awtextra.AbsoluteConstraints(682, 110, 208, 30));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 793, 41, 16));
        jPanel1.add(txtSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 500, 220, 31));

        jLabel39.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel39.setText("Enter Salary:");
        jPanel1.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 500, 180, 31));

        jLabel40.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel40.setText("Enter Blood Group:");
        jPanel1.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 180, 31));

        comBlood1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "O+", "O-", "A+", "A-", "B+", "B-", "AB+", "AB-" }));
        jPanel1.add(comBlood1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 220, 30));

        lblOW.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblOW.setText("Enter Other Work:");
        jPanel1.add(lblOW, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, 180, 31));
        jPanel1.add(txtOW, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 280, 216, 31));

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 80, 950, 560);

        jPanel2.setBackground(new java.awt.Color(255,204,204,150));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 52)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(225, 119, 24));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Add Student:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 954, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 960, 80);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/3574.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 1060, 830);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
        dc.clearAll(this.getContentPane());
        PatientPanel ap = new PatientPanel();
        ap.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnCancelMouseClicked

    private void btnOkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOkMouseClicked
        dc.Connect();
        ResultSet rs = dc.findUsername(txtName.getText(), txtRegNo.getText() ,"patientDetails");
        if(txtName.getText().equals("") || txtGuard.getText().equals("") || txtRegNo.getText().equals("") || txtCnic.getText().equals("") || txtDob.getDate().equals("") || txtAddress.getText().equals("") || txtEmail.getText().equals("") || txtMobile.getText().equals("") || txtJoin.getDate().equals("") || txtLandline.getText().equals("") || comGen.getSelectedItem().toString().equals("Select") || comWork.getSelectedItem().toString().equals("Select") || comHandi.getSelectedItem().toString().equals("Select") || comShift.getSelectedItem().toString().equals("Select") || comPsyco.getSelectedItem().toString().equals("Select") || comMed.getSelectedItem().toString().equals("Select") || comTrack.getSelectedItem().toString().equals("Select") || txtSalary.getText().equals("") || comWork.getSelectedItem().toString().equals("")){
            JOptionPane.showMessageDialog(null, "All fields are mandatory");
        } else if(rs != null){
            JOptionPane.showMessageDialog(null, "Patient alredy exist");
        } else{
            try{
                Long mob = Long.parseLong(txtMobile.getText());
            } catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Please enter numeric value in mobile field");
            }
            boolean value = isEmailValid(txtEmail.getText());
            if(!value){
                JOptionPane.showMessageDialog(null, "Please enter your email according to standards");
            } else{
                Date d = txtDob.getDate();
                SimpleDateFormat df = new SimpleDateFormat("dd/MMMM/yyyy");
                String dob = df.format(d);
                d = txtJoin.getDate();
                String join = df.format(d);
                String work = Selection();
                boolean val = dc.addPatient(txtName.getText(), txtGuard.getText(), txtRegNo.getText(), comGen.getSelectedItem().toString(), "Worker", null, comHandi.getSelectedItem().toString(), txtAddress.getText(), Long.parseLong(txtMobile.getText()), txtEmail.getText(), comBlood1.getSelectedItem().toString(), txtCnic.getText(), "Pakistani", comTrack.getSelectedItem().toString(), comPsyco.getSelectedItem().toString(), join, txtLandline.getText(), comMed.getSelectedItem().toString(), null, null, null, null, null, null, null, txtSalary.getText(), work, dob);
                if (val) {
                    JOptionPane.showMessageDialog(null, "Error Adding data", "Error", JOptionPane.ERROR_MESSAGE);
                } else{
                    JOptionPane.showMessageDialog(null, "Successfully added");
                    this.setVisible(false);
                    pp.setVisible(true);
                    this.dispose();
                }
            }
        }
    }//GEN-LAST:event_btnOkMouseClicked

    private void comWorkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comWorkActionPerformed
        if(comWork.getSelectedItem().toString().trim().equals("Other")){
            txtOW.setVisible(true);
            lblOW.setVisible(true);
        } else{
            txtOW.setVisible(false);
            lblOW.setVisible(false);
        }
    }//GEN-LAST:event_comWorkActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPWor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new AddPWor().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnOk;
    private javax.swing.JComboBox<String> comBlood1;
    private javax.swing.JComboBox<String> comGen;
    private javax.swing.JComboBox<String> comHandi;
    private javax.swing.JComboBox<String> comMed;
    private javax.swing.JComboBox<String> comPsyco;
    private javax.swing.JComboBox<String> comShift;
    private javax.swing.JComboBox<String> comTrack;
    private javax.swing.JComboBox<String> comWork;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblOW;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCnic;
    private com.toedter.calendar.JDateChooser txtDob;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtGuard;
    private com.toedter.calendar.JDateChooser txtJoin;
    private javax.swing.JTextField txtLandline;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtOW;
    private javax.swing.JTextField txtRegNo;
    private javax.swing.JTextField txtSalary;
    // End of variables declaration//GEN-END:variables
}
