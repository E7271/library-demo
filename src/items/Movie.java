package items;
public class Movie extends Media {
    private String studio;
    private int runtime;


    public Movie(long id, String name, int release_date, int copies, String studio, int runtime){
        super(id, name, release_date, copies);
        this.studio = studio;
        this.runtime = runtime;
        
    }

    public String getStudio(){
        return studio;
    }
    public int getRuntime(){
        return runtime;
    }


    @Override
    public String toString() {
        return super.toString() + "animated by " + getStudio() + ", runtime " + runtime;
    }

}
