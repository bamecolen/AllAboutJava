package com.java.excercises.Composition;

public class Book {
    private String name;
    private Author [] author;
    private double price;
    private int qty = 0;

    public Book(String name, Author[] author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public Book(String name, Author[] author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author[] getAuthor() {
        return author;
    }

    public void setAuthor(Author[] author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorNames(){
        String res = "";
        for (Author tmp : author){
            res += tmp.getName() +", ";
        }
        res = res.substring(0, res.length() - 2);
        return res;
    }


    @Override
    public String toString() {
        String res = "";
        for (Author tmp : this.author){
            res += tmp.toString() + ", ";
        }
        res = res.substring(0, res.length() - 2);
        return "Book[name = " + this.name + ", authors = {" + res + "}, price = " + this.price + ", qty = " + this.qty;
    }
}
