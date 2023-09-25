public class Audiobook extends Book {
    private double length;
    private String abVa;
    private String soundWarning;

    public Audiobook (String name,  String voiceActor, String bookAuthor, double abLength, String abHowloud ) {
        super (name, bookAuthor);
        abVa = voiceActor;
        length = abLength;
        soundWarning = abHowloud;
    } /// initialised
    public Audiobook () {
        this ("Romeo & Juliette podcast",
                "Joe Rogan",
                "William Shakespear",
                1.5,
                "turn it down");
    } /// constructor
    public String getAbVa () {
        return abVa;
    }
    public double getLength () {
        return length;
    }
    public String getSoundWarning () {
        return soundWarning;
    }
    @Override
    public String getAll() {
        return this.getBookName() + " by " + this.getAuthor() + " read by " + abVa + ", " + length + "h " + ", you should " + soundWarning;
    }/// getters

    public void setAbVa (String sett) {
        abVa = sett;
    }
    public void setLength (double sett) {
        length = sett;
    }
    public void setSoundWarning (String sett) {
        soundWarning = sett;
    } /// setters

    /// class defining methods
    public String loud(double decibels) {
        while (decibels < 80) {
            if (decibels <= 70) {
                setSoundWarning("turn it up");
            }
            else setSoundWarning("keep that volume");
            decibels++;
        }
        return getAll();
    }

    public boolean canYouSleepToIt() {
        return (abVa == "Rob Inglis");
    }



}