package unihealthmanagementsystem.oop;

public class PhyInfo {
    
    // Vatriable, Objects and Instances
    private String genNo;
    private String id;
    private String phyName;
    private String email;
    private String address;
    private String mobile;

    // Constructor
    public PhyInfo(String genNo, String id, String phyName, String email, String address, String mobile) {
        this.genNo = genNo;
        this.id = id;
        this.phyName = phyName;
        this.email = email;
        this.address = address;
        this.mobile = mobile;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhyName() {
        return phyName;
    }

    public void setPhyName(String phyName) {
        this.phyName = phyName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getGenNo() {
        return genNo;
    }

    public void setGenNo(String genNo) {
        this.genNo = genNo;
    }
    
}
