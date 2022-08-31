/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import entities.Hash;
import entities.User;

/**
 *
 * @author pawel
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class AuthService {
    private final String secret = "Dyktadyktom";
    public User login(int ID, String password)
    {
        Connection c= DBConnection.connect();
        PreparedStatement ps = null;
        ResultSet rs=null;
        User user = null;
        try
        {
           String sql = "SELECT * FROM User WHERE ID = ? and password = ?";
           ps = c.prepareStatement(sql);
           ps.setInt(1, ID);
           ps.setString(2, Hash.encrypt(password, secret));
           rs = ps.executeQuery();  
           user = new User(rs.getInt("ID"),rs.getString("name"),rs.getString("password"));
        }
        catch (SQLException ex)
        {
            System.out.println(ex.toString());
        }
        finally {
           try
           {
               rs.close();
               ps.close();
               c.close();
           } 
           catch(SQLException ex) 
           {
               System.out.println(ex.toString());
           }
       }
       return user;
    }
    public void create(User user) {
        Connection c = DBConnection.connect();
        PreparedStatement ps = null; 
        try {
            String sql = "INSERT INTO User(name,password) VALUES(?,?)";
            ps = c.prepareStatement(sql);
            //ps.setInt(1, user.getID());
            ps.setString(1, user.getName());
            ps.setString(2,Hash.encrypt(user.getPassword(), secret));
            ps.execute();
            System.out.println("User created");
        } 
        catch (SQLException ex)
        {
            System.out.println(ex.toString());
        }
        finally {
           try
           {
               ps.close();
               c.close();
           } 
           catch(SQLException ex) 
           {
               System.out.println(ex.toString());
           }
       }
    }  
}
