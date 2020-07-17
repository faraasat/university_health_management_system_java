package unihealthmanagementsystem.oop;

public class Student extends Person{
    
    // Vatriable, Objects and Instances
    private String depart;
    private String isCivilian;
    private String semesters;
    private String semesterDuration;
    private String days;
    private String semFee;

    // Constructor
    public Student(String name, String guardian, String regNo, String cnicNo, String mobile, String gender, String age, String handicap, String address, String email, String blood, String nationality, String trackRecord, String isPsycologicallyFit, String shift, String joiningDate, String landLine, String hasMedicalInsurance, String depart, String isCivilian, String semesters, String semesterDuration, String days, String semFee) {
        super(name, guardian, regNo, cnicNo, mobile, gender, age, handicap, address, email, blood, "Student", nationality, trackRecord, isPsycologicallyFit, joiningDate, landLine, hasMedicalInsurance, shift);
        this.depart = depart;
        this.isCivilian = isCivilian;
        this.semesters = semesters;
        this.semesterDuration = semesterDuration;
        this.days = days;
        this.semFee = semFee;
    }

    // Getters and Setters
    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getIsCivilian() {
        return isCivilian;
    }

    public void setIsCivilian(String isCivilian) {
        this.isCivilian = isCivilian;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public String getSemesters() {
        return semesters;
    }

    public void setSemesters(String semesters) {
        this.semesters = semesters;
    }

    public String getSemesterDuration() {
        return semesterDuration;
    }

    public void setSemesterDuration(String semesterDuration) {
        this.semesterDuration = semesterDuration;
    }

    public String getSemFee() {
        return semFee;
    }

    public void setSemFee(String semFee) {
        this.semFee = semFee;
    }
    
}
