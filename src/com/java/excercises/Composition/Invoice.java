package com.java.excercises.Composition;

public class Invoice {
    private int ID;
    private TheCustomer customer;
    private double amount;

    public Invoice(int ID, TheCustomer customer, double amount) {
        this.ID = ID;
        this.customer = customer;
        this.amount = amount;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public TheCustomer getCustomer() {
        return customer;
    }

    public void setCustomer(TheCustomer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmountAfterDiscount(){
        return this.amount - this.amount * this.customer.getDiscount();
    }
}
