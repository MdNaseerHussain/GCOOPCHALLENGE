import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Gymkhana {
    private static HashMap<String, Student> students = new HashMap<String, Student>();
    private static ArrayList<String> societies = new ArrayList<String>(Arrays.asList("Neuromancers", "RISC", "WebD"));
    private static HashMap<String, HashSet<SocietyMember>> societyMembers = new HashMap<String, HashSet<SocietyMember>>();

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println();
            System.out.println("Press 1: Create new Student");
            System.out.println("Press 2: Induct a Student in a Society");
            System.out.println("Press 3: Hold Polls");
            System.out.println("Press 4: Budget Proposal");
            System.out.println("Press 5: Sanction Fund for event");
            System.out.println("Press 6: Discuss about an event");
            System.out.println("Any Key: Exit");
            String command = scanner.nextLine();
            switch (command) {
                case "1":
                  addStudent(scanner);
                  break;
                case "2":
                  inductStudent(scanner);
                  break;
                case "3":
                  holdPolls(scanner);
                  break;
                case "4":
                  proposeBudget(scanner);
                  break;
                case "5":
                  sanctionFund(scanner);
                  break;
                case "6":
                  discussEvent(scanner);
                  break;
                default:
                  scanner.close();
                  return;
              }
        }
    }

    private static void inductStudent(Scanner scanner) {
        System.out.println();
        System.out.println("Enter Roll Number:");
        String rollNumber = scanner.nextLine();
        System.out.println("Select Society:");
        for(int i = 0; i < societies.size(); i++) {
            System.out.println("Press " + i + ": " + societies.get(i));
        }
        int societyIndex = Integer.parseInt(scanner.nextLine());
        if(societyIndex >= societies.size()) {
            System.out.println("Invalid Society Name");
            return;
        }
        String societyName = societies.get(societyIndex);
        Student student = students.get(rollNumber);
        if(student != null) {
            SocietyMember societyMember = new SocietyMember(student, societyName);
            if(societyMembers.get(societyName) == null) {
              societyMembers.put(societyName, new HashSet<SocietyMember>());
            }
            societyMembers.get(societyName).add(societyMember);
        } else {
            System.out.println("Student does not exist");
        }
    }

    private static void discussEvent(Scanner scanner) {
    }

    private static void sanctionFund(Scanner scanner) {
    }

    private static void proposeBudget(Scanner scanner) {
    }

    private static void holdPolls(Scanner scanner) {
    }

    private static void addStudent(Scanner scanner) {
        Student student = getStudentDetails(scanner);
        students.put(student.getRollNumber(), student);
    }

    private static Student getStudentDetails(Scanner scanner) {
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
        return student;
    }
}
