/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chbzomar.database.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author DELL LATITUDE 7480
 */
public class DBConnection {
    
    private static final String db = "dinosaurs";
    private static final String user = "root";
    private static final String password = "root";
    private static final String url = "jdbc:mysql://localhost/"+db;
    
    Connection con = null;
    
    public DBConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            if(con != null){
                System.out.println("Conectado a BD "+con+" OK");
            }
        } catch (SQLException e) {
            System.out.println("Excepcion: "+e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Excepcion Driver: "+e.getMessage());
        }

    }
    
    public Connection connect(){
        return con;
    }
    
    public void disconnect(){
        System.out.println("Disconnecting from "+con);
        if(con != null){
            try{
                con.close();
            }catch(SQLException e){
                System.out.println(e);
            }
        }
    }
    
    
}
