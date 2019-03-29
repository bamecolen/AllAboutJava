package com.java.excercises.Classes;

public class Excercise14 {

    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Excercise14(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary(){
        return this.salary * 12;
    }

    public int raiseSalary(int percent){
        return this.salary + this.salary * percent;
    }

    @Override
    public String toString() {
        return "Employee[id = " + this.id +", name = " + this.firstName + " " + this.lastName +" , salary = " + this.salary;
    }
}
