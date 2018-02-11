/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mert.donmezyurek-ug
 */
public class Patient extends Account {

    private String gender, bloodType, registrationDate, phoneNumber;

    public Patient() {

        super();
        gender = "";
        bloodType = "";
    }

    public String getGender() {

        return gender;
    }

    public String getPhoneNumber() {

        return phoneNumber;
    }

    public String getBloodType() {

        return bloodType;
    }

    public String getRegistrationDate() {

        return registrationDate;
    }

    public void setGender(String gender) {

        this.gender = gender;
    }

    public void setPhoneNumber(String phoneNumber) {

        this.phoneNumber = phoneNumber;
    }

    public void setRegistrationDate(String registrationDate) {

        this.registrationDate = registrationDate;
    }

    public void setBloodType(String bloodType) {

        this.bloodType = bloodType;
    }
}
