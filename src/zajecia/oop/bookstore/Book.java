package zajecia.oop.bookstore;

import java.util.Arrays;

/**
 * Created by RENT on 2017-04-24.
 */
public class Book {
    public String title;
    public String description;
    public String author;
    public String releaseDate;
    public String ISBN;
    public String[] content;


    public Book(String title, String author, String releaseDate, String ISBN) {
        this.title = title;
        this.ISBN = ISBN;
        this.releaseDate = releaseDate;
        this.author = author;
        this.description = "to be updated";
    }


//    public void printDescription(){
//        System.out.println(description);
//    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", author='" + author + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", content=" + Arrays.toString(content) +
                '}';
    }
}