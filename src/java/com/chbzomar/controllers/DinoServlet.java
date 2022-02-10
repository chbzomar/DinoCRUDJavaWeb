/*
 *This class is the Controller for Dinosaur Entity
 */
package com.chbzomar.controllers;

import com.chbzomar.dao.DinosaurDAO;
import com.chbzomar.database.connection.DBConnection;
import com.chbzomar.model.Dinosaur;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DELL LATITUDE 7480
 */
public class DinoServlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Getting values from form
        String speciesName = request.getParameter("speciesName");
        String nameMeaning = request.getParameter("nameMeaning");
        String feeding = request.getParameter("feeding");
        String description = request.getParameter("description");
        String period = request.getParameter("period");
        
        //Setting those values to a Dinosaur object
        Dinosaur dino = new Dinosaur(0);    
        dino.setSpeciesName(speciesName);
        dino.setNameMeaning(nameMeaning);
        dino.setFeeding(feeding);
        dino.setDescription(description);
        dino.setPeriod(period);
        
        //Printing the object
        System.out.println(dino);
        
        //We need to call DinosaurDAO.insert() method
        DBConnection con = new DBConnection();
        DinosaurDAO dao = new DinosaurDAO(con);
        boolean status = dao.insert(dino);
        
        //Message for the user
        String msg = "";
        if(status){
            msg = "Your dinosaur was succesfully saved";
        }
        else{
            msg = "Sorry! We couldn´t save your Dino register";
        }
        
        con.disconnect();
        RequestDispatcher rd;
        
        //This is for us to make sure the message is available at the view
        request.setAttribute("message", msg);
        
        //Redirect and show the user our message
        rd = request.getRequestDispatcher("/response.jsp");
        rd.forward(request, response);
        
        
        
        

    }

    
}
