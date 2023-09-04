package com.example.planetapp;
// model class defines the DS of each item of the adapterview(List view)
public class planet {

    //Attributes - holds data that you want to display for each Item of the adapter view
    private String planet;
    private String moons;
    private int planetImage;


    //constructor - when the class is called the constructor runs automatically


    public planet(String planet, String moons, int planetImage) {
        this.planet = planet;
        this.moons = moons;
        this.planetImage = planetImage;
    }


    // getters and setters - getters are used to excess the value inside the model class from outside (Ex: adapter)
    // On the other hand , setters are used to update the values from the outside of model class

    public String getPlanet() {
        return planet;
    }

    public void setPlanet(String planet) {
        this.planet = planet;
    }

    public String getMoons() {
        return moons;
    }

    public void setMoons(String moons) {
        this.moons = moons;
    }

    public int getPlanetImage() {
        return planetImage;
    }

    public void setPlanetImage(int planetImage) {
        this.planetImage = planetImage;
    }
}


   

