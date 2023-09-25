import java.util.Objects;

public class Movie extends Book {
    private double length;
    private String director;
    private String movieCast;
    private double rottenTomatoes;

    public Movie (String name, String movieDirector, String bookAuthor, double movieLength, double rating, String cast ) {
        super (name, bookAuthor);
        director = movieDirector;
        length = movieLength;
        rottenTomatoes = rating;
        movieCast = cast;
    } /// initialised
    public Movie () {
        this ("Romeo & Juliette",
                "Michael Bay",
                "William Shakespear",
                5.5,
                1,
                "Rian Gosling, Henry Caville, Ryan Reynolds");
    } /// constructor

    public String getDirector() {
        return  director;
    }
    public double getLength () {
        return length;
    }
    public double getRottenTomatoes () {
        return rottenTomatoes;
    }
    public String getMovieCast() {
        return movieCast;
    }
    @Override
    public String getAll() {
        return this.getBookName() + " directed by " + director
                + " based on a book by " + this.getAuthor()
                + ", " + length
                + "h, rotten tomatoes score: " + rottenTomatoes
                + "; cast: " + movieCast;
    }/// getters
    public void setDirector (String sett) {
        director = sett;
    }
    public void setLength (double sett) {
        length = sett;
    }
    public void setRottenTomatoes (double sett) {
        rottenTomatoes = sett;
    }
    public void setMovieCast(String sett) {
        movieCast = sett;
    } /// setters

    /// class defining methods

    public String badMovie() {
        if (rottenTomatoes < 5)
            return "You won't enjoy it unless you're my ex";
        return "Good movie";
    }

    public String urReview(double urScore) {
        while (Objects.equals(badMovie(), "Good movie")) {
            if (urScore < rottenTomatoes)
                return "You got bad taste";
            else return "Thats a bit too high, don't you think?";
        }
        return "Why did you watch this?";
    }
}