package ru.mirea.task2;

public class Book {
    private int page;
    private String name;

    public Book(int page) {
        this.page = page;
        this.name= name;
    }

    public Book(int page, String name) {
        this.page = page;
        this.name= name;
    }

    public Book(String name) {
        this.name = name;
        this.page = 312;
    }
    public Book() {
        this.name = "Sharks";
        this.page = 312;
    }

    @Override
    public String toString() {
        return "Book{" +
                "page = " + page +
                ", name = '" + name + '\'' +
                '}';
    }
}

class TestBook {
    public static void main(String[] args) {
        Book book = new Book();
        System.out.println(book.toString());
    }
}
