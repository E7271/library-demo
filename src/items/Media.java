package items;

/**
 * Represents any item that can be checked out by a library
 *
 * Has id (long), title/name (String),  release date (int), copies (int)
 */


public class Media {

    private long id;
    private String name;
    private int release_date;
    private int copies;

    public Media(long id, String name, int release_date, int copies) {
        this.id = id;
        this.name = name;
        this.release_date = release_date;
        this.copies = copies;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getReleaseDate() {
        return release_date;
    }

    public void setCopies(int input) {
        copies = input;
    }

    public int getCopies() {
        return copies;
    }

    @Override
    public String toString() {
        return String.format("ID %d: %d copies of '%s' (%d)", getId(), getCopies(), getName(), getReleaseDate());
    }

}
