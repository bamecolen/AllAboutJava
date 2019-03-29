package com.java.excercises.Classes;

public class Excercise17 {
    private int day;
    private int month;
    private int year;

    public Excercise17(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        if (this.day > 9 && this.month > 9){
            return this.day + "/" + this.month + "/" + this.year;
        } else if (this.day < 9){
            return "0" + this.day + "/" + this.month + "/" + this.year;
        } else if (this.month < 9){
            return this.day + "/0" + this.month + "/" + this.year;
        } else {
            return "0" + this.day + "/0" + this.month + "/" + this.year;
        }
    }
}
