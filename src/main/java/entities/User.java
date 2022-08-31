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
public class User {
    private int ID;
    private String name;
    private String password;

    public void setID(int ID) {
        this.ID = ID;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public int getID() {
        return ID;
    }
    public String getName() {
        return name;
    }
    public String getPassword() {
        return password;
    }

    public User(int ID, String name, String password) {
        this.ID = ID;
        this.name = name;
        this.password = password;
    }
    
}
