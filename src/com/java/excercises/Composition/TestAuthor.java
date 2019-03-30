package com.java.excercises.Composition;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Minh Duc Cao","minhduc.itus@gmail.com", 'm');
        System.out.println(author);
        author.setEmail("minh.duc.cao1999@gmail.com");
        System.out.println("name is : " + author.getName());
        System.out.println("email is : " + author.getEmail());
        System.out.println("gender is : " + author.getGender());
    }
}
