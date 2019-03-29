package com.java.excercises.Classes;

public class Excercise12 {

    private String color;
    private double radius;

    public Excercise12(){
        System.out.println("Default Constructor was called");
    }

    public Excercise12(double radius){
        this.radius = radius;
    }

    public Excercise12(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle [radius = " + this.radius + ", color = " + this.color;
    }

    public double getArera(){
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getCircumference(){
        return 2 * Math.PI * this.radius;
    }
}
