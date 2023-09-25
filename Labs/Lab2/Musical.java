import java.util.Arrays;
public class Musical extends Book {
    private double length;
    private String musicalCast;
    private int songs;
    private String [] songList = {"Jet Song", "Balcony Scene", "America", "I Feel Pretty", "Something's Coming", "The Rumble"};
    private String [] topMusicals = {"Hairspray", "Beauty and the Beast", "Westside Story", "Hamilton"};
    private String [] topBangers = {"Hairspray", "Jet Song", "Be our Guest", "Eye of the Hurricane"};

    public Musical (String name, String bookAuthor, double musicalLength, String cast, int songCount ) {
        super (name, bookAuthor);
        length = musicalLength;
        musicalCast = cast;
        songs = songCount;
    } /// initialised
    public Musical () {
        this ("Westside Story",
                "Joe",
                1.5,
                "Its all Hugh Jackman",
                5);
    } /// constructor
    public double getLength () {
        return length;
    }
    public String getMusicalCastCast() {
        return musicalCast;
    }
    public int getSongs() {
        return songs;
    }
    @Override
    public String getAll() {
        return this.getBookName() + " by " + this.getAuthor()
                + " " + length
                + "h, performed by " + musicalCast
                + ", " + songs + " total songs";
    }/// getters
    public void setLength (double sett) {
        length = sett;
    }
    public void setMusicalCast(String sett) {
        musicalCast = sett;
    }
    public void setSongs (int sett) {
        songs = sett;
    }/// setters


    /// class defining methods
    public boolean isItGood () {
        for (int i = 0; i < topMusicals.length; i++) {
            if (topMusicals[i] == this.getBookName())
                return true;
        }
        return false;
    }
    public String banger() {
        StringBuilder str = new StringBuilder();
        for (var k = 0; k < topBangers.length; k++) {
            for (var i = 0; i < songs; i++) {
                if (topBangers[k] == songList[i]) {
                    str.append(songList[i]);
                }
            }
        }
        return str.toString();
    }
}