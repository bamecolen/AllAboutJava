package com.java.excercises.Classes;

public class Excercise13 {
    private float length;
    private float width;

    public Excercise13(){
        System.out.println("Default Constructor");
    }

    public Excercise13(float length, float width){
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getArea(){
        return this.length * this.width;
    }

    public float getPerimeter(){
        return (this.length + this.width) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle[length = " + this.length + ", width = " + this.width;
    }
}
