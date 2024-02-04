package Challenge1;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> bookCollection;

    public Library() {
        this.bookCollection = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {

        bookCollection.add(book);
    }
    public void removeBook(Book book) {

        bookCollection.remove(book);
    }

    // Method to display information about all books in the library
    public void displayLibrary() {
        System.out.println("Library Contents:");

        for (Book book : bookCollection) {
            if (book instanceof FictionBook) {
                FictionBook fictionBook = (FictionBook) book;
                System.out.println("Fiction Book - Title: " + fictionBook.getTitle() +
                        ", Author: " + fictionBook.getAuthor() +
                        ", ISBN: " + fictionBook.getIsbn() +
                        ", Genre: " + fictionBook.getGenre());
            } else if (book instanceof NonFictionBook) {
                NonFictionBook nonFictionBook = (NonFictionBook) book;
                System.out.println("Non-Fiction Book - Title: " + nonFictionBook.getTitle() +
                        ", Author: " + nonFictionBook.getAuthor() +
                        ", ISBN: " + nonFictionBook.getIsbn() +
                        ", Subject: " + nonFictionBook.getSubject());
            } else {
                System.out.println("Book - Title: " + book.getTitle() +
                        ", Author: " + book.getAuthor() +
                        ", ISBN: " + book.getIsbn());
            }
        }
    }


}