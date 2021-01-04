package unihealthmanagementsystem;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

public class DiagnosisSystem extends javax.swing.JFrame{
    
    dbClass dc = new dbClass();
    Login lg = new Login();
    boolean flag;
    static String nameFor;
    Thread t=null;  
    int hours=0, minutes=0, seconds=0;  
    String timeString = "";  

    public DiagnosisSystem() {
        initComponents();
        fetchDatum();
        setPhy();
        new DigitalWatch();
        txtDate.setText(myDate());
        lblRW.setOpaque(true);
        txtpid.disable();
        txtpid.setText("PID-" + atInitialize());
        flag = false;
        pDia.setVisible(false);
        txtGender.disable();
        txtPI.disable();
        txtPEmail.disable();
        txtPName.disable();
        txtBlood.disable();
        txtGender.disable();
        txtHandicap.disable();
    }
    
    public static void setNameFor(String name){
        DiagnosisSystem.nameFor = name;
    }
    
    private String atInitialize(){
        dc.Connect();
        int resu = dc.returnResult("patientDiagnostic");
        return Integer.toString(resu);
    }
    
    private void fetchDatum(){
        dc.Connect();
        ResultSet rs = dc.patientDetails();
        tblDet.setModel(DbUtils.resultSetToTableModel(rs));
    }

    private void setPhy(){
       dc.Connect();
       ResultSet res = dc.SearchName(nameFor);
       if(res != null){
            try {
                res.first();
                txtPI.setText("PYID" + res.getString("ID"));
                txtGender.setText(res.getString("Username"));
                txtPEmail.setText(res.getString("Email"));
            } catch (SQLException ex) {
                System.out.println(ex);
            }
       }
    }
    
    private class DigitalWatch implements Runnable{  
        JFrame f;  
        Thread t=null;  
        int hours=0, minutes=0, seconds=0;  
        String timeString = "";  
        JButton b;  

        DigitalWatch(){
            t = new Thread(this);  
            t.start();  
        }  

        public void run() {  
            try {  
                while (true) {  
                   String assign;
                   Calendar cal = Calendar.getInstance();  
                   hours = cal.get( Calendar.HOUR_OF_DAY );  
                   if(hours <= 12){
                       assign = "AM";
                   } else{
                       assign = "PM";
                   }
                   if ( hours > 12 ) hours -= 12;  
                   minutes = cal.get( Calendar.MINUTE );  
                   seconds = cal.get( Calendar.SECOND );  
                   SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");  
                   Date date = cal.getTime();  
                   timeString = formatter.format( date );
                   txtTime.setText("Time: " + timeString + " " + assign);
                   t.sleep( 1000 );  // interval given in milliseconds  
                }  
             }  
             catch (InterruptedException e) { }  
        } 
    } 
    
    private String myDate(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MMMM/yyyy");  
        Date date = new Date();
        SimpleDateFormat simpleDateformat = new SimpleDateFormat("EEEE");
        String day = simpleDateformat.format(date);
        return day + ", " + formatter.format(date);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pDia = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        comCondition = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtFever = new javax.swing.JTextField();
        txtBlood = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtHandicap = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        pTbl = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDet = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtPI = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPEmail = new javax.swing.JTextField();
        txtTime = new javax.swing.JTextField();
        txtPName = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtpid = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        txtReg = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnCheck = new javax.swing.JButton();
        lblRW = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1400, 900));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(240,214,231,150));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setBackground(new java.awt.Color(240, 238, 56));
        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 60)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 207, 82));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Diagnostic System");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1400, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1400, 100);

        jPanel2.setBackground(new java.awt.Color(240,240,216,255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(null);

        pDia.setBackground(new java.awt.Color(240,240,216,255));
        pDia.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setText("Fever:");
        pDia.add(jLabel9);
        jLabel9.setBounds(360, 40, 100, 40);

        comCondition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Normal", "Worse", "Severe" }));
        pDia.add(comCondition);
        comCondition.setBounds(180, 40, 120, 40);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setText("Gender:");
        pDia.add(jLabel10);
        jLabel10.setBounds(30, 120, 120, 40);

        txtGender.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pDia.add(txtGender);
        txtGender.setBounds(150, 120, 110, 40);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel11.setText("Condition:");
        pDia.add(jLabel11);
        jLabel11.setBounds(30, 40, 150, 40);

        txtFever.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        pDia.add(txtFever);
        txtFever.setBounds(460, 40, 110, 40);

        txtBlood.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pDia.add(txtBlood);
        txtBlood.setBounds(490, 120, 70, 40);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel12.setText("Blood Group:");
        pDia.add(jLabel12);
        jLabel12.setBounds(320, 120, 170, 40);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel13.setText("Handicap:");
        pDia.add(jLabel13);
        jLabel13.setBounds(630, 120, 140, 40);

        txtHandicap.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pDia.add(txtHandicap);
        txtHandicap.setBounds(770, 120, 70, 40);

        txtDate.setEditable(false);
        txtDate.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        txtDate.setForeground(new java.awt.Color(204, 204, 255));
        txtDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pDia.add(txtDate);
        txtDate.setBounds(1000, 120, 270, 40);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel14.setText("Date:");
        pDia.add(jLabel14);
        jLabel14.setBounds(910, 120, 90, 40);

        jPanel2.add(pDia);
        pDia.setBounds(30, 250, 1320, 480);

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        tblDet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Guardian", "Registration No.", "Gender", "Role", "Department", "Handicap", "Address", "Mobile", "Email", "Blood Group"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblDet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDetMouseClicked(evt);
            }
        });
        tblDet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblDetKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblDet);

        javax.swing.GroupLayout pTblLayout = new javax.swing.GroupLayout(pTbl);
        pTbl.setLayout(pTblLayout);
        pTblLayout.setHorizontalGroup(
            pTblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTblLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pTblLayout.setVerticalGroup(
            pTblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTblLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(pTbl);
        pTbl.setBounds(70, 270, 1250, 430);
        jPanel2.add(jSeparator1);
        jSeparator1.setBounds(10, 130, 1353, 10);

        jPanel5.setBackground(new java.awt.Color(240,240,255,255));
        jPanel5.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Physician ID:");
        jPanel5.add(jLabel6);
        jLabel6.setBounds(30, 30, 130, 30);

        txtPI.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(txtPI);
        txtPI.setBounds(140, 30, 70, 30);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Physician Name:");
        jPanel5.add(jLabel7);
        jLabel7.setBounds(250, 30, 150, 30);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Physician Email:");
        jPanel5.add(jLabel8);
        jLabel8.setBounds(630, 30, 150, 30);

        txtPEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(txtPEmail);
        txtPEmail.setBounds(770, 30, 190, 30);

        txtTime.setEditable(false);
        txtTime.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        txtTime.setForeground(new java.awt.Color(204, 204, 255));
        txtTime.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(txtTime);
        txtTime.setBounds(990, 10, 290, 70);

        txtPName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(txtPName);
        txtPName.setBounds(390, 30, 190, 30);

        jPanel2.add(jPanel5);
        jPanel5.setBounds(30, 20, 1310, 90);

        jPanel4.setBackground(new java.awt.Color(240,230,250,255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Diagnostic ID:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 120, 30));

        txtpid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(txtpid, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 90, 30));

        jPanel2.add(jPanel4);
        jPanel4.setBounds(30, 150, 290, 90);

        jPanel3.setBackground(new java.awt.Color(245,214,231,230));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(txtReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 200, 31));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Patient Name:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 120, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Registration ID:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 135, 30));

        btnCheck.setText("Check Info..");
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });
        jPanel3.add(btnCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 130, 30));

        lblRW.setBackground(new java.awt.Color(245,214,231,255));
        lblRW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/questIco.png"))); // NOI18N
        jPanel3.add(lblRW, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, -1, 50));
        jPanel3.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 190, 31));

        jPanel2.add(jPanel3);
        jPanel3.setBounds(360, 160, 990, 75);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 100, 1400, 800);

        jLabel1.setBackground(new java.awt.Color(240,213,231,150));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/3040791.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1410, 920);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed
        if(txtName.getText().equals("") || txtReg.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Fields are Mandatory");
        } else if(flag == false){
            dc.Connect();
            ResultSet res = dc.findUsername(txtName.getText().trim(), txtReg.getText().trim(), "patientDetails");
            if(res != null){
                try {
                    ImageIcon img = new ImageIcon("src\\icon\\tickLgIco.png");
                    lblRW.setIcon(img);
                    ResultSet res2 = dc.SearchName(txtName.getText(), txtReg.getText(), "patientDetails");
                    flag = true;
                    txtName.disable();
                    txtReg.disable();
                    btnCheck.setText("Clear..");
                    pTbl.setVisible(false);
                    pDia.setVisible(true);
                    txtBlood.setText(res2.getString("BloodGroup"));
                    txtGender.setText(res2.getString("Gender"));
                    txtHandicap.setText(res2.getString("Handicap"));
                } catch (SQLException ex) { }
            } else{
                ImageIcon img = new ImageIcon("src\\icon\\crossLgIco.png");
                lblRW.setIcon(img);
                int r = JOptionPane.showConfirmDialog(null, "Patient Name/Details not available \nDo you want to add Patient?");
                System.out.println(r);
                if(r == 0){
                    PatientPanel pp = new PatientPanel();
                    pp.setVisible(true);
                    this.setVisible(false);
                }
            }
        } else if(flag == true){
            ImageIcon img = new ImageIcon("src\\icon\\questIco.png");
            lblRW.setIcon(img);
            txtName.enable();
            txtReg.enable();
            btnCheck.setText("Check Info..");
            flag = false;
            pTbl.setVisible(true);
            pDia.setVisible(false);
            txtBlood.setText("");
            txtGender.setText("");
            txtHandicap.setText("");
            txtFever.setText("");
            comCondition.setSelectedIndex(0);
        }
    }//GEN-LAST:event_btnCheckActionPerformed

    private void tblDetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDetMouseClicked
        int index = tblDet.getSelectedRow();
        TableModel model = tblDet.getModel();
        String val1 = (String) model.getValueAt(index, 1);
        String val2 = (String) model.getValueAt(index, 2);
        txtName.setText(val1);
        txtReg.setText(val2);
    }//GEN-LAST:event_tblDetMouseClicked

    private void tblDetKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblDetKeyPressed
        int index = tblDet.getSelectedRow();
        TableModel model = tblDet.getModel();
        String val1 = (String) model.getValueAt(index, 1);
        String val2 = (String) model.getValueAt(index, 2);
        txtName.setText(val1);
        txtReg.setText(val2);
    }//GEN-LAST:event_tblDetKeyPressed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DiagnosisSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DiagnosisSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheck;
    private javax.swing.JComboBox<String> comCondition;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblRW;
    private javax.swing.JPanel pDia;
    private javax.swing.JPanel pTbl;
    private javax.swing.JTable tblDet;
    private javax.swing.JTextField txtBlood;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtFever;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtHandicap;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPEmail;
    private javax.swing.JTextField txtPI;
    private javax.swing.JTextField txtPName;
    private javax.swing.JTextField txtReg;
    private javax.swing.JTextField txtTime;
    private javax.swing.JTextField txtpid;
    // End of variables declaration//GEN-END:variables
}
