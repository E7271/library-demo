import java.util.ArrayList;

/**
 * Holds books
 */
public class Library {

    private String library_name;
    private ArrayList<Book> catalog;

    public Library(String library_name) {
        this.library_name = library_name;
        catalog = new ArrayList<Book>();
    }

    public void add(Book b) {
        for (int x = 0; x < catalog.size(); x++) {
            if (b.getTitle().equals(catalog.get(x).getTitle())) {
                catalog.add(b);
            } else {
                int temp_int = catalog.get(x).getCopies();
                catalog.get(x).setCopies(temp_int++);
            }
        }
        catalog.add(b);
    }


    public String getLibrary_name() {
        return library_name;
    }

    public void setLibrary_name(String library_name) {
        this.library_name = library_name;
    }

    public static Library merge(Library lib1, Library lib2) {
        ArrayList<Book> temp_array = new ArrayList<Book>();

        Library output_library = new Library("TempName");

        for (int x = 0; x < lib1.catalog.size(); x++){
            temp_array.add(lib1.catalog.get(x));
        }
        for (int x = 0; x < lib2.catalog.size(); x++){
            temp_array.add(lib2.catalog.get(x));
        }

        for(int x = 0; x < temp_array.size(); x++){
            for(int y = 0 ; y < temp_array.size(); y++){
                if(temp_array.get(x).getTitle().equals(temp_array.get(y).getTitle())){
                    temp_array.get(x).setCopies(temp_array.get(y).getCopies() + temp_array.get(x).getCopies());
                }
            }
        }

        output_library.catalog = temp_array;
        return output_library;
    }

    public int get_catalog_size() {
        return catalog.size();
    }

    public static void print(Library input){
        System.out.println(input.getLibrary_name() + " catalog: " + input.get_catalog_size() + " entries");
        for(int x = 0; x < input.catalog.size(); x++){
            System.out.println(input.catalog.get(x).getTitle() + ", " + input.catalog.get(x).getCopies());

        }

    }

}
