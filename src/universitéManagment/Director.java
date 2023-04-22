package universitéManagment;

import java.util.Date;

public class Director extends Person {
  
    private double salary;
    private int anneeArrive;
   

    public Director(String firstName, String lastName, String dateOfBirth, double salary){
        super(firstName, lastName, dateOfBirth);
        this.salary = salary;
       
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
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
        return "Directeur{" +
                "name='" + getLastName() + '\'' +
                ", firstName='" + getFirstName() + '\'' +
                ", dateOfBirth='" + getDateDeNaissance() + '\'' +
                ", ='année_Arrive" +anneeArrive+ '\'' +
                ", ='salaire:" + salary+ '\'' +
                '}';
    }
  
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return null;
	}

   
    
    
    


}
