package President;
import java.util.Scanner;

import Event.Event;
import Society.Society;
import Society.SocietyController;

public interface PresidentController {

    public static void sanctionFund(Scanner scanner) {
        Society society = SocietyController.getSociety(scanner);
        System.out.println("Select Event:");
        for(int i = 1; i <= society.getEvents().size(); i++) {
            System.out.println("Press " + i + " for " + society.getEvents().get(i - 1).getName());
        }
        int count = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter amount:");
        int amount = Integer.parseInt(scanner.nextLine());
        Event event = society.getEvents().get(count - 1);
        event.setBudget(amount);
    }

    public static boolean approveBudget(int budget) {
        return (budget <= 100000);
    }

}
