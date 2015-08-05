import java.util.ArrayList;
import java.util.Scanner;

public class BibliotecaApp {

    public void run() {
        ArrayList<Book> listOfBooks = new ArrayList<>();
        addBooksToList(listOfBooks);
        Library biblioteca = new Library(listOfBooks);
        System.out.println(biblioteca.open());
        System.out.println(biblioteca.listOptions());
        Scanner userInput = new Scanner(System.in);
        System.out.println("Which option would you like to choose?");
        String userOption = userInput.nextLine();
        System.out.println(biblioteca.getOption(userOption));
    }

    public static void main(String[] args) {
        BibliotecaApp app = new BibliotecaApp();
        app.run();
    }

    public static void addBooksToList(ArrayList<Book> listOfBooks) {
        listOfBooks.add(new Book("Catch-22","Joseph Heller", 1961));
        listOfBooks.add(new Book("Harry Potter and the Sorcerer's Stone", "JK Rowling", 1997));
        listOfBooks.add(new Book("Notes from the Underground", "Fyodor Dostoevsky", 1864));
        listOfBooks.add(new Book("Head First Java", "Bert Bates and Kathy Sierra", 2003));
    }
}
