import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

abstract class GSecController {
    
    private static HashMap<String, GSec> GSecs = new HashMap<String, GSec>();

    public static void proposeBudget(Scanner scanner) {
        System.out.println("Enter budget amount:");
        int amount = Integer.parseInt(scanner.nextLine());
        String reply = PresidentController.approveBudget(amount) ? "Approved" : "Denied";
        System.out.println(reply);
    }

    public static void holdPolls(Scanner scanner) {
        String counsel = getCounsel(scanner);
        if(counsel == null) {
            return;
        }
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
        ArrayList<Society> counselSocieties = new ArrayList<Society>();
        for(int i = 0; i < SocietyController.getSocieties().size(); i++) {
            System.out.println("Press 1 to select " + SocietyController.getSocieties().get(i).getName() + " society");
            String command = scanner.nextLine();
            if(command == "1") {
                counselSocieties.add(SocietyController.getSocieties().get(i));
            }
        }
        GSecs.put(counsel, new GSec(leadingCandidate, counsel, counselSocieties));
        System.out.println("New GSec " + counsel + " is " + GSecs.get(counsel).getName());
    }

    private static String getCounsel(Scanner scanner) {
        System.out.println("Press 1 for Tech Elections");
        System.out.println("Press 2 for Cult Elections");
        System.out.println("Press 3 for Sports Elections");
        String command = scanner.nextLine();
        switch (command) {
            case "1":
              return "Tech";
            case "2":
                return "Cult";
            case "3":
                return "Sports";
            default:
              System.out.println("Invalid input");
              return null;
        }
    }

}
