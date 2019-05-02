package items;

public class CD extends Media{

    private String author_first;
    private String author_last;
    private int tracks;

    public CD(long id, String name, int release_date, int copies, int tracks, String author_first, String author_last){
        super(id, name, release_date, copies);
        this.author_first = author_first;
        this.author_last = author_last;
        this.tracks = tracks;

    }


    public String getAuthor_first() {
        return author_first;
    }

    public String getAuthor_last() {
        return author_last;
    }

    public int getTracks() {
        return tracks;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + getTracks() + " recorded by " + getAuthor_first() + " " + getAuthor_last();
    }


}
