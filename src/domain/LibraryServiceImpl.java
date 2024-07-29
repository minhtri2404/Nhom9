package domain;

import java.util.List;

import observer.Publisher;
import persistence.LibraryPersistence;
import persistence.model.Book;
import persistence.model.ReferenceBook;
import persistence.model.TextBook;

public class LibraryServiceImpl extends Publisher implements LibraryService {
    private LibraryPersistence model;

    public LibraryServiceImpl(LibraryPersistence model) {
        this.model = model;
    }

    @Override
    public void addBook(Book book) {
        model.addBook(book);
        notifyChange();
    }

    @Override
    public List<Book> getAllBooks() {
        return model.getAllBooks();
    }

    @Override
public double getTotalPriceTextBook() {
    List<Book> books = model.getAllBooksByType(TextBook.class);
    double total = 0;
    for (Book book : books) {
        total += ((TextBook) book).totalPrice();
    }
    return total;
}

@Override
public double getTotalPriceRefeneBook() {
    List<Book> books = model.getAllBooksByType(ReferenceBook.class);
    double total = 0;
    for (Book book : books) {
        total += ((ReferenceBook) book).totalPrice();
    }
    return total;
}

@Override
public double getAvgPriceRefeneBook() {
    return model.agvPriceReferenceBook();
}


    @Override
    public Book findBook(int id) {
        return model.findBookById(id);
    }

    @Override
    public void updateBook(Book book) {
        model.updateBook(book);
        notifyChange();
    }

    @Override
    public void removeBook(int id) {
        model.removeBookById(id);
        notifyChange();
    }

    @Override
    public List<Book> getBooksByPublisher(String publisher) {
        return model.getBooksByPublisher(publisher);
    }

   
}
