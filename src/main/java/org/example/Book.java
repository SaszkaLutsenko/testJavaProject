package org.example;

public class Book {
    private String title;
    private String author;
    private int year;  // Використовуємо int замість byte для року

    // Конструктор
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // Метод для виведення інформації про книгу
    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", Year: " + year);
    }

    // Геттери для доступу до приватних полів
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
