import java.util.Scanner;

public class Gymkhana {
    public static President president = new President("Prof.Pres", "xxxxxxxxxx", "xxxx@iitbbs.ac.in");
    public static VicePresident vp;

    public static void main(String[] args) throws Exception {
      Scanner scanner = new Scanner(System.in);
      while(true) {
        System.out.println();
        System.out.println("Press 1: Create new Student");
        System.out.println("Press 2: Induct a Student in a Society");
        System.out.println("Press 3: Hold Society Polls");
        System.out.println("Press 4: Budget Proposal");
        System.out.println("Press 5: Sanction Fund for event");
        System.out.println("Press 6: Discuss about an event");
        System.out.println("Press 7: Hold VP Elections");
        System.out.println("Any Key: Exit");
        String command = scanner.nextLine();
        switch (command) {
          case "1":
            StudentController.addStudent(scanner);
            break;
          case "2":
            SocietyController.inductStudent(scanner);
            break;
          case "3":
            SocietyController.holdPolls(scanner);
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
          case "7":
            VicePresidentController.holdPolls(scanner);
            System.out.println("New Vice President is: " + vp.getName());
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
