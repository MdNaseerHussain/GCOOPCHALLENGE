package VicePresident;
import java.util.ArrayList;
import java.util.Scanner;

import Event.Event;
import Society.Society;
import Society.SocietyController;
import Student.Student;
import Student.StudentController;

public interface VicePresidentController {
    public static void discussEvent(Scanner scanner) {
        System.out.println("Enter event name:");
        String name = scanner.nextLine();
        System.out.println("Enter date in DD-MM-YY format:");
        String date = scanner.nextLine();
        Society society = SocietyController.getSociety(scanner);
        ArrayList<String> tasks = new ArrayList<String>();
        System.out.println("Enter number of tasks:");
        int count = Integer.parseInt(scanner.nextLine());
        for(int i = 1; i <= count; i++) {
            System.out.println("Enter task " + i + " :");
            String task = scanner.nextLine();
            tasks.add(task);
        }
        ArrayList<Event> events = society.getEvents();
        events.add(new Event(date, name, tasks));
        society.setEvents(events);
    }

    public static VicePresident holdPolls(Scanner scanner) {
        System.out.println("Enter the number of candidates:");
        int count = Integer.parseInt(scanner.nextLine());
        ArrayList<Student> candidates = new ArrayList<Student>();
        ArrayList<Integer> votes = new ArrayList<Integer>();
        for(int i = 1; i <= count; i++) {
            System.out.print("Candidate " + i + " ");
            Student student = StudentController.getStudent(scanner);
            if(student != null) {
                candidates.add(student);
                votes.add(0);
            }
        }
        for(int i = 1; i <= candidates.size(); i++) {
            System.out.println("Press " + i + " to vote for " + ((Student) candidates.get(i-1)).getName());
        }
        System.out.println();
        int maxVotes = 0;
        Student leadingCandidate = (Student) candidates.get(0);
        for(Student voter: StudentController.getStudents().values()) {
            System.out.println(voter.getName() + " voted for option:");
            int vote = Integer.parseInt(scanner.nextLine());
            int value = (int) votes.get(vote - 1);
            votes.add(vote - 1, value + 1);
            if(value + 1 > maxVotes) {
                maxVotes = value + 1;
                leadingCandidate = (Student) candidates.get(vote - 1);
            }
        }
        return new VicePresident(leadingCandidate);
    }
}
