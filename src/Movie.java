public class Movie {

    private String name;
    private int runtime_minutes;
    private String director;
    private String release_date;
    private int copies;

    public Movie(String name, int runtime_minutes, String director, String release_date, int copies) {

        this.copies = copies;
        this.name = name;
        this.runtime_minutes = runtime_minutes;
        this.director = director;
        this.release_date = release_date;

    }

}
