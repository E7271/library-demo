package items;

public class Games extends Media {
    private String platform;
    private String publisher;

    public Games(long id, String name, int release_date, int copies, String platform, String publisher) {
        super(id, name, release_date, copies);
        this.platform = platform;
        this.publisher = publisher;
    }

    public String getPlatform() {
        return platform;
    }

    public String getPublisher() {
        return publisher;
    }

    @Override
    public String toString() {
        return super.toString() + ", released by " + getPublisher() + " on " + getPlatform();
    }

}
