/*
 *This class represents a record in table dinosaurs
 */
package com.chbzomar.model;

/**
 *chbzomar@gmail.com
 */
public class Dinosaur {
    
    //Instance variables mapping to each attribute in dinosaurs table
    int id;
    String speciesName, nameMeaning, feeding, description, period;
    
    //Constructor
    public Dinosaur(int id){
        this.id = id;
    }
    
    //Getters & setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }

    public String getNameMeaning() {
        return nameMeaning;
    }

    public void setNameMeaning(String nameMeaning) {
        this.nameMeaning = nameMeaning;
    }

    public String getFeeding() {
        return feeding;
    }

    public void setFeeding(String feeding) {
        this.feeding = feeding;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    @Override
    public String toString() {
        return "Dinosaur{" + "id=" + id + ", speciesName=" + speciesName + ", nameMeaning=" + nameMeaning + ", feeding=" + feeding + ", description=" + description + ", period=" + period + '}';
    }
    
    
    
}
