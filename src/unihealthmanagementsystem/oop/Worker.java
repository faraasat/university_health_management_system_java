package unihealthmanagementsystem.oop;

public class Worker extends Person{
    
    // Vatriable, Objects and Instances
    private String work;
    private String salary;

    // Constructor
    public Worker(String name, String guardian, String regNo, String cnicNo, String mobile, String gender, String age, String handicap, String address, String email, String blood, String nationality, String trackRecord, String isPsycologicallyFit, String joiningDate, String landLine, String hasMedicalInsurance, String shift, String work, String salary) {
        super(name, guardian, regNo, cnicNo, mobile, gender, age, handicap, address, email, blood, "Worker", nationality, trackRecord, isPsycologicallyFit, joiningDate, landLine, hasMedicalInsurance, shift);
        this.work = work;
        this.salary = salary;
    }

    // Getters and Setters
    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
    
}
