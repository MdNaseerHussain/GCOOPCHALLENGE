package Society;
import java.util.ArrayList;
import java.util.HashMap;

import Event.Event;
import Secretary.Secretary;
import SocietyMember.SocietyMember;
import Student.Student;

public class Society {
    private String name;
    private Secretary secretary;
    private HashMap<String, SocietyMember> societyMembers = new HashMap<String, SocietyMember>();
    private ArrayList<Event> events = new ArrayList<Event>();

    public Society(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Secretary getSecretary() {
        return secretary;
    }
    public void setSecretary(Secretary secretary) {
        this.secretary = secretary;
    }
    public HashMap<String, SocietyMember> getSocietyMembers() {
        return societyMembers;
    }
    public void setSocietyMembers(HashMap<String, SocietyMember> societyMembers) {
        this.societyMembers = societyMembers;
    }
    public ArrayList<Event> getEvents() {
        return events;
    }
    public void setEvents(ArrayList<Event> events) {
        this.events = events;
    }
    public void inductStudent(Student student) {
        SocietyMember societyMember = new SocietyMember(student, name);
        societyMembers.put(societyMember.getRollNumber(), societyMember);
    }
}
