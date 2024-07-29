package command;

import domain.LibraryService;
import persistence.LibraryPersistence;
import persistence.model.Book;

public class FindCommand extends Command {
    private int bookId;

    public FindCommand(LibraryService libraryService, int bookId) {
        super(libraryService);
        this.bookId = bookId;
    }

    @Override
    public void execute() {
        libraryService.findBook(bookId);
    }

}
