import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        System.out.println("////Book////");
        Book newBook = new Book();
        System.out.println(newBook.getAll());
        System.out.println(newBook.read());
        if (newBook.badBook() == 100)
            System.exit(8008135);
        newBook.printCounter();
        System.out.println();

        System.out.println("////Audiobook////");
        Audiobook newAb = new Audiobook();
        System.out.println(newAb.getAll());
        System.out.println(newAb.loud(100));
        System.out.println(newAb.canYouSleepToIt());
        newAb.printCounter();
        System.out.println();

        System.out.println("////Movie////");
        Movie newMovie = new Movie();
        System.out.println(newMovie.getAll());
        System.out.println(newMovie.badMovie());
        System.out.println(newMovie.urReview(10));
        newMovie.printCounter();
        System.out.println();

        System.out.println("////Musical////");
        Musical newMusical = new Musical();
        System.out.println(newMusical.getAll());
        System.out.println(newMusical.banger());
        System.out.println(newMusical.isItGood());
        newMusical.printCounter();
        System.out.println();
    }
}







