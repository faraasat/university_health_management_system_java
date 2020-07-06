package unihealthmanagementsystem.oop;

public class Person {
    
    // Vatriable, Objects and Instances
    private String name;
    private String guardian;
    private String regNo;
    private String cnicNo;
    private String age;
    private String gender;
    private String nationality;
    private String blood;
    private String handicap;
    private String address;
    private String mobile;
    private String email;
    private String joiningDate;
    private String isPsycologicallyFit;
    private String hasMedicalInsurance;
    private String role;
    private String landLine;
    private String trackRecord;
    private String shift;

    // Constructor
    public Person(String name, String guardian, String regNo, String cnicNo, String mobile, String gender, String age, String handicap, String address, String email, String blood, String role, String nationality, String trackRecord, String isPsycologicallyFit, String joiningDate, String landLine, String hasMedicalInsurance, String shift) {
        this.name = name;
        this.mobile = mobile;
        this.guardian = guardian;
        this.regNo = regNo;
        this.cnicNo = cnicNo;
        this.gender = gender;
        this.age = age;
        this.handicap = handicap;
        this.address = address;
        this.email = email;
        this.blood = blood;
        this.role = role;
        this.nationality = nationality;
        this.trackRecord = trackRecord;
        this.isPsycologicallyFit = isPsycologicallyFit;
        this.joiningDate = joiningDate;
        this.landLine = landLine;
        this.hasMedicalInsurance = hasMedicalInsurance;
        this.shift = shift;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getGuardian() {
        return guardian;
    }

    public void setGuardian(String guardian) {
        this.guardian = guardian;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getCnicNo() {
        return cnicNo;
    }

    public void setCnicNo(String cnicNo) {
        this.cnicNo = cnicNo;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHandicap() {
        return handicap;
    }

    public void setHandicap(String handicap) {
        this.handicap = handicap;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getTrackRecord() {
        return trackRecord;
    }

    public void setTrackRecord(String trackRecord) {
        this.trackRecord = trackRecord;
    }

    public String getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }

    public String getLandLine() {
        return landLine;
    }

    public void setLandLine(String landLine) {
        this.landLine = landLine;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getIsPsycologicallyFit() {
        return isPsycologicallyFit;
    }

    public void setIsPsycologicallyFit(String isPsycologicallyFit) {
        this.isPsycologicallyFit = isPsycologicallyFit;
    }

    public String getHasMedicalInsurance() {
        return hasMedicalInsurance;
    }

    public void setHasMedicalInsurance(String hasMedicalInsurance) {
        this.hasMedicalInsurance = hasMedicalInsurance;
    }
    
    
}
