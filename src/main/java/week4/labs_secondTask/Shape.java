package week4.labs_secondTask;

import week4.labs_secondTask.enums.FillType;
public class Shape {
    private String color;
    private FillType fillType;

    public Shape(String color, FillType fillType) {
        this.color = color;
        this.fillType = fillType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public FillType getFillType() {
        return fillType;
    }

    public void setFillType(FillType fillType) {
        this.fillType = fillType;
    }

    public void displayInfo() {
        System.out.println(this.getColor() + " " + this.getFillType());
    }

    public double getArea() {
        return 0;
    }
}