import java.util.ArrayList;

public class GSec extends Student {

    String counselName;
    ArrayList<Society> counselSocieties;

    public GSec(Student student, String counselName, ArrayList<Society> counselSocieties) {
        super(student.getName(), student.getRollNumber(), student.getPhone(), student.getEmail());
        this.counselName = counselName;
        this.counselSocieties = counselSocieties;
    }
    
    public String getCounselName() {
        return counselName;
    }

    public void setCounselName(String counselName) {
        this.counselName = counselName;
    }

    public ArrayList<Society> getCounselSocieties() {
        return counselSocieties;
    }

    public void setCounselSocieties(ArrayList<Society> counselSocieties) {
        this.counselSocieties = counselSocieties;
    }

}