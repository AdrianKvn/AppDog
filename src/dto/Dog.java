package dto;

import java.util.ArrayList;

public class Dog {
    private String name;
    private String race;
    private ArrayList<String> colors;
    private String genre;
    private Boolean sterilization;
    public Float weight;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public ArrayList<String> getColors() {
        return colors;
    }

    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Boolean getSterilization() {
        return sterilization;
    }

    public void setSterilization(Boolean sterilization) {
        this.sterilization = sterilization;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }
    public void eat(){
        System.out.println(this.name+" se está alimentando con Dog Chow");
    }
//*
    

}
