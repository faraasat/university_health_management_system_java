package unihealthmanagementsystem.oop;

public class Faculty extends Person{
    
    // Vatriable, Objects and Instances
    private String depart;
    private String post;
    private String salary;

    // Constructor
    public Faculty(String name, String guardian, String regNo, String cnicNo, String mobile, String gender, String age, String handicap, String address, String email, String blood, String nationality, String trackRecord, String isPsycologicallyFit, String joiningDate, String landLine, String hasMedicalInsurance, String shift, String depart, String post, String salary) {
        super(name, guardian, regNo, cnicNo, mobile, gender, age, handicap, address, email, blood, "Teacher", nationality, trackRecord, isPsycologicallyFit, joiningDate, landLine, hasMedicalInsurance, shift);
        this.depart = depart;
        this.post = post;
        this.salary = salary;
    }

    // Getters and Setters
    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
    
}
