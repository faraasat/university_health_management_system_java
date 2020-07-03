package unihealthmanagementsystem.User;

import javax.swing.ImageIcon;

public class ShowResults extends javax.swing.JFrame {

    public ShowResults() {
        initComponents();
        ImageIcon img = new ImageIcon("src\\icon\\AdminIcoSm.png");
        this.setIconImage(img.getImage());
    }
    
    public void stuSplitter(String str){
        this.setVisible(true);
        String phy = str.split("\t")[0];
        String info = str.split("\t")[1];
        String dia = str.split("\t")[2];
        String a = dia.split(";")[5];
        String b="",c="",d="",e="";
        if(a.split("-")[0] != null){
            b = a.split("-")[0]; 
        } if(a.split("-")[1] != null){
            c = a.split("-")[1]; 
        } if(a.split("-")[2] != null){
            d = a.split("-")[2]; 
        } if(a.split("-")[3] != null){
            e = a.split("-")[3]; 
        }
        txtPhy.setText("  Physician Id: " + phy.split(";")[1] + "\tPhysician Name: " + phy.split(";")[2] + "\tPhysician Email: " + phy.split(";")[3] + "\n\n\tPhysician Address: " + phy.split(";")[4] + "\tPhysician Address: " + phy.split(";")[5]);
        txtPat.setText("  Patient Name: " + info.split(";")[0] + "\tGuardian Name: " + info.split(";")[1] + "\tRegistration No: " + info.split(";")[2] + "\n\n\t  CNIC No: " + info.split(";")[3] + "\tMobile No: " + info.split(";")[4] + "\tGender: " + info.split(";")[5] + "\n\n\t  Age: " + info.split(";")[6] + "\tHandicap: " + info.split(";")[7] + "\tAddress: " + info.split(";")[8] + "\n\n\t  Email: " + info.split(";")[9] + "\tBlood Group: " + info.split(";")[10] + "\tNationality: " + info.split(";")[12] + "\n\n\t  Track Record: " + info.split(";")[13] + "\tPsycollogically Fit? " + info.split(";")[14] + "\tShift: " + info.split(";")[18] + "\n\n\t  Joining Date: " + info.split(";")[15] + "\tLandline: " + info.split(";")[16] + "\tMedically Fit?: " + info.split(";")[14] + "\n\n\t  Department: " + info.split(";")[19] + "\tCivilian? " + info.split(";")[17] + "\tNumber of Semesters: " + info.split(";")[21] + "\n\n\t  Semester duration: " + info.split(";")[22] + "\tDays: " + info.split(";")[23] + "\tSemester Fees: " + info.split(";")[24] + "\n\n\t  Role: " + info.split(";")[11]);
        txtDia.setText("\tDiagnostic Id: " + dia.split(";")[0] + "\tCondition: " + dia.split(";")[1] + "\tDiseases: " + dia.split(";")[3] + "\n\n  \tFever: " + dia.split(";")[2] + "\t" + dia.split(";")[6] + "\tDate: " + dia.split(";")[7] + "\n\n\tSuggestions: " + dia.split(";")[4] + "\n\n\tMedications: " + b + "\n\t\t      " + c + "\n\t\t      " + d + "\n\t\t      " + e);
    }
    
    public void FacSplitter(String str){
        this.setVisible(true);
        String phy = str.split("\t")[0];
        String info = str.split("\t")[1];
        String dia = str.split("\t")[2];
        String a = dia.split(";")[5];
        String b="",c="",d="",e="";
        if(a.split("-")[0] != null){
            b = a.split("-")[0]; 
        } if(a.split("-")[1] != null){
            c = a.split("-")[1]; 
        } if(a.split("-")[2] != null){
            d = a.split("-")[2]; 
        } if(a.split("-")[3] != null){
            e = a.split("-")[3]; 
        }
        txtPhy.setText("  Physician Id: " + phy.split(";")[1] + "\tPhysician Name: " + phy.split(";")[2] + "\tPhysician Email: " + phy.split(";")[3] + "\n\n\tPhysician Address: " + phy.split(";")[4] + "\tPhysician Address: " + phy.split(";")[5]);
        txtPat.setText("  Patient Name: " + info.split(";")[0] + "\tGuardian Name: " + info.split(";")[1] + "\tRegistration No: " + info.split(";")[2] + "\n\n\t  CNIC No: " + info.split(";")[3] + "\tMobile No: " + info.split(";")[4] + "\tGender: " + info.split(";")[5] + "\n\n\t  Age: " + info.split(";")[6] + "\tHandicap: " + info.split(";")[7] + "\tAddress: " + info.split(";")[8] + "\n\n\t  Email: " + info.split(";")[9] + "\tBlood Group: " + info.split(";")[10] + "\tNationality: " + info.split(";")[12] + "\n\n\t  Track Record: " + info.split(";")[13] + "\tPsycollogically Fit? " + info.split(";")[14] + "\tShift: " + info.split(";")[18] + "\n\n\t  Joining Date: " + info.split(";")[15] + "\tLandline: " + info.split(";")[16] + "\tMedically Fit?: " + info.split(";")[14] + "\n\n\t  Department: " + info.split(";")[19] + "\t  Role: " + info.split(";")[11]);
        txtDia.setText("\tDiagnostic Id: " + dia.split(";")[0] + "\tCondition: " + dia.split(";")[1] + "\tDiseases: " + dia.split(";")[3] + "\n\n  \tFever: " + dia.split(";")[2] + "\t" + dia.split(";")[6] + "\tDate: " + dia.split(";")[7] + "\n\n\tSuggestions: " + dia.split(";")[4] + "\n\n\tMedications: " + b + "\n\t\t      " + c + "\n\t\t      " + d + "\n\t\t      " + e);
    }
    
    public void WorSplitter(String str){
        this.setVisible(true);
        String phy = str.split("\t")[0];
        String info = str.split("\t")[1];
        String dia = str.split("\t")[2];
        String a = dia.split(";")[5];
        String b="",c="",d="",e="";
        if(a.split("-")[0] != null){
            b = a.split("-")[0]; 
        } if(a.split("-")[1] != null){
            c = a.split("-")[1]; 
        } if(a.split("-")[2] != null){
            d = a.split("-")[2]; 
        } if(a.split("-")[3] != null){
            e = a.split("-")[3]; 
        }
        txtPhy.setText("  Physician Id: " + phy.split(";")[1] + "\tPhysician Name: " + phy.split(";")[2] + "\tPhysician Email: " + phy.split(";")[3] + "\n\n\tPhysician Address: " + phy.split(";")[4] + "\tPhysician Address: " + phy.split(";")[5]);
        txtPat.setText("  Patient Name: " + info.split(";")[0] + "\tGuardian Name: " + info.split(";")[1] + "\tRegistration No: " + info.split(";")[2] + "\n\n\t  CNIC No: " + info.split(";")[3] + "\tMobile No: " + info.split(";")[4] + "\tGender: " + info.split(";")[5] + "\n\n\t  Age: " + info.split(";")[6] + "\tHandicap: " + info.split(";")[7] + "\tAddress: " + info.split(";")[8] + "\n\n\t  Email: " + info.split(";")[9] + "\tBlood Group: " + info.split(";")[10] + "\tNationality: " + info.split(";")[12] + "\n\n\t  Track Record: " + info.split(";")[13] + "\tPsycollogically Fit? " + "\t  Role: " + info.split(";")[11] + "\n\n\t  Joining Date: " + info.split(";")[15] + "\tLandline: " + info.split(";")[16] + "\tMedically Fit?: " + info.split(";")[14] + "\n\n\t  Work: " + info.split(";")[19]);
        txtDia.setText("\tDiagnostic Id: " + dia.split(";")[0] + "\tCondition: " + dia.split(";")[1] + "\tDiseases: " + dia.split(";")[3] + "\n\n  \tFever: " + dia.split(";")[2] + "\t" + dia.split(";")[6] + "\tDate: " + dia.split(";")[7] + "\n\n\tSuggestions: " + dia.split(";")[4] + "\n\n\tMedications: " + b + "\n\t\t      " + c + "\n\t\t      " + d + "\n\t\t      " + e);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPat = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDia = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPhy = new javax.swing.JTextArea();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Diagnostic Result");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setText("Physician Details:");

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel2.setText("Patient Details:");

        txtPat.setEditable(false);
        txtPat.setColumns(20);
        txtPat.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        txtPat.setRows(5);
        jScrollPane2.setViewportView(txtPat);

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel3.setText("Diagnostic Details:");

        txtDia.setEditable(false);
        txtDia.setColumns(20);
        txtDia.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        txtDia.setRows(5);
        jScrollPane3.setViewportView(txtDia);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txtPhy.setColumns(20);
        txtPhy.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        txtPhy.setRows(5);
        jScrollPane1.setViewportView(txtPhy);

        btnBack.setText("Back");
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 995, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 995, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(69, 69, 69)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 998, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(790, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(711, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnBackMouseClicked

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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txtDia;
    private javax.swing.JTextArea txtPat;
    private javax.swing.JTextArea txtPhy;
    // End of variables declaration//GEN-END:variables
}
