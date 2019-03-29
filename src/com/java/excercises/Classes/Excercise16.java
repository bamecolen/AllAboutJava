package com.java.excercises.Classes;

public class Excercise16 {
    private String id;
    private String name;
    private int balance = 0;

    public Excercise16(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Excercise16(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int credit(int amount){
        return this.balance += amount;
    }

    public int debit(int amount){
        if (amount <= this.balance){
            this.balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return this.balance;
    }

    public int transferTo(Excercise16 Account, int amount){
        if (amount <= this.balance){
            this.balance -= amount;
        } else {
            System.out.println("Amount exceed balance");
        }
        return this.balance;
    }

    @Override
    public String toString() {
        return "Acount[id = " + this.id +", name = " + this.name +" , balance = " + this.balance;
    }
}
