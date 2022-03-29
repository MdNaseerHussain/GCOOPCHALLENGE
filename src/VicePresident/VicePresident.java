package VicePresident;

import Student.Student;

public class VicePresident extends Student {

    public VicePresident(Student student) {
        super(student.getName(), student.getRollNumber(), student.getPhone(), student.getEmail());
    }
    
}
