package com.java.excercises.Composition;

public class TestBookAdvanced {
    public static void main(String[] args) {
        Author[] authors = new Author[3];
        authors[0] = new Author("minhduc","minhduc.itus@gmail.com", 'm');
        authors[1] = new Author("minhtri","minhtri.itus@gmail.com", 'm');
        authors[2] = new Author("kiman","kiman@gmai.com",'f');

        Book myBook = new Book("More On Java", authors, 19.99,20);
        System.out.println(myBook);
    }
}
