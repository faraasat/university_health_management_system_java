package unihealthmanagementsystem;

import com.toedter.calendar.JDateChooser;
import java.awt.Component;
import java.awt.Container;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.util.Date;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

public class dbClass {
    
    private Connection conn = null;
    private Statement st = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    boolean flag = false;
    
    public Connection Connect(){
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            conn = DriverManager.getConnection("jdbc:ucanaccess://src\\Databases\\healthSystemDatabase.accdb");
        } catch(ClassNotFoundException | SQLException ex){
            JOptionPane.showMessageDialog(null, "Connection to Database Failed Exception: \n" + ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return conn;
    }
    
    public boolean loginUser(String name, String pass, String tblName){
        String login = "SELECT * FROM '" + tblName + "' WHERE Username = '" + name + "' and Password = '" + pass + "'";
        try {
           ps = Connect().prepareStatement(login);
           rs= ps.executeQuery();
           if(rs.next()){
               flag = true;
           }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Exception: \n" + ex, "Error", JOptionPane.ERROR_MESSAGE);            
        }
        return flag;
    }
    
    public int returnResult(String tbl)
    {
        try{
            st = Connect().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String sql="SELECT * FROM " + tbl;
            rs=st.executeQuery(sql);
            String abc = null;
            rs.last();
            abc = rs.getString(2);
            String sl = abc.split("-")[1];
            int num = Integer.parseInt(sl);
            return num + 1;
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Exception: \n" + ex, "Error", JOptionPane.ERROR_MESSAGE);            
        }
        return 0;
    }
    
    public ResultSet findUsername(String name, String tbl)
    {
        try{
            st = Connect().createStatement();
            String sql="SELECT * FROM " + tbl;
            rs=st.executeQuery(sql);
            while(rs.next()){
                if(rs.getString(2).equals(name)){
                    return rs;
                } 
            }
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Exception: \n" + ex, "Error", JOptionPane.ERROR_MESSAGE);            
        }
        return null;
    }
    
    public ResultSet findUsername(String name, String RegNo, String tbl)
    {
        try{
            st = Connect().createStatement();
            String sql="SELECT * FROM " + tbl;
            rs=st.executeQuery(sql);
            while(rs.next()){
                if(rs.getString("pName").equals(name) && rs.getString("RegistrationNo").equals(RegNo)){
                    return rs;
                } 
            }
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Exception: \n" + ex, "Error", JOptionPane.ERROR_MESSAGE);            
        }
        return null;
    }
    
    public ResultSet SearchName(String name, String tbl)
    {
        try{
            st = Connect().createStatement();
            String sql="SELECT * FROM " + tbl + " WHERE username = '" + name + "'";
            rs=st.executeQuery(sql);
            while(rs.next()){
                return rs; 
            }
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Exception: \n" + ex, "Error", JOptionPane.ERROR_MESSAGE);            
        }
        return null;
    }
    
    public ResultSet SearchName(String name, String reg, String tbl)
    {
        try{
            st = Connect().createStatement();
            String sql="SELECT * FROM " + tbl + " WHERE pName = '" + name + "' and RegistrationNo = '" + reg + "'";
            rs=st.executeQuery(sql);
            while(rs.next()){
                return rs; 
            }
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Exception: \n" + ex, "Error", JOptionPane.ERROR_MESSAGE);            
        }
        return null;
    }
    
    public ResultSet SearchName(String name)
    {
        try{
            st = Connect().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String sql="SELECT * FROM userLogin WHERE Username = '" + name + "'";
            rs=st.executeQuery(sql);
            while(rs.next()){
                return rs;
            }
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Exception: \n" + ex, "Error", JOptionPane.ERROR_MESSAGE);            
        }
        return null;
    }
     
    public boolean addUser(String name, String password, String email, double sal, String address, long mobile){
        try{
            st = Connect().createStatement();
            String sql="INSERT INTO userLogin(Username, Password, Email, Salary, Address, Mobile) "
                    + "VALUES('"+ name +"','" + password + "','" + email + "','" + sal + "','" + address + "','" + mobile + "')";
            int result = st.executeUpdate(sql);
            if(result > 1){
                flag = true;
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Exception: \n" + ex, "Error", JOptionPane.ERROR_MESSAGE);            
        }
        return flag;
    }
    
    public boolean addAdmin(String name, String password, String email)
    {
        try{
            st = Connect().createStatement();
            String sql="INSERT INTO adminLogin(Username, Password, Email) "
                    + "VALUES('"+ name +"','" + password + "','" + email +"')";
            int result = st.executeUpdate(sql);
            if(result > 1){
                flag = true;
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Exception: \n" + ex, "Error", JOptionPane.ERROR_MESSAGE);            
        }
        return flag;
    }
    
    public boolean deleteUser(String name, String tblname)
    {
        try{
            st = Connect().createStatement();
            String sql="DELETE FROM " + tblname + " WHERE Username = '" + name + "'";
            int result = st.executeUpdate(sql);
            if(result > 1){
                flag = true;
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Exception: \n" + ex, "Error", JOptionPane.ERROR_MESSAGE);            
        }
        return flag;
    }
    
    public ResultSet userDetails()
    {
        try{
            st = Connect().createStatement();
            String sql="SELECT * FROM userLogin";
            rs=st.executeQuery(sql);
            return rs;
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Exception: \n" + ex, "Error", JOptionPane.ERROR_MESSAGE);            
        }
        return null;
    }
    
    public boolean addPatient(String name, String guardian, String regNo, String gender, String role, String depart, String handicap, String address, Long mobile, String email, String blood, String cnic, String natio, String track, String psy, String join, String land, String med, String sem, String dur, String days, String fees, String shift, String civil, String post, String salary, String work, String dob){
        try {
            st = Connect().createStatement();
            Date date = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            String now = formatter.format(date);
            String sql="INSERT INTO patientDetails(pName, GuardianName, RegistrationNo, Gender, Role, Department, Handicap, Address, Mobile, Email, BloodGroup, Cnic, Nationality, trackRecord, isPsyFit, JoiningDate, Landline, hasMedIns, Semester, SemDuration, Days, SemFees, Shift, isCivil, Post, Salary, work, Dob)"
                    + "VALUES('"+ name +"','" + guardian + "','" + regNo + "','" + gender + "','" + role + "','" + depart + "','" + handicap + "','" + address + "','" + mobile + "','" + email + "','" + blood + "','" + cnic + "','" + natio + "','" + track + "','" + psy + "','" + join + "','" + land + "','" + med + "','" + sem + "','" + dur + "','" + days + "','" + fees + "','" + shift + "','" + civil + "','" + post + "','" + salary + "','" + work + "','" + dob + "')";
            int result = st.executeUpdate(sql);
            if(result > 1){
                flag = true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Exception: \n" + ex, "Error", JOptionPane.ERROR_MESSAGE);            
        }
        return flag;
    }
    
    public ResultSet patientDetails()
    {
        try{
            st = Connect().createStatement();
            String sql="SELECT ID, pName, GuardianName, Cnic, RegistrationNo, Gender, Role, Department, Handicap, Address, Mobile, Email FROM patientDetails";
            rs=st.executeQuery(sql);
            return rs;
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Exception: \n" + ex, "Error", JOptionPane.ERROR_MESSAGE);            
        }
        return null;
    }
    
    public boolean patientDiaDetails(String pId, String name, String reg, String fId, String con, String fev, String dis, String date, String time, String role)
    {
        try{
            st = Connect().createStatement();
            String sql="INSERT INTO patientDiagnostic(PatientId, uName, reg, FileId, Condition, Fever, Disease, Date1, Time, Role)"
                    + "VALUES('" + pId + "','" + name + "','" + reg + "','" + fId + "','" + con + "','" + fev + "','" + dis + "','" + date + "','" + time + "','" + role + "')";
            int result = st.executeUpdate(sql);
            if(result > 1){
                flag = true;
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Exception: \n" + ex, "Error", JOptionPane.ERROR_MESSAGE);            
        }
        return flag;
    }
    
    public ResultSet getDiaDetails()
    {
        try{
            st = Connect().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String sql="SELECT ID, PatientId, FileId, uName, reg, Fever, Disease, Date1, Time, Role FROM patientDiagnostic";
            rs=st.executeQuery(sql);
            return rs;
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Exception: \n" + ex, "Error", JOptionPane.ERROR_MESSAGE);            
        }
        return null;
    }
    
    public ResultSet getDiaDetails(String str, String reg)
    {
        try{
            st = Connect().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String sql="SELECT ID, PatientId, FileId, uName, reg, Fever, Disease, Date1, Time FROM patientDiagnostic Where uName = '" + str + "' OR " + "reg ='" + reg + "'";
            rs=st.executeQuery(sql);
                return rs; 
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Exception: \n" + ex, "Error", JOptionPane.ERROR_MESSAGE);            
        }
        return null;
    }
    
    public void clearAll(Container aContainer) {
        for(Component c:aContainer.getComponents()) {
            if(c instanceof JTextField || c instanceof JTextArea){
                ((JTextComponent) c).setText("");
            }else if(c instanceof JRadioButton){
                ((JRadioButton) c).setSelected(false);
            }else if(c instanceof JDateChooser){
                 ((JDateChooser) c).setDate(null);
            }else if (c instanceof Container) {
                 clearAll((Container) c);
            }
        }
    }   
}
