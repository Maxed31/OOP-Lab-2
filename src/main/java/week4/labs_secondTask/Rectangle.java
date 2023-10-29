package week4.labs_secondTask;

import week4.labs_secondTask.enums.FillType;
import week4.labs_secondTask.Shape;
public class Rectangle extends Shape {
    private double width;
    private double height;
    private String type = "rectangle";

    public Rectangle(String color, FillType fillType, double width, double height) {
        super(color, fillType);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void displayInfo() {
        System.out.println("Type: " + this.getType() + " Color: " + this.getColor() + " Fill Type: " + this.getFillType() + " Height: " + this.getHeight() + " Width: " + this.getWidth());
    }

    @Override
    public double getArea() {
        return this.getWidth() * this.getHeight();
    }
}