import java.util.Scanner;

import GSec.GSecController;
import President.President;
import President.PresidentController;
import Society.SocietyController;
import Student.StudentController;
import VicePresident.VicePresident;
import VicePresident.VicePresidentController;

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
        System.out.println("Press 8: Hold GSec Elections");
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
            GSecController.proposeBudget(scanner);
            break;
          case "5":
            PresidentController.sanctionFund(scanner);
            break;
          case "6":
            VicePresidentController.discussEvent(scanner);
            break;
          case "7":
            vp = VicePresidentController.holdPolls(scanner);
            System.out.println("New Vice President is: " + vp.getName());
            break;
          case "8":
            GSecController.holdPolls(scanner);
            break;
          default:
            scanner.close();
            return;
        }
      }
    }
}
