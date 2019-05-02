package items;

public class LightNovel extends Book {

    public LightNovel(long id, String name, int release_date, int copies, String author_first, String author_last) {
        super(id, name, release_date, copies, author_first, author_last);
    }

    @Override
    public String toString() {
        return super.toString() + " written by " + getAuthor_last() + " " + getAuthor_first();
    }
}
