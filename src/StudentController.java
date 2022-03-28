import java.util.HashMap;
import java.util.Scanner;

public class StudentController {
    private static HashMap<String, Student> students = new HashMap<String, Student>();

    public static HashMap<String, Student> getStudents() {
        return students;
    }

    public static void setStudents(HashMap<String, Student> students) {
        StudentController.students = students;
    }

    public Student getStudent(Scanner scanner) {
        System.out.println("Enter Roll Number:");
        String rollNumber = scanner.nextLine();
        Student student = students.get(rollNumber);
        return student;
    }

    public void addStudent(Scanner scanner) {
        System.out.println();
        System.out.println("Enter Name of the Student:");
        String name = scanner.nextLine();
        System.out.println("Enter Roll Number:");
        String rollNumber = scanner.nextLine();
        System.out.println("Enter mobile number:");
        String phone = scanner.nextLine();
        System.out.println("Enter email ID:");
        String email = scanner.nextLine();
        Student student = new Student(name, rollNumber, phone, email);
        students.put(student.getRollNumber(), student);
    }
}
