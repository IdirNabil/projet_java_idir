package universitéManagment;
import java.io.Serializable;

public class Student extends Person implements Serializable {

    private static final long serialVersionUID = 1L;
	private String studentId;
    private String level;
    private float[] grades;

    public Student(String firstName, String lastName, String birthdate,  String level) {
        super(firstName, lastName, birthdate);
        this.level = level;

    }
    
    /////////////////////////////////////////////////////getters et setters////////////////////////////////////////////////////////////


    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

  

    public String getFirstName() {
        return super.getFirstName();
    }

    public String getLastName() {
        return super.getLastName();
    }

    public String getDateDeNaissance() {
        return super.getBirthdate();
    }

    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Override
    public String toString() {
        return "Student{" +
                "name='" + getLastName() + '\'' +
                ", firstName='" + getFirstName() + '\'' +
                ", dateOfBirth='" + getDateDeNaissance() + '\'' +
                ", level='" + level + '\'' +
                '}';
    }

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return null;
	}
}
