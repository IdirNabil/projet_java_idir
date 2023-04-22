package universitéManagment;

import java.util.Date;

public abstract class Person {
    private String firstName;
    private String lastName;
    private String birthdate;
    private String email;
    private String phoneNumber;
    
    /////////////////////////////////////////////constructeur///////////////////////////////

    public Person(String firstName, String lastName, String birthdate2) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate2;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public abstract String getType();
    

    // /////////////////////////////////////Getters and setters////////////////////////////////////////
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public  String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
