package com.java.excercises.Composition;

public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(3 ,4);
        System.out.println(p1.distance(5, 6));

        MyPoint p2 = new MyPoint(5, 6);
        System.out.println(p1.distance(p2));

        System.out.println(p1.distance());

        MyPoint p3 = new MyPoint();
        System.out.println(p3);
        p3.setX(5);
        p3.setY(6);
        System.out.println("p3(x) is : " + p3.getX());
        System.out.println("p3(y) is : " + p3.getY());
        p3.setXY(5,2);
        System.out.println(p3.getXY()[0]);
        System.out.println(p3.getXY()[1]);
        System.out.println(p3);

        //Write a program that allocates 10 points in an array of MyPoint, and initializes to (1, 1), (2, 2), ... (10, 10).
        MyPoint[] points = new MyPoint[10];
        int[] arrays = {1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i < 10; i++){
            points[i] = new MyPoint(arrays[i], arrays[i] );
        }

        for (MyPoint tmp : points){
            System.out.println(tmp);
        }
    }
}
