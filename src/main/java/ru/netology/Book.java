package ru.netology;

public class Book extends Product {
    private String author;

    public Book (int id, String title, int cost, String name, String author){
        super(id, title, cost);
        this.author =author;

    }


    public String getAuthor() {

        return author;
    }

    public void setAuthor(String author) {

        this.author = author;
    }
}