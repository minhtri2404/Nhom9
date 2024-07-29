package command;

import domain.LibraryService;
import persistence.LibraryPersistence;
import persistence.model.Book;

public class EditCommand extends Command {

    private Book book;

    public EditCommand(LibraryService libraryService, Book book) {
        super(libraryService);
        this.book = book;
    }

    @Override
    public void execute() {
        libraryService.updateBook(book);
    }

}
