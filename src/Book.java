public class Book extends Object {

    private String author_first;
    private String author_last;
    private String title;
    private int copies;
    private String publication_date;

    public Book(String author_first, String author_last, String title, int copies, String publication_date) {
        this.author_first = author_first;
        this.author_last = author_last;
        this.title = title;
        this.copies = copies;
        this.publication_date = publication_date;
    }

    @Override
    public boolean equals(Object o) {
        /*
            Checks if the given book (if it's even a book) has the same title
         */

        if (! (o instanceof Book)) return false; // Reject all non-books

        Book b = (Book) o; // Cast to book to access methods

        // Checks if the titles of the books are the same
        if (this.title.equals(b.getTitle())) {
            return true;
        } else {
            return false;
        }
    }

    public String getAuthor_first() {
        return author_first;
    }

    public String getAuthor_last() {
        return author_last;
    }

    public String getTitle() {
        return title;
    }

    public int getCopies() {
        return copies;
    }

    public String getPublication_date() {
        return publication_date;
    }

    public void setCopies(int input) {
        copies = input;
    }
}
