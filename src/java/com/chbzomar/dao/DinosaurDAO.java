/*
 *This class is in charge of performing the CRUD operations
 */
package com.chbzomar.dao;

import com.chbzomar.database.connection.DBConnection;
import com.chbzomar.model.Dinosaur;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author DELL LATITUDE 7480
 */
public class DinosaurDAO {
    
    DBConnection con;
    
    public DinosaurDAO(DBConnection con){
        this.con = con;
    }
    
    //This method performs the Create Operation
    public boolean insert(Dinosaur dino){
        //Insert statement to be executed
        String sql = "INSERT INTO dinosaurs VALUES (?,?,?,?,?,?)";
        try{
            PreparedStatement ps = con.connect().prepareStatement(sql);
            //MySQL is going to generate this value for us, but we still need to specify it in here
            ps.setInt(1, dino.getId());
            ps.setString(2, dino.getSpeciesName());
            ps.setString(3, dino.getNameMeaning());
            ps.setString(4, dino.getFeeding());
            ps.setString(5, dino.getDescription());
            ps.setString(6, dino.getPeriod());
            
            ps.executeUpdate();
            return true;
        }catch(SQLException e){
            return false;
        }
    }
}
