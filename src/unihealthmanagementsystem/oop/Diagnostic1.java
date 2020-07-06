package unihealthmanagementsystem.oop;

import java.util.ArrayList;

public class Diagnostic1 {
    
    // Vatriable, Objects and Instances
    private String diagnosticId;
    private String condition;
    private String temperature;
    private ArrayList disease = new ArrayList();
    private String phySugges;
    private String diaRes;
    private String time;
    private String date;

    // Constructor
    public Diagnostic1(String diagnosticId, String condition, ArrayList disease, String temperature, String phySugges, String diaRes, String time, String date) {
        this.diagnosticId = diagnosticId;
        this.condition = condition;
        this.temperature = temperature;
        this.phySugges = phySugges;
        this.diaRes = diaRes;
        this.time = time;
        this.date = date;
        this.disease = disease;
    }

    // Getters and Setters
    public ArrayList getDisease() {
        return disease;
    }

    public void setDisease(ArrayList disease) {
        this.disease = disease;
    }
    
    public String getDiagnosticId() {
        return diagnosticId;
    }

    public void setDiagnosticId(String diagnosticId) {
        this.diagnosticId = diagnosticId;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getPhySugges() {
        return phySugges;
    }

    public void setPhySugges(String phySugges) {
        this.phySugges = phySugges;
    }

    public String getDiaRes() {
        return diaRes;
    }

    public void setDiaRes(String diaRes) {
        this.diaRes = diaRes;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
