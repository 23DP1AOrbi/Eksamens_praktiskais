package lv.rvt;

import java.util.ArrayList;


public class Book {
    private String name;
    private String author;
    private int year;
    private String ageCategory;

    public Book(String name, String author, int year, String ageCategory) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.ageCategory = ageCategory;
    }

    public String toString() {
        return this.name + " " + this.author;
    }
}
