package com.java.excercises.Classes;

public class Excercise18 {
    private int hour;
    private int minute;
    private int second;

    public Excercise18(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void settime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Excercise18 nextSecond(){
        this.second = this.second + 1;
        return this;
    }

    private Excercise18 previousSecond(){
        this.second = this.second - 1;
        return this;
    }

    @Override
    public String toString() {
        if (this.hour > 9 && this.second > 9 && this.minute > 9){
            return this.hour + ":" + this.minute + ":" + this.second;
        } else if (this.hour < 9){
            return "0" + this.hour + ":" + this.minute + ":" + this.second;
        } else if (this.minute < 9){
            return this.hour + ":0" + this.minute + ":" + this.second;
        } else if (this.second < 9){
            return this.hour + ":" + this.minute + ":0" + this.second;
        } else {
            return "0" + this.hour + ":0" + this.minute + ":0" + this.second;
        }
    }
}
