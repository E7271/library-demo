import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

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

    /**
     * Adds a given book to the Library
     * Increments copies of existing books instead if duplicate found
     * @param b the book to add
     */
    public void add(Book b) {

        /*
            add: Get book b, need to add to array if not duplicate

            Scan catalog to make sure no books are duplicate
                If title is the same:
                    Increments copies of book already in the array
                    return

            Add to library
         */

        // Scan catalog to make sure no books are duplicate
        for (int x = 0; x < catalog.size(); x++) {
            if (b.equals(catalog.get(x))) {

                // Increments copies of book already in the array

                catalog.get(x).setCopies(catalog.get(x).getCopies() + b.getCopies());
                return;

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

        for (Book b : lib1.catalog) new_library.add(b); // For each

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
            System.out.println("  - " + input.catalog.get(x).getTitle() + ", " + input.catalog.get(x).getCopies());

        }

    }

    public void save_library(String filename) {

        try (PrintWriter pw = new PrintWriter(new FileWriter(filename))) {

            pw.println(get_catalog_size());

            for (Book b : catalog) {
                pw.println(b.getAuthor_first());
                pw.println(b.getAuthor_last());
                pw.println(b.getTitle());
                pw.println(b.getCopies());
                pw.println(b.getPublication_date());
            }

        } catch (IOException e) {
            System.out.println("Error saving library " + library_name + " to file " + filename);
            e.printStackTrace();
        }
    }

    public void load_library(String filename) {

        try (Scanner scanner = new Scanner(new File(filename))) {
            int books_count = scanner.nextInt();
            scanner.nextLine();

            while (books_count --> 0) {
                String first = scanner.nextLine();
                String last = scanner.nextLine();
                String title = scanner.nextLine();
                int copies = scanner.nextInt();
                scanner.nextLine();
                String publication = scanner.nextLine();

                Book b = new Book(first, last, title, copies, publication);
                this.add(b);
            }

        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
