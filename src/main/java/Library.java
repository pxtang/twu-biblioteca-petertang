import java.util.*;

/*
 * This Java source file was auto generated by running 'gradle buildInit --type java-library'
 * by 'ptang' at '8/4/15 1:34 PM' with Gradle 2.5
 *
 * @author ptang, @date 8/4/15 1:34 PM
 */
public class Library {

    private List<Book> books;
    private Map<String, Command> commands;

    public Library() {
        this(new ArrayList<Book>());
    }

    public Library(ArrayList<Book> listOfBooks) {
        this.books = listOfBooks;
        commands = new HashMap<>();
        commands.put("1",new ListBooksCommand(this));
    }

    public String open() {
        return "Welcome to the Library! Biblioteca is available!";
    }


    public String listAllBooks() {
        String output = "";
        for (Book book : books) {
            output += book + "\n";
        }
        return output;
    }


    public String listOptions() {
        String output = "";
        Set<Map.Entry<String, Command>> options = commands.entrySet();
        for (Map.Entry<String, Command> option : options) {
            output += String.format("(%s) %s", option.getKey(), option.getValue().description());
        }

        return output;
    }

    public String getOption(String option) {
        if(commands.containsKey(option)) {
            Command commandToExecute = commands.get(option);
            return commandToExecute.execute();
        }

        return "Select a valid option!";
    }
}
