package com.java.excercises.Composition;

public class MyCircle {
    private int radius = 1;
    private MyPoint center = new MyPoint(0,0);

    public MyCircle(){
        System.out.println("Default constructor was called !");
    }

    public MyCircle(int x, int y, int radius){
        this.center.setX(x);
        this.center.setY(y);
        this.radius = radius;
    }

    public MyCircle(int radius, MyPoint center) {
        this.radius = radius;
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getCenterX(){
        return this.center.getX();
    }

    public void setCenterX(int x){
        this.center.setX(x);
    }

    public int getCenterY(){
        return this.center.getY();
    }

    public void setCenterY(int y){
        this.center.setY(y);
    }

    public int[] getCenterXY(){
        return new int[] {this.center.getX(), this.center.getY()};
    }

    @Override
    public String toString() {
        return "MyCircle[radius=" + this.radius +",center=" + this.center.toString() + "]";
    }

    public double getArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getCircumference(){
        return Math.PI * 2 * this.radius;
    }

    public double distance(MyCircle another) {
        return this.center.distance(another.center);
    }
}
