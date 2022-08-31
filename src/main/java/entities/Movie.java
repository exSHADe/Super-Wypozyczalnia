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
public class Movie {
    private int ID;
    private String title;
    private String type;
    private int premiereYear;
    private float price;
    private boolean status;
    private int dayOfRent;
    private Person person;

    public int getID() {
        return ID;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public int getPremiereYear() {
        return premiereYear;
    }

    public float getPrice() {
        return price;
    }

    public boolean getStatus() {
        return status;
    }

    public Person getPerson() {
        return person;
    }

    public int getDayOfRent() {
        return dayOfRent;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPremiereYear(int premiereYear) {
        this.premiereYear = premiereYear;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setDayOfRent(int dayOfRent) {
        this.dayOfRent = dayOfRent;
    }

    public Movie(String title, String type, int premiereYear, float price) {
        this.title = title;
        this.type = type;
        this.premiereYear = premiereYear;
        this.price = price;
        this.status = status;
    }

}
