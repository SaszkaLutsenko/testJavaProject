package org.example;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();  // Використовуємо параметризований тип

    // Додавання книги до бібліотеки
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully: ");
        book.displayInfo();
    }

    // Пошук книги за назвою
    public void searchByTitle(String title) {
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {  // Коректне порівняння рядків
                System.out.println("Book found:");
                book.displayInfo();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Book with title '" + title + "' not found.");
        }
    }

    // Пошук книг за автором
    public void searchByAuthor(String author) {
        boolean found = false;
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                System.out.println("Book by author found:");
                book.displayInfo();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found by author '" + author + "'.");
        }
    }
}