package zajecia.oop.bookstore;

/**
 * Created by RENT on 2017-04-24.
 */
public class Application {

    public static void main(String[] args) {

        Bookstore bookstore = new Bookstore();
        insertExampleData(bookstore);

//        Book[] books = bookstore.getBooks("Henryk Sienkiewicz");
//        for (int i = 0; i < books.length; i++) {
//            System.out.println(books[i]);
//        }

        System.out.println(bookstore.getBook("412843176491"));
    }

    public static void insertExampleData(Bookstore bookstore){
            Book book = new Book("pan tadeusz", "Henryk Sienkiewicz", "21.02.3000", "412843176491");
//        book.author="mickiewicz";
//        book.description="poem";
//        book.ISBN="3478234762";
//        book.releaseDate="3.06.2000";
//        book.titile="pan tadeusz";
            String[] pantadeusz = new String [3];
            pantadeusz[0]="Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";
            pantadeusz[1]="Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.";
            pantadeusz[2]="Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
            book.content = pantadeusz;

            Book book2 = new Book("pan tadeusz", "adam mickiewicz", "21.02.3000", "012849176491");
//        book2.author="mickiewicz";
//        book2.description="poem";
//        book2.ISBN="3478234762";
//        book2.releaseDate="3.06.2000";
//        book2.titile="pan tadeusz";
            String[] ogniemimieczen = new String [3];
            ogniemimieczen[0]="Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";
            ogniemimieczen[1]="Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.";
            ogniemimieczen[2]="Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
            book2.content = ogniemimieczen;

            Book book3 = new Book("pan tadeusz", "adam mickiewicz", "21.02.3000", "412849166491");
//        book3.author="mickiewicz";
//        book3.description="poem";
//        book3.ISBN="3478234762";
//        book3.releaseDate="3.06.2000";
//        book3.titile="pan tadeusz";
            String[] dziady = new String [3];
            dziady[0]="Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";
            dziady[1]="Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.";
            dziady[2]="Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
            book3.content = dziady;

            bookstore.add(book);
            bookstore.add(book2);
            bookstore.add(book3);
    }

}
