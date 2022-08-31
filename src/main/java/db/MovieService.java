/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import entities.Movie;

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


public class MovieService {
    public void create(Movie movie)
    {
        Connection c = DBConnection.connect();
        PreparedStatement ps = null; 
        try {
            String sql = "INSERT INTO Movie(title,type,premiereYear,price,status) VALUES(?,?,?,?,?)";
            ps = c.prepareStatement(sql);
            ps.setString(1, movie.getTitle());
            ps.setString(2, movie.getType());
            ps.setInt(3,movie.getPremiereYear());
            ps.setFloat(4, movie.getPrice());
            ps.setBoolean(5, movie.getStatus());
            ps.execute();
            System.out.println("Movie added");
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
    public Movie read(int id) //TODO
    {
        Connection c = DBConnection.connect();
        PreparedStatement ps = null; 
        ResultSet rs=null; 
        Movie movie = null;
        try {
            String sql = "Select * from Movie where ID = ?";
            ps = c.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            boolean tempStatus = false;
            if(rs.getInt("status") == 1) tempStatus = true;
            movie = new Movie(rs.getString("title"),rs.getString("type"),rs.getInt("premiereYear"),rs.getFloat("price"));
            movie.setID(rs.getInt("ID"));
            movie.setStatus(tempStatus);
            if(rs.getInt("person_ID") == 0) movie.setDayOfRent(rs.getInt("daysOfRent"));
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
        return movie;
    }
    public ArrayList<Movie> readAll() //TODO
    {
        Connection c = DBConnection.connect();
        PreparedStatement ps = null; 
        ResultSet rs=null; 
        ArrayList<Movie> movies= new ArrayList<Movie>();
        try {
            String sql = "Select * from Movie ";
            ps = c.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next())
            {
                boolean tempStatus = false;
                if(rs.getInt("status") == 1) tempStatus = true;
                Movie temp = new Movie(rs.getString("title"),rs.getString("type"),rs.getInt("premiereYear"),rs.getFloat("price"));
                temp.setStatus(tempStatus);
                temp.setID(rs.getInt("ID"));
                if(rs.getInt("person_ID") == 0) temp.setDayOfRent(rs.getInt("daysOfRent"));
                movies.add(temp);
            }
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
        return movies;
    }
    public void update(Movie movie)
    {
        Connection c = DBConnection.connect();
        PreparedStatement ps = null; 
        try {
            String sql = "Update Movie set title = ?,type = ?,premiereYear =? ,price = ? where ID = ?";
            ps = c.prepareStatement(sql);
            ps.setString(1, movie.getTitle());
            ps.setString(2, movie.getType());
            ps.setInt(3,movie.getPremiereYear());
            ps.setFloat(4, movie.getPrice());
            ps.setInt(5, movie.getID());
            ps.execute();
            System.out.println("Movie updated");
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
    public void delete(int id)
    {
        Connection c = DBConnection.connect();
        PreparedStatement ps = null; 
        try {
            String sql = "DELETE FROM Movie WHERE id = ?";
            ps = c.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            System.out.println("Movie removed");
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
    public void rent(int person_ID, int daysOfRent,int id)
    {
        Connection c = DBConnection.connect();
        PreparedStatement ps = null; 
        try {
            String sql = "UPDATE Movie set person_ID= ? , daysOfRent = ?, status = 1 where ID = ?";
            ps = c.prepareStatement(sql);
            ps.setInt(1, person_ID);
            ps.setInt(2, daysOfRent);
            ps.setInt(3, id);
            ps.execute();
            System.out.println("Movie rented");
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
    public void retRent(int id)
    {
        Connection c = DBConnection.connect();
        PreparedStatement ps = null; 
        try {
            String sql = "UPDATE Movie set person_ID=0 , daysOfRent =0, status = 0 where ID = ?";
            ps = c.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            System.out.println("Movie returned");
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
}
