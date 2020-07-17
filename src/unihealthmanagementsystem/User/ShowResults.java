package unihealthmanagementsystem.User;

import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import unihealthmanagementsystem.DbClass;

public class ShowResults extends javax.swing.JFrame {
    
    // Objects, Variable and Instances
    DbClass dbClass = DbClass.getInstance();

    // Constructor
    public ShowResults() {
        initComponents();
        ImageIcon img = new ImageIcon("src\\icon\\AdminIcoSm.png");
        this.setIconImage(img.getImage());
    }
    
    // Creating Instance
    private static ShowResults instance = null;
    public static ShowResults getInstance() {
        if(instance == null)
            instance = new ShowResults();
        return instance;
    }
    
    // stuSplitter Method
    public void stuSplitter(String str){
        this.setVisible(true);
        String phy = str.split("\t")[0];
        String info = str.split("\t")[1];
        String dia = str.split("\t")[2];
        String a = dia.split(";")[5];
        String b="",c="",d="",e="";
        if(a.split("-")[0] != null){
            b = a.split("-")[0]; 
        } 
        if(a.split("-")[1] != null){
            c = a.split("-")[1]; 
        } 
        if(a.split("-")[2] != null){
            d = a.split("-")[2]; 
        } 
        if(a.split("-")[3] != null){
            e = a.split("-")[3]; 
        }
        DefaultTableModel model = (DefaultTableModel)this.tblPhy.getModel();
        model.setRowCount(0);
        model.addRow(new Object[]{"Physician Id ", phy.split(";")[1]});
        model.addRow(new Object[]{"Physician Name ", phy.split(";")[2]});
        model.addRow(new Object[]{"Physician Email", phy.split(";")[3]});
        model.addRow(new Object[]{"Physician Address", phy.split(";")[4]});
        model.addRow(new Object[]{"Physician Mobile Number", phy.split(";")[5]});
        DefaultTableModel model1 = (DefaultTableModel)this.tblPat.getModel();
        model1.setRowCount(0);
        model1.addRow(new Object[]{"Patient Name ", info.split(";")[0]});
        model1.addRow(new Object[]{"Guardian Name ", info.split(";")[1]});
        model1.addRow(new Object[]{"Registration Number ", info.split(";")[2]});
        model1.addRow(new Object[]{"CNIC Number ", info.split(";")[3]});
        model1.addRow(new Object[]{"Mobile Number ", info.split(";")[4]});
        model1.addRow(new Object[]{"Gender ", info.split(";")[5]});
        model1.addRow(new Object[]{"Age ", info.split(";")[6]});
        model1.addRow(new Object[]{"Handicap ", info.split(";")[7]});
        model1.addRow(new Object[]{"Address ", info.split(";")[8]});
        model1.addRow(new Object[]{"Email ", info.split(";")[9]});
        model1.addRow(new Object[]{"Blood Group ", info.split(";")[10]});
        model1.addRow(new Object[]{"Nationality ", info.split(";")[12]});
        model1.addRow(new Object[]{"Track Record ", info.split(";")[13]});
        model1.addRow(new Object[]{"Psycollogically Fit? ", info.split(";")[14]});
        model1.addRow(new Object[]{"Shift ", info.split(";")[18]});
        model1.addRow(new Object[]{"Joining Date ", info.split(";")[15]});
        model1.addRow(new Object[]{"Landline Number ", info.split(";")[16]});
        model1.addRow(new Object[]{"Medically Fit? ", info.split(";")[14]});
        model1.addRow(new Object[]{"Department ", info.split(";")[19]});
        model1.addRow(new Object[]{"Civilian? ", info.split(";")[17]});
        model1.addRow(new Object[]{"Number of Semesters ", info.split(";")[21]});
        model1.addRow(new Object[]{"Semester Duration ", info.split(";")[22]});
        model1.addRow(new Object[]{"Days ", info.split(";")[23]});
        model1.addRow(new Object[]{"Semester Fees ", info.split(";")[24]});
        model1.addRow(new Object[]{"Role ", info.split(";")[11]});
        DefaultTableModel model2 = (DefaultTableModel)this.tblDia.getModel();
        model2.setRowCount(0);
        model2.addRow(new Object[]{"Diagnostic Id ", dia.split(";")[0]});
        model2.addRow(new Object[]{"Condition ", dia.split(";")[1]});
        model2.addRow(new Object[]{"Diseases ", dia.split(";")[3]});
        model2.addRow(new Object[]{"Fever ", dia.split(";")[2]});
        model2.addRow(new Object[]{"Time ", dia.split(";")[6].split(" ")[1]});
        model2.addRow(new Object[]{"Date ", dia.split(";")[7]});
        model2.addRow(new Object[]{"Suggestions ", dia.split(";")[4]});
        model2.addRow(new Object[]{"Medications ", b});
        model2.addRow(new Object[]{"", c});
        model2.addRow(new Object[]{"", d});
        model2.addRow(new Object[]{"", e});
    }
    
    // FacSplitter Method
    public void FacSplitter(String str){
        this.setVisible(true);
        String phy = str.split("\t")[0];
        String info = str.split("\t")[1];
        String dia = str.split("\t")[2];
        String a = dia.split(";")[5];
        String b="",c="",d="",e="";
        if(a.split("-")[0] != null){
            b = a.split("-")[0]; 
        } 
        if(a.split("-")[1] != null){
            c = a.split("-")[1]; 
        } 
        if(a.split("-")[2] != null){
            d = a.split("-")[2]; 
        } 
        if(a.split("-")[3] != null){
            e = a.split("-")[3]; 
        }
        DefaultTableModel model = (DefaultTableModel)this.tblPhy.getModel();
        model.setRowCount(0);
        model.addRow(new Object[]{"Physician Id ", phy.split(";")[1]});
        model.addRow(new Object[]{"Physician Name ", phy.split(";")[2]});
        model.addRow(new Object[]{"Physician Email", phy.split(";")[3]});
        model.addRow(new Object[]{"Physician Address", phy.split(";")[4]});
        model.addRow(new Object[]{"Physician Mobile Number", phy.split(";")[5]});
        DefaultTableModel model1 = (DefaultTableModel)this.tblPat.getModel();
        model1.setRowCount(0);
        model1.addRow(new Object[]{"Patient Name ", info.split(";")[0]});
        model1.addRow(new Object[]{"Guardian Name ", info.split(";")[1]});
        model1.addRow(new Object[]{"Registration Number ", info.split(";")[2]});
        model1.addRow(new Object[]{"CNIC Number ", info.split(";")[3]});
        model1.addRow(new Object[]{"Mobile Number ", info.split(";")[4]});
        model1.addRow(new Object[]{"Gender ", info.split(";")[5]});
        model1.addRow(new Object[]{"Age ", info.split(";")[6]});
        model1.addRow(new Object[]{"Handicap ", info.split(";")[7]});
        model1.addRow(new Object[]{"Address ", info.split(";")[8]});
        model1.addRow(new Object[]{"Email ", info.split(";")[9]});
        model1.addRow(new Object[]{"Blood Group ", info.split(";")[10]});
        model1.addRow(new Object[]{"Nationality ", info.split(";")[12]});
        model1.addRow(new Object[]{"Track Record ", info.split(";")[13]});
        model1.addRow(new Object[]{"Psycollogically Fit? ", info.split(";")[14]});
        model1.addRow(new Object[]{"Shift ", info.split(";")[18]});
        model1.addRow(new Object[]{"Joining Date ", info.split(";")[15]});
        model1.addRow(new Object[]{"Landline Number ", info.split(";")[16]});
        model1.addRow(new Object[]{"Medically Fit? ", info.split(";")[14]});
        model1.addRow(new Object[]{"Department ", info.split(";")[19]});
        model1.addRow(new Object[]{"Role ", info.split(";")[11]});
        DefaultTableModel model2 = (DefaultTableModel)this.tblDia.getModel();
        model2.setRowCount(0);
        model2.addRow(new Object[]{"Diagnostic Id ", dia.split(";")[0]});
        model2.addRow(new Object[]{"Condition ", dia.split(";")[1]});
        model2.addRow(new Object[]{"Diseases ", dia.split(";")[3]});
        model2.addRow(new Object[]{"Fever ", dia.split(";")[2]});
        model2.addRow(new Object[]{"Time ", dia.split(";")[6].split(" ")[1]});
        model2.addRow(new Object[]{"Date ", dia.split(";")[7]});
        model2.addRow(new Object[]{"Suggestions ", dia.split(";")[4]});
        model2.addRow(new Object[]{"Medications ", b});
        model2.addRow(new Object[]{"", c});
        model2.addRow(new Object[]{"", d});
        model2.addRow(new Object[]{"", e});
    }
    
    // WorSplitter Method
    public void WorSplitter(String str){
        this.setVisible(true);
        String phy = str.split("\t")[0];
        String info = str.split("\t")[1];
        String dia = str.split("\t")[2];
        String a = dia.split(";")[5];
        String b="",c="",d="",e="";
        if(a.split("-")[0] != null){
            b = a.split("-")[0]; 
        } 
        if(a.split("-")[1] != null){
            c = a.split("-")[1]; 
        } 
        if(a.split("-")[2] != null){
            d = a.split("-")[2]; 
        } 
        if(a.split("-")[3] != null){
            e = a.split("-")[3]; 
        }
        DefaultTableModel model = (DefaultTableModel)this.tblPhy.getModel();
        model.setRowCount(0);
        model.addRow(new Object[]{"Physician Id ", phy.split(";")[1]});
        model.addRow(new Object[]{"Physician Name ", phy.split(";")[2]});
        model.addRow(new Object[]{"Physician Email", phy.split(";")[3]});
        model.addRow(new Object[]{"Physician Address", phy.split(";")[4]});
        model.addRow(new Object[]{"Physician Mobile Number", phy.split(";")[5]});
        DefaultTableModel model1 = (DefaultTableModel)this.tblPat.getModel();
        model1.setRowCount(0);
        model1.addRow(new Object[]{"Patient Name ", info.split(";")[0]});
        model1.addRow(new Object[]{"Guardian Name ", info.split(";")[1]});
        model1.addRow(new Object[]{"Registration Number ", info.split(";")[2]});
        model1.addRow(new Object[]{"CNIC Number ", info.split(";")[3]});
        model1.addRow(new Object[]{"Mobile Number ", info.split(";")[4]});
        model1.addRow(new Object[]{"Gender ", info.split(";")[5]});
        model1.addRow(new Object[]{"Age ", info.split(";")[6]});
        model1.addRow(new Object[]{"Handicap ", info.split(";")[7]});
        model1.addRow(new Object[]{"Address ", info.split(";")[8]});
        model1.addRow(new Object[]{"Email ", info.split(";")[9]});
        model1.addRow(new Object[]{"Blood Group ", info.split(";")[10]});
        model1.addRow(new Object[]{"Nationality ", info.split(";")[12]});
        model1.addRow(new Object[]{"Track Record ", info.split(";")[13]});
        model1.addRow(new Object[]{"Psycollogically Fit? ", info.split(";")[14]});
        model1.addRow(new Object[]{"Shift ", info.split(";")[18]});
        model1.addRow(new Object[]{"Joining Date ", info.split(";")[15]});
        model1.addRow(new Object[]{"Landline Number ", info.split(";")[16]});
        model1.addRow(new Object[]{"Medically Fit? ", info.split(";")[14]});
        model1.addRow(new Object[]{"Work ", info.split(";")[19]});
        model1.addRow(new Object[]{"Role ", info.split(";")[11]});
        DefaultTableModel model2 = (DefaultTableModel)this.tblDia.getModel();
        model2.setRowCount(0);
        model2.addRow(new Object[]{"Diagnostic Id ", dia.split(";")[0]});
        model2.addRow(new Object[]{"Condition ", dia.split(";")[1]});
        model2.addRow(new Object[]{"Diseases ", dia.split(";")[3]});
        model2.addRow(new Object[]{"Fever ", dia.split(";")[2]});
        model2.addRow(new Object[]{"Time ", dia.split(";")[6].split(" ")[1]});
        model2.addRow(new Object[]{"Date ", dia.split(";")[7]});
        model2.addRow(new Object[]{"Suggestions ", dia.split(";")[4]});
        model2.addRow(new Object[]{"Medications ", b});
        model2.addRow(new Object[]{"", c});
        model2.addRow(new Object[]{"", d});
        model2.addRow(new Object[]{"", e});
    }

    // Swing Generated Code
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPat = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPhy = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDia = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Results");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204,215,180,150));

        jLabel1.setBackground(new java.awt.Color(255, 51, 255));
        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 40)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Physician Details");

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 40)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Patient Details");

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 40)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Diagnostic Details");

        tblPat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Key", "Value"
            }
        ));
        jScrollPane1.setViewportView(tblPat);

        tblPhy.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Key", "Value"
            }
        ));
        jScrollPane2.setViewportView(tblPhy);

        tblDia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Key", "Value"
            }
        ));
        jScrollPane3.setViewportView(tblDia);

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/backIco.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 887, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(700, 700, 700)
                                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(57, 57, 57)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGap(58, 58, 58)))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 887, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 890));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/4614.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 890));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // btnBackMouseClicked Mouse Event
    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        
        DiagnosticDetails diagnosticDetails = DiagnosticDetails.getInstance();
        diagnosticDetails.setVisible(true);
        this.setVisible(false);
        this.dispose();
        
    }//GEN-LAST:event_btnBackMouseClicked

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
            java.util.logging.Logger.getLogger(ShowResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new ShowResults().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblDia;
    private javax.swing.JTable tblPat;
    private javax.swing.JTable tblPhy;
    // End of variables declaration//GEN-END:variables
}
