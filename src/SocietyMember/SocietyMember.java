package SocietyMember;

import Student.Student;

public class SocietyMember extends Student {
    String societyName;

    public SocietyMember(Student student, String societyName) {
        super(student.getName(), student.getRollNumber(), student.getPhone(), student.getEmail());
        this.societyName = societyName;
    }

    public String getSocietyName() {
        return societyName;
    }

    public void setSocietyName(String societyName) {
        this.societyName = societyName;
    }
}
