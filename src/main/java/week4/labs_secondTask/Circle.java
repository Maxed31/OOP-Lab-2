package week4.labs_secondTask;

import week4.labs_secondTask.Shape;
import week4.labs_secondTask.enums.FillType;
public class Circle extends Shape{
    private double radius;
    private String type = "circle";

    public Circle(String color, FillType fillType, double radius) {
        super(color, fillType);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getRadius() {
        return this.radius;
    }

    public double calculateCircumfrence(double PI, double r) {
        return 2 * PI * r;
    }

    public double calculateCircumfrence(double r) {
        return 2 * 3.14 * r;
    }

    @Override
    public void displayInfo() {
        System.out.println("Type: " + this.getType() + " Color: " + this.getColor() + " Fill Type: " + this.getFillType() + " Radius: " + this.getRadius());
    }

    @Override
    public double getArea() {
        return this.getRadius() * this.getRadius() * 3.14;
    }

}