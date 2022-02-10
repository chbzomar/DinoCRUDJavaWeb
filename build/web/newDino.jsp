<%-- 
    Document   : newDino
    Created on : 9/02/2022, 07:13:49 PM
    Author     : DELL LATITUDE 7480
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New Dinosaur</title>
    </head>
    <body>
        <h1>Type the required information to save a new Dino</h1>
        <form action = "dino" method = "post" autocomplete = "off">
            <input type = "text" name = "speciesName" placeholder = "What is the species name?"required maxlength = "30"/>
            <input type = "text" name = "nameMeaning" placeholder = "Name meaning"required maxlength = "100"/>
            <input type = "text" name = "feeding" placeholder = "For example carnivorous"required = "30"/>
            <input type = "text" name = "description" placeholder = ""required maxlenght = "200"/>
            <input type = "text" name = "period" placeholder = "Jurassic / Cretaceus..."required maxlenght = "30"/>
            <input type = "submit" value = "Save"/>
        </form>
    </body>
</html>
