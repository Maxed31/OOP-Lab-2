package org.example.lab.lectures;

import java.util.Date;

public class lecture {
public class Vehicle{
    private String color;
    private int numOfwheels;
    private Date dateofManufacture;

    public Vehicle(String color, int numOfwheels, Date dateofManufacture){
        this.color = color;
        this.numOfwheels = numOfwheels;
        this.dateofManufacture = dateofManufacture;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public int getNumOfwheels(){
        return numOfwheels;
    }
    public void setNumOfwheels(int numOfwheels){
        this.numOfwheels = numOfwheels;
    }
    public Date getDateofManufacture(){
        return dateofManufacture;
    }

}
}
