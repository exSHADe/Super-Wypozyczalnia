/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import entities.Person;
import db.DBConnection;

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



public class PersonService {
    public void create(Person person)
    {
        Connection c = DBConnection.connect();
        PreparedStatement ps = null; 
        try {
            String sql = "INSERT INTO Person(fullname,adress,phoneNumber) VALUES(?,?,?)";
            ps = c.prepareStatement(sql);
            ps.setString(1,person.getFullName());
            ps.setString(2,person.getAdress());
            ps.setInt(3,person.getPhoneNumber());
            ps.execute();
            System.out.println("Person added");
        } 
        catch(SQLException ex) 
        {
            System.out.println(ex.toString());
        } 
        finally 
        {
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
    
    public int readLast()
    {
        Connection c = DBConnection.connect();
        PreparedStatement ps = null; 
        ResultSet rs = null;
        int id = 0;
        try {
            String sql = "SELECT max(ID) FROM Person";
            ps = c.prepareStatement(sql);
            rs = ps.executeQuery();
            id = rs.getInt("ID");
        } 
        catch(SQLException ex) 
        {
            System.out.println(ex.toString());
        } 
        finally 
        {
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
        return id;
    }
}
