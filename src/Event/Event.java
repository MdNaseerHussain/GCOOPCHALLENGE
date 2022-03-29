package Event;
import java.util.ArrayList;

public class Event {
    private String date;
    private String name;
    private ArrayList<String> tasks = new ArrayList<String>();
    private int budget;
    
    public Event(String date, String name, ArrayList<String> tasks) {
        this.date = date;
        this.name = name;
        this.tasks = tasks;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<String> getTasks() {
        return tasks;
    }
    public void setTasks(ArrayList<String> tasks) {
        this.tasks = tasks;
    }
    public int getBudget() {
        return budget;
    }
    public void setBudget(int budget) {
        this.budget = budget;
    }
}
