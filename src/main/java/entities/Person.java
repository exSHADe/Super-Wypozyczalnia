/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author pawel
 */
public class Person {
    private int person_ID;
    private String fullName;
    private String adress;
    private int phoneNumber;

    public void setPerson_ID(int person_ID) {
        this.person_ID = person_ID;
    }
    
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPerson_ID() {
        return person_ID;
    }


    public String getFullName() {
        return fullName;
    }

    public String getAdress() {
        return adress;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public Person(String fullName, String adress, int phoneNumber) {
        this.fullName = fullName;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
    }

    
}
