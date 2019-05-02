package items;

public class Book extends Media {
    private String author_first;
    private String author_last;


    public Book(long id, String name, int release_date, int copies, String author_first, String author_last){
        super(id, name, release_date, copies); // Call to Media constructor to setup the "Media" part of the Book
        this.author_first = author_first;
        this.author_last = author_last;
    }

    public String getAuthor_first() {
        return author_first;
    }

    public String getAuthor_last() {
        return author_last;
    }

    @Override
    public String toString() {
        return super.toString() + " written by " + getAuthor_first() + " " + getAuthor_last();
    }

}
