package items;

public class Audiobook extends Media {
    private String author;
    private String dubber;
    private int discs;

    public Audiobook(long id, String name, int release_date, int copies, String author, String dubber, int discs) {
        super(id, name, release_date, copies);
        this.author = author;
        this.dubber = dubber;
        this.discs = discs;
    }

    public String getAuthor() {
        return author;
    }

    public String getDubber() {
        return dubber;
    }

    public int getDiscs() {
        return discs;
    }

    @Override
    public String toString() {
        return super.toString() + " written by " + author + ", " + getDiscs() + " dubbed by " + getDubber();
    }

}
