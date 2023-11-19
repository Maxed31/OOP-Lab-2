package week7.FirstTask.SecondTask;
import week7.FirstTask.SecondTask.Book;

import java.util.ArrayList;
import java.util.Optional;
public class LibraryCatalog {
    private ArrayList<Book> books;

    public LibraryCatalog(){
        this.books = new ArrayList<>();
    }

    public void addBook(Book buk){
        this.books.add(buk);
    }
    public Optional<Book> isAvailable(String title){
        return this.books.stream()
                .filter(buk ->buk.availbility() && buk.title().equals(title)).findFirst();
    }
    public Optional<Book> retriveData(String author){
        return books.stream().
                filter(buk -> buk.availbility()&& buk.author().equals(author)).findFirst();
    }
}
