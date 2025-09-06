package Practice_ArrayList.PharmacyManagementSystem.models;

import Practice_ArrayList.PharmacyManagementSystem.Enums.Gender;
import Practice_ArrayList.PharmacyManagementSystem.Enums.Position;
import Practice_ArrayList.PharmacyManagementSystem.db.GenerateID;

public class Employee {
    private Long id;
    private String fullName;
    private String email;
    private String phoneNumber;
    private double experience;
    private Position position;
    private Gender gender;

    public Employee() {
        this.id = GenerateID.genEmployeeId();
    }

    public Employee(String fullName, String email, String phoneNumber, double experience, Position position, Gender gender) {
        this.id = GenerateID.genEmployeeId();;
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.experience = experience;
        this.position = position;
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return  "\n~~~~~~~Employee~~~~~~~~~~~~" + "\n" +
                "Empl ID: " + id + "\n" +
                "Full Name: " + fullName + '\n' +
                "Email: " + email + '\n' +
                "PhoneNumber: " + phoneNumber + '\n' +
                "Experience: " + experience + "\n" +
                "Position: " + position + "\n" +
                "Gender: " + gender + "\n" ;
    }
}
