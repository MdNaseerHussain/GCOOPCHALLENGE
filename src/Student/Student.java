package Student;
public class Student {
    private String name;
    private String rollNumber;
    private String phone;
    private String email;

    public Student(String name, String rollNumber, String phone, String email) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.phone = phone;
        this.email = email;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getRollNumber() {
        return rollNumber;
    }
    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
}