package universitéManagment;

public class Staff extends Person {
    private String department;

    public Staff(String firstName, String lastName, String birthdate, String department) {
        super(firstName, lastName, birthdate);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String toString() {
        return "Staff{" +
                
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", birthdate='" + getBirthdate() + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return null;
	}
}
