import java.util.Objects;

public class Book {
    private String bookName;
    private String author;
    private static int counter;
    public Book (String name, String bookAuthor) {
        bookName = name;
        author = bookAuthor;
        counter++;
    } /// initialiser

    public Book() {
        this("Romeo & Juliette",
                "William Shakespear");
    } /// constructor

    public String getBookName () {
        return bookName;
    }
    public String getAuthor () {
        return author;
    }
    public String getAll() {
        return bookName + " by " + author;
    }/// parameters getters
    public void setBookName(String sett) {
        bookName = sett;
    }
    public void setAuthor(String sett) {
        author = sett;
    } /// params setters

    /// class defining methods
    public String read() {
        return "*page turning noises*";
    }
    public int badBook() {
        int v = 0;
        if (Objects.equals(bookName, "Fundamentals of Engineering Thermodynamics 5th Edition") && Objects.equals(author, "Michael Morgan")){
            v = 1;
        }
        return v;
    }
    public void printCounter() {
        System.out.println("Total objects found: " + counter);
    }

}