package unihealthmanagementsystem.oop;

import java.util.ArrayList;

public class DiseaseFinder {
    
    // Vatriable, Objects and Instances
    private String condition;
    private String temperature;
    private ArrayList a = new ArrayList();
    private int num = 0;
    private int t = 0;
    private String s;

    // Constructor
    public DiseaseFinder(String condition, String temperature, ArrayList disease) {
        this.condition = condition;
        this.temperature = temperature;
        this.a = disease;
    }

    // Getters and Setters
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

    public ArrayList getDisease() {
        return a;
    }

    public void setDisease(ArrayList disease) {
        this.a = disease;
    }
    
    // diagnosticResult Method
    public String diagnoseResult(){
        switch (condition) {
            case "Normal":
                num = 1;
                t = 2;
                break;
            case "Worse":
                num = 1;
                t = 3;
                break;
            case "Severe":
                num = 2;
                t = 3;
                break;
            default:
                break;
        }
        if(Double.parseDouble(temperature) > 98.2){
            if(a.get(0).equals("Fever") || a.get(0).equals("Flu") || a.get(0).equals("Headace") && a.get(1).equals("Fever") || a.get(1).equals("Flu") || a.get(1).equals("Headace") && a.get(2).equals("Fever") || a.get(2).equals("Flu") || a.get(2).equals("Headace")){
                s = "Your diagnosed disease is viral Influenza\nMedicine for you are  \n  -1) Panadol x" + num + " " + t + " times \n  -2) Hydrilin Syrup x" + num + " " + t + " times \n  -3) Calpol Syrup x" + num + " " + t + " times";
            } 
            else if(a.get(0).equals("Fever") || a.get(0).equals("Flu") || a.get(0).equals("Headace") && a.get(1).equals("Fever") || a.get(1).equals("Flu") || a.get(1).equals("Headace")){
                s = "Your diagnosed disease is Food Poisoning\nMedicine for you are\n  -1) Panadol x" + num + " " + t + " times \n  2) Ledger Plex Syrup x" + num + " " + t + " times \n  -3) Calpol Syrup x" + num + " " + t + " times";
            } 
            else if(a.get(0).equals("Fever") || a.get(0).equals("Flu") || a.get(0).equals("Headace")){
                s = "Your diagnosed problem is Workload and less sleep\nMedicine for you are  \n  -1) Panadol x" + num + " " + t + " times \n  -2) Hydrilin Syrup x" + num + " " + t + " times \n  -3) Calpol Syrup x" + num + " " + t + " times";
            }
            return s;
        } 
        else {
            if(a.get(0).equals("Fever") || a.get(0).equals("Flu") || a.get(0).equals("Headace") && a.get(1).equals("Fever") || a.get(1).equals("Flu") || a.get(1).equals("Headace") && a.get(2).equals("Fever") || a.get(2).equals("Flu") || a.get(2).equals("Headace")){
                s = "Your diagnosed disease is viral Influenza\nMedicine for you are \n  -1) Panadol x" + num + " " + t + " times \n  -2) Hydrilin Syrup x" + num + " " + t + " times";
            } 
            else if(a.get(0).equals("Fever") || a.get(0).equals("Flu") || a.get(0).equals("Headace") && a.get(1).equals("Fever") || a.get(1).equals("Flu") || a.get(1).equals("Headace")){
                s = "Your diagnosed disease is Food Poisoning\nMedicine for you are \n  -1) Panadol x" + num + " " + t + " times \n  -2) Ledger Plex Syrup x" + num + " " + t + " times";
            } 
            else if(a.get(0).equals("Fever") || a.get(0).equals("Flu") || a.get(0).equals("Headace")){
                s = "Your diagnosed problem is Workload and less sleep\nMedicine for you are \n  -1) Panadol x" + num + " " + t + " times";
            }
            return s;
        }
    }
    
}
