import java.util.Scanner;

public class Gymkhana {
    static StudentController studentController = new StudentController();
    static SocietyController societyController = new SocietyController();

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
            studentController.addStudent(scanner);
            break;
          case "2":
            societyController.inductStudent(scanner, studentController);
            break;
          case "3":
            societyController.holdPolls(scanner, studentController);
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

    private static void discussEvent(Scanner scanner) {
    }

    private static void sanctionFund(Scanner scanner) {
    }

    private static void proposeBudget(Scanner scanner) {
    }
}
