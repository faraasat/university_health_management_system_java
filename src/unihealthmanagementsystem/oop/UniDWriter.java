package unihealthmanagementsystem.oop;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;

public class UniDWriter implements Serializable{
    
    // stuWriter Method
    public boolean StuWrite(PhyInfo p, Student s, Diagnostic1 d){
        try {
            try (BufferedWriter myWriter = new BufferedWriter(
                    new FileWriter("src\\unihealthmanagementsystem\\oop\\Student.txt", true)
            )) {
                myWriter.write(p.getGenNo()+";"+p.getId()+";"+p.getPhyName()+";"+p.getEmail()+";"+p.getAddress()+";"+p.getMobile()+"\t"+
                        s.getName()+";"+s.getGuardian()+";"+s.getRegNo()+";"+s.getCnicNo()+";"+s.getMobile()+";"+s.getGender()+";"+s.getAge()+";"+s.getHandicap()+";"+s.getAddress()+";"+s.getEmail()+";"+s.getBlood()+";"+s.getRole()+";"+s.getNationality()+";"+s.getTrackRecord()+";"+s.getIsPsycologicallyFit()+";"+s.getJoiningDate()+";"+s.getLandLine()+";"+s.getHasMedicalInsurance()+";"+s.getShift()+";"+s.getDepart()+";"+s.getIsCivilian()+";"+s.getSemesters()+";"+s.getSemesterDuration()+";"+s.getDays()+";"+s.getSemFee()+"\t"+
                        d.getDiagnosticId()+";"+d.getCondition()+";"+d.getTemperature()+";"+d.getDisease()+";"+d.getPhySugges()+";"+d.getDiaRes()+";"+d.getTime()+";"+d.getDate()+"\n");
            }
            return true;
        } 
        catch (IOException e) {
            System.out.println(e);
            return false;
        }
    }
    
    // FacWriter Method
    public boolean FacWrite(PhyInfo p, Faculty s, Diagnostic1 d){
        try {
            try (BufferedWriter myWriter = new BufferedWriter(
                    new FileWriter("src\\unihealthmanagementsystem\\oop\\Faculty.txt", true)
            )) {
                myWriter.write(p.getGenNo()+";"+p.getId()+";"+p.getPhyName()+";"+p.getEmail()+";"+p.getAddress()+";"+p.getMobile()+"\t"+
                        s.getName()+";"+s.getGuardian()+";"+s.getRegNo()+";"+s.getCnicNo()+";"+s.getMobile()+";"+s.getGender()+";"+s.getAge()+";"+s.getHandicap()+";"+s.getAddress()+";"+s.getEmail()+";"+s.getBlood()+";"+s.getRole()+";"+s.getNationality()+";"+s.getTrackRecord()+";"+s.getIsPsycologicallyFit()+";"+s.getJoiningDate()+";"+s.getLandLine()+";"+s.getHasMedicalInsurance()+";"+s.getShift()+";"+s.getDepart()+";"+s.getPost()+";"+s.getSalary()+";"+"\t"+
                        d.getDiagnosticId()+";"+d.getCondition()+";"+d.getTemperature()+";"+d.getDisease()+";"+d.getPhySugges()+";"+d.getDiaRes()+";"+d.getTime()+";"+d.getDate()+"\n");
            }
            return true;
        } 
        catch (IOException e) {
            System.out.println(e);
            return false;
        }
    }
    
    // WorWrite Method
    public boolean WorWrite(PhyInfo p, Worker s, Diagnostic1 d){
        try {
            try (BufferedWriter myWriter = new BufferedWriter(
                    new FileWriter("src\\unihealthmanagementsystem\\oop\\Worker.txt", true)
            )) {
                myWriter.write(p.getGenNo()+";"+p.getId()+";"+p.getPhyName()+";"+p.getEmail()+";"+p.getAddress()+";"+p.getMobile()+"\t"+
                        s.getName()+";"+s.getGuardian()+";"+s.getRegNo()+";"+s.getCnicNo()+";"+s.getMobile()+";"+s.getGender()+";"+s.getAge()+";"+s.getHandicap()+";"+s.getAddress()+";"+s.getEmail()+";"+s.getBlood()+";"+s.getRole()+";"+s.getNationality()+";"+s.getTrackRecord()+";"+s.getIsPsycologicallyFit()+";"+s.getJoiningDate()+";"+s.getLandLine()+";"+s.getHasMedicalInsurance()+";"+s.getShift()+";"+s.getWork()+";"+s.getSalary()+";"+"\t"+
                        d.getDiagnosticId()+";"+d.getCondition()+";"+d.getTemperature()+";"+d.getDisease()+";"+d.getPhySugges()+";"+d.getDiaRes()+";"+d.getTime()+";"+d.getDate()+"\n");
            }
            return true;
        } 
        catch (IOException e) {
            System.out.println(e);
            return false;
        }
    }
    
}
