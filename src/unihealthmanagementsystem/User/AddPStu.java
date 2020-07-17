package unihealthmanagementsystem.User;

import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import unihealthmanagementsystem.DbClass;

public class AddPStu extends javax.swing.JFrame {

    // Variables, Methods and Instances
    DbClass dbClass = new DbClass();
    PatientPanel patientPanel = new PatientPanel();
    
    // constructor
    public AddPStu() {
        initComponents();
        ImageIcon img = new ImageIcon("src\\icon\\AdminIcoSm.png");
        this.setIconImage(img.getImage());
        txtCountry.setVisible(false);
        lblCountry.setVisible(false);
    }
    
    // Creating Instance
    private static AddPStu instance = null;
    public static AddPStu getInstance() {
        if(instance == null)
            instance = new AddPStu();
        return instance;
    }
    
    // Email Validation Method
    static boolean isEmailValid(String email) {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);
    }

    // Swing Generated Code
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        txtCnic = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtGuard = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtRegNo = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        comGen = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        comBlood = new javax.swing.JComboBox<>();
        comNat = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
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
        jLabel39 = new javax.swing.JLabel();
        txtFees = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        comDays = new javax.swing.JComboBox<>();
        comSem = new javax.swing.JComboBox<>();
        comCivil = new javax.swing.JComboBox<>();
        jLabel42 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        txtDob = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        txtDepart = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        comDuration = new javax.swing.JComboBox<>();
        lblCountry = new javax.swing.JLabel();
        txtCountry = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        btnOk = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtJoin = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Student");
        setMinimumSize(new java.awt.Dimension(955, 855));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel21.setText("Enter Date of Birth:");

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel22.setText("Enter Department:");

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel23.setText("Enter Patient Name:");

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel25.setText("Enter Registration No:");

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel26.setText("Enter CNIC No:");

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel27.setText("Select Gender:");

        comGen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Male", "Female" }));

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel28.setText("Enter Blood Group:");

        comBlood.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "O+", "O-", "A+", "A-", "B+", "B-", "AB+", "AB-" }));

        comNat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Pakistani", "Foreigner" }));
        comNat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comNatActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel29.setText("Any Handicap?");

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel30.setText("Select Nationality:");

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel31.setText("Enter Address:");

        comHandi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Yes", "No" }));

        jLabel32.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel32.setText("Enter Mobile No:");

        jLabel15.setBackground(new java.awt.Color(204, 204, 255));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 204, 0));
        jLabel15.setText("+92");

        jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel33.setText("Enter Joining Date:");

        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel34.setText("Select Shift:");

        comShift.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Morning", "Evening" }));

        comTrack.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Good", "Average", "Below Average" }));

        jLabel35.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel35.setText("Select Track Record:");

        jLabel36.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel36.setText("Select Medical Insurane:");

        comMed.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Yes", "No" }));

        comPsyco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Yes", "No" }));

        jLabel37.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel37.setText("Psycologically Fit?");

        jLabel38.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel38.setText("Enter Landline No:");

        jLabel39.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel39.setText("Enter Semester Fees:");

        jLabel40.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel40.setText("Select No of Semester:");

        jLabel41.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel41.setText("Select Days:");

        comDays.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Week Days", "Week End" }));

        comSem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "2", "4", "8" }));

        comCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Yes", "No" }));

        jLabel42.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel42.setText("Select Total Duration:");

        jLabel44.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel44.setText("Is Civilian?");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("* Please fill as specified: House No, Street No, City, State");

        jLabel45.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel45.setText("Enter Guardian Name:");

        jLabel43.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel43.setText("Enter Email:");

        comDuration.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "1", "2", "4" }));

        lblCountry.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblCountry.setText("Enter Country:");

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cross.png"))); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
        });

        btnOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/plus.png"))); // NOI18N
        btnOk.setText("Add");
        btnOk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOkMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtGuard, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtRegNo, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtDepart, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtCnic, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(comGen, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(comNat, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(lblCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(comBlood, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(comHandi, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel9))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtJoin, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(comShift, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(comCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(comPsyco, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(comMed, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtLandline, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtFees, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(comSem, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(comDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(comDays, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(comTrack, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(550, 550, 550)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(750, 750, 750)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGuard, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRegNo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDepart, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCnic, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comGen, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comNat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comBlood, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comHandi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jLabel9)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtJoin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comShift, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comPsyco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comMed, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLandline, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFees, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comSem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comDays, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comTrack, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 80, 950, 740);

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
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 960, 80);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/3574.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 1060, 830);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // btnCancelMouseClicked Mouse Event
    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
        
        AddPatient addPatient = AddPatient.getInstance();
        addPatient.setVisible(true);
        this.setVisible(false);
        this.dispose();
        
    }//GEN-LAST:event_btnCancelMouseClicked

    // btnOkMouseClicked Mouse Event
    private void btnOkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOkMouseClicked
        
        dbClass.Connect();
        ResultSet rs = dbClass.findUsername(txtName.getText(), txtRegNo.getText() ,"patientDetails");
        
        if(txtName.getText().equals("") || txtGuard.getText().equals("") || txtRegNo.getText().equals("") || txtDepart.getText().equals("") || txtCnic.getText().equals("") || txtDob.getDate().equals("") || txtAddress.getText().equals("") || txtEmail.getText().equals("") || txtMobile.getText().equals("") || txtJoin.getDate().equals("") || txtLandline.getText().equals("") || txtFees.getText().equals("") || comGen.getSelectedItem().toString().equals("Select") || comNat.getSelectedItem().toString().equals("Select") || comBlood.getSelectedItem().toString().equals("Select") || comHandi.getSelectedItem().toString().equals("Select") || comShift.getSelectedItem().toString().equals("Select") || comCivil.getSelectedItem().toString().equals("Select") || comPsyco.getSelectedItem().toString().equals("Select") || comMed.getSelectedItem().toString().equals("Select") || comSem.getSelectedItem().toString().equals("Select") || comDuration.getSelectedItem().toString().equals("Select") || comDays.getSelectedItem().toString().equals("Select") || comTrack.getSelectedItem().toString().equals("Select")){
            JOptionPane.showMessageDialog(null, "All fields are mandatory");
        } 
        else if(rs != null){
                JOptionPane.showMessageDialog(null, "Patient alredy exist");
        } 
        else{
            try{
                Long mob = Long.parseLong(txtMobile.getText());
            } 
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Please enter numeric value in mobile field");
            }
            boolean value = isEmailValid(txtEmail.getText());
            if(!value){
                JOptionPane.showMessageDialog(null, "Please enter your email according to standards");
            } else if(txtMobile.getText().length() != 10){
                JOptionPane.showMessageDialog(null, "Please check entered mobile No. 10 digits are required");
            }             
            else{
                Date d = txtDob.getDate();
                SimpleDateFormat df = new SimpleDateFormat("dd/MMMM/yyyy");
                String dob = df.format(d);
                d = txtJoin.getDate();
                String join = df.format(d);
                boolean val = dbClass.addPatient(txtName.getText(), txtGuard.getText(), txtRegNo.getText(), comGen.getSelectedItem().toString(), "Student", txtDepart.getText(), comHandi.getSelectedItem().toString(), txtAddress.getText(), Long.parseLong(txtMobile.getText()), txtEmail.getText(), comBlood.getSelectedItem().toString(), txtCnic.getText(), comNat.getSelectedItem().toString(), comTrack.getSelectedItem().toString(), comPsyco.getSelectedItem().toString(), join, txtLandline.getText(), comMed.getSelectedItem().toString(), comSem.getSelectedItem().toString(), comDuration.getSelectedItem().toString(), comDays.getSelectedItem().toString(), txtFees.getText(), comShift.getSelectedItem().toString(), comCivil.getSelectedItem().toString(), null, null, null, dob);
                if (val) {
                    JOptionPane.showMessageDialog(null, "Error Adding data", "Error", JOptionPane.ERROR_MESSAGE);
                } 
                else{
                    JOptionPane.showMessageDialog(null, "Successfully added");
                    this.setVisible(false);
                    patientPanel.setVisible(true);
                    this.dispose();
                } 
            }
        }
        
    }//GEN-LAST:event_btnOkMouseClicked

    // btnOkMouseClicked Mouse Event
    private void comNatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comNatActionPerformed
        
        if(comNat.getSelectedItem().toString().trim().equals("Foreigner")){
            txtCountry.setVisible(true);
            lblCountry.setVisible(true);
        } 
        else{
            txtCountry.setVisible(false);
            lblCountry.setVisible(false);
        }
        
    }//GEN-LAST:event_comNatActionPerformed

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
            java.util.logging.Logger.getLogger(AddPStu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new AddPStu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnOk;
    private javax.swing.JComboBox<String> comBlood;
    private javax.swing.JComboBox<String> comCivil;
    private javax.swing.JComboBox<String> comDays;
    private javax.swing.JComboBox<String> comDuration;
    private javax.swing.JComboBox<String> comGen;
    private javax.swing.JComboBox<String> comHandi;
    private javax.swing.JComboBox<String> comMed;
    private javax.swing.JComboBox<String> comNat;
    private javax.swing.JComboBox<String> comPsyco;
    private javax.swing.JComboBox<String> comSem;
    private javax.swing.JComboBox<String> comShift;
    private javax.swing.JComboBox<String> comTrack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
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
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCountry;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCnic;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextField txtDepart;
    private com.toedter.calendar.JDateChooser txtDob;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFees;
    private javax.swing.JTextField txtGuard;
    private com.toedter.calendar.JDateChooser txtJoin;
    private javax.swing.JTextField txtLandline;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtRegNo;
    // End of variables declaration//GEN-END:variables
}
