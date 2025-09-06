package Lesson_ArrayList.HomeWork.Models;

import Lesson_ArrayList.HomeWork.Enums.Gender;
import Lesson_ArrayList.HomeWork.db.BGenerateID;
import Practice_ArrayList.PharmacyManagementSystem.db.GenerateID;

public class Reader {
    private Long id;
    private String fullName;
    private String email;
    private String phoneNumber;
    private Gender gender;

    public Reader() {
    }

    public Reader( String fullName, String email, String phoneNumber, Gender gender) {
        this.id = BGenerateID.genReaderId();
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "\n~~~~~~~Reader~~~~~~~~~~" + "\n" +
                "Reader ID: " + id + "\n" +
                "Full Name: "  + fullName + '\n' +
                "Email: " + email + '\n' +
                "Phone Number: " + phoneNumber + '\n' +
                "Gender: " + gender + "\n" ;
    }
}
