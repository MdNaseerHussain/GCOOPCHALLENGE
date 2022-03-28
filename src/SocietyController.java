import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

abstract class SocietyController {
    private static ArrayList<Society> societies = new ArrayList<Society>(Arrays.asList(new Society("Neuromancers"), new Society("RISC")));

    public static ArrayList<Society> getSocieties() {
        return societies;
    }

    public static void setSocieties(ArrayList<Society> societies) {
        SocietyController.societies = societies;
    }

    public static void inductStudent(Scanner scanner) {
        Society society = getSociety(scanner);
        if(society == null) {
            System.out.println("Society does not exist");
            return;
        }
        Student student = StudentController.getStudent(scanner);
        if(student == null) {
            System.out.println("Student does not exist");
        } else {
            society.inductStudent(student);
        }
    }

    public static void holdPolls(Scanner scanner) {
        Society society = getSociety(scanner);
        if(society == null) {
            System.out.println("Society does not exist");
            return;
        }
        System.out.println("Enter the number of candidates:");
        int count = Integer.parseInt(scanner.nextLine());
        ArrayList<SocietyMember> candidates = new ArrayList<SocietyMember>();
        ArrayList<Integer> votes = new ArrayList<Integer>();
        for(int i = 1; i <= count; i++) {
            System.out.print("Candidate " + i + " ");
            Student student = StudentController.getStudent(scanner);
            if(student == null) {
                continue;
            }
            SocietyMember societyMember = society.getSocietyMembers().get(student.getRollNumber());
            if(societyMember != null) {
                candidates.add(societyMember);
                votes.add(0);
            }
        }
        for(int i = 1; i <= candidates.size(); i++) {
            System.out.println("Press " + i + " to vote for " + ((SocietyMember) candidates.get(i-1)).getName());
        }
        System.out.println();
        int maxVotes = 0;
        SocietyMember leadingCandidate = (SocietyMember) candidates.get(0);
        for(SocietyMember voter: society.getSocietyMembers().values()) {
            System.out.println(voter.getName() + " voted for option:");
            int vote = Integer.parseInt(scanner.nextLine());
            int value = (int) votes.get(vote - 1);
            votes.add(vote - 1, value + 1);
            if(value + 1 > maxVotes) {
                maxVotes = value + 1;
                leadingCandidate = (SocietyMember) candidates.get(vote - 1);
            }
        }
        society.setSecretary(new Secretary(StudentController.getStudents().get(leadingCandidate.getRollNumber()), society.getName()));
        System.out.println("New Secretary is: " + society.getSecretary().getName());
    }

    public static Society getSociety(Scanner scanner) {
        System.out.println();
        System.out.println("Select Society:");
        for(int i = 0; i < societies.size(); i++) {
          System.out.println("Press " + i + ": " + societies.get(i).getName());
        }
        int societyIndex = Integer.parseInt(scanner.nextLine());
        if(societyIndex >= societies.size()) {
          System.out.println("Invalid Society Name");
          return null;
        }
        Society society = societies.get(societyIndex);
        return society;
    }
}
