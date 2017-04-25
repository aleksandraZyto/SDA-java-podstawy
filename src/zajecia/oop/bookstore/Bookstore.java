package zajecia.oop.bookstore;

/**
 * Created by RENT on 2017-04-24.
 */
public class Bookstore {

    public Book[] books;
    private int numberOfBooks;

    public Bookstore() {
        this.books = new Book[100];
        this.numberOfBooks = 0;
    }

    public boolean add(Book book) {
        boolean valueToReturn = false;
        if (numberOfBooks < 100) {
            books[numberOfBooks] = book;
            numberOfBooks++;
            valueToReturn = true;
        }
        return valueToReturn;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public Book[] getBooks() {
        Book[] booksToReturn = new Book[numberOfBooks];
        for (int i = 0; i < this.numberOfBooks; i++) {
            booksToReturn[i] = books[i];
        }
        return books;
    }

    public void showBooks() {
        for (int i = 0; i < numberOfBooks + 1; i++) {
            System.out.println(books[i]);
        }
    }

    public int getNumberOfBooks(String author) {
        int counter = 0;
        for (int i = 0; i < numberOfBooks; i++) {
            if (books[i].getAuthor().equals(author)) {
                counter++;
            }
        }
        return counter;
    }

    public Book[] getBooks(String author) {
        Book[] booksToReturn = new Book[getNumberOfBooks(author)];
        int index = 0;
        for (int i = 0; i < this.numberOfBooks; i++) {
            if (books[i].getAuthor().equals(author)) {
                booksToReturn[index] = books[i];
                index++;
            }
        }
        return booksToReturn;
    }

    public Book getBook(String ISBN) {
        Book bookWithISBN = null;
        int i = 0;
        while (i < this.numberOfBooks && bookWithISBN == null) {
            if (books[i].getISBN().equals(ISBN)) {
                bookWithISBN = books[i];
            }
            i++;
        }
        return bookWithISBN;
    }
}

