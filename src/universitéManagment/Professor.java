package universitéManagment;

public class Professor extends Person {
    private String department;
    String specialite;

    public Professor(String firstName, String lastName, String birthdate,  String specialite, String department) {
        super(firstName, lastName, birthdate);
        this.department = department;
        this.specialite=specialite;
    }

    @Override
    public String getType() {
        return "Professor";
    }

    // Getters and setters
    public String getDepartment() {
        return department;
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

    public void setDepartment(String department) {
        this.department = department;
    }
    
    @Override
    public String toString() {
        return "Student{" +
                "name='" + getLastName() + '\'' +
                ", firstName='" + getFirstName() + '\'' +
                ", dateOfBirth='" + getDateDeNaissance() + '\'' +
                ", Spécialité='" + specialite + '\'' +
                ", Département='" +  department+ '\'' +
                '}';
    }
    
    
    
}

