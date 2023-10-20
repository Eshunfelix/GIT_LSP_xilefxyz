package org.howard.edu.lsp.midterm.problem1;

public class Book {
    private String title;
    private String author;
    private int year;

    /*
     * Book class constructor
     */
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\nAuthor: " + author + "\nYear: " + year;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Book otherBook = (Book) obj;

        if (title != null ? !title.equals(otherBook.title) : otherBook.title != null) return false;
        if (author != null ? !author.equals(otherBook.author) : otherBook.author != null) return false;

        return true;
    }


}

