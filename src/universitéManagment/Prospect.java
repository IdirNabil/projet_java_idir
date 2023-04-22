package universitéManagment;

public class Prospect extends Person {
    private String levelInterest;

    public Prospect(String firstName, String lastName, String birthdate, String levelInterest) {
        super(firstName, lastName, birthdate);
        this.levelInterest = levelInterest;
    }

    // Getters and setters
    public String getLevelInterest() {
        return levelInterest;
    }

    public void setLevelInterest(String levelInterest) {
        this.levelInterest = levelInterest;
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
    
    
    
    

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getLastName() + '\'' +
                ", firstName='" + getFirstName() + '\'' +
                ", dateOfBirth='" + getDateDeNaissance() + '\'' +
                ", level='" +  levelInterest + '\'' +
                '}';
    }
    
    @Override
    public String getType() {
        return "Prospect";
    }
    
    
    
    
    
}

