/**
 * Created by ptang on 8/5/15.
 */
public class ListBooksCommand implements Command {
    private Library library;

    public ListBooksCommand(Library library) {
        this.library = library;
    }

    @Override
    public String execute() {
        return library.listAllBooks();
    }

    @Override
    public String description() {
        return "List Books";
    }
}
