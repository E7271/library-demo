import items.Media;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Holds Medias
 */
public class Library {

    private String library_name;
    private ArrayList<Media> catalog;

    private long book_ids = 1000000000L;
    private long lightnovel_ids = 110000000L;

    public Library(String library_name) {
        this.library_name = library_name;
        catalog = new ArrayList<Media>();
    }

    /**
     * Adds a given Media to the Library
     * Increments copies of existing Medias instead if duplicate found
     * @param b the Media to add
     */
    public void add(Media b) {

        /*
            add: Get Media b, need to add to array if not duplicate

            Scan catalog to make sure no Medias are duplicate
                If title is the same:
                    Increments copies of Media already in the array
                    return

            Add to library
         */

        // Scan catalog to make sure no Medias are duplicate
        for (int x = 0; x < catalog.size(); x++) {
            if (b.equals(catalog.get(x))) {

                // Increments copies of Media already in the array

                catalog.get(x).setCopies(catalog.get(x).getCopies() + b.getCopies());
                return;

            }
        }

        b.setId(book_ids);
        book_ids++;
        catalog.add(b);
    }


    public String getLibrary_name() {
        return library_name;
    }

    public void setLibrary_name(String library_name) {
        this.library_name = library_name;
    }

    /**
     * Combines the catalogs of two given libraries without duplicating media
     *
     * @param lib1 first library
     * @param lib2 second library
     * @return new library created from merging the two libs
     */
    public static Library merge(Library lib1, Library lib2) {

        /*
            Create new library
            Iterate through lib1
                use add method
            Iterate through lib2
                use add method
            return new library
         */

        Library new_library = new Library("New Library");

        for (Media b : lib1.catalog) new_library.add(b); // For each

        for(int x =0 ; x < lib2.get_catalog_size(); x++){ // Traditional for loop
            new_library.add(lib2.catalog.get(x));
        }

        return new_library;
    }

    public int get_catalog_size() {
        return catalog.size();
    }

    public static void print(Library input) {
        System.out.println(input.getLibrary_name() + " catalog: " + input.get_catalog_size() + " entries");
        for (int x = 0; x < input.catalog.size(); x++) {
            Media m = input.catalog.get(x);
            System.out.println(m.toString());
        }
    }
}
