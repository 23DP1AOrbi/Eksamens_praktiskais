package lv.rvt;

public class Book {
    private String name;
    private String author;
    private int year;
    private String genre;
    private double price;

    public Book(String name, String author, int year, String genre, double price) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.genre = genre;
        this.price = price;
    }

    public String toString() {
        return this.name + " by " + this.author + ": €" + this.price;
    }

    public String toCSV() {
        return this.name + "," + this.author + "," + this.year + "," + this.genre + "," + this.price;
    }

    public String getName() {
        return this.name;
    }

    public String getAuthor() {
        return this.author;
    }

    public double getPrice() {
        return this.price;
    }

    public int getYear() {
        return this.year;
    }
}
