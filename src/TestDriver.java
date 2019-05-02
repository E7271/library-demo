import items.Book;
import items.LightNovel;
import items.Media;

public class TestDriver {

    public static void main(String args[]) {

        Media pb = new Book(100, "The Poisonwood Bible", 1998, 3, "Barbara", "Kingsolver");
        Media jjba = new LightNovel(101, "Jojo's Bizarre Adventure", 1984, 4, "Hirohiko", "Araki");

        Library test = new Library("Test");
        test.add(pb);
        test.add(jjba);
        Library.print(test);
    }


}

        /*
        Library forest_grove = new Library("Forest Grove City Library");
        forest_grove.load_library("forest_grove.txt");
        Library.print(forest_grove);
        System.out.println();

        Library beaverton = new Library("Beaverton City Library");
        beaverton.load_library("beaverton.txt");
        Library.print(beaverton);
        System.out.println();

        Library tualatin = new Library("Tualatin Public Library");
        tualatin.load_library("tualatin.txt");
        Library.print(tualatin);
        System.out.println();

        Library tempLib = Library.merge(tualatin, forest_grove);
        Library wccls = Library.merge(tempLib,beaverton);
        wccls.setLibrary_name("WCCLS");
        Library.print(wccls);

        wccls.save_library("wccls.txt");
        */

/*
        Library forest_grove = new Library("Forest Grove City Library");

        forest_grove.add(new items.Book("Arthur", "Miller", "Death of a Salesman", 4, "1949"));
        forest_grove.add(new items.Book("Nicholas", "Sparks", "The Notebook", 2, "1996"));
        forest_grove.add(new items.Book("Barbara", "Kingsolver", "The Poisonwood Bible", 2, "1999"));
        forest_grove.add(new items.Book("Greg", "Mortenson", "Three Cups of Tea", 3, "2006"));

        forest_grove.save_library("forest_grove.txt");
        //Library.print(forest_grove);


        Library beaverton = new Library("Beaverton City Library");
        beaverton.add(new items.Book("Barbara", "Kingsolver", "The Poisonwood Bible", 11, "1999"));
        beaverton.add(new items.Book("Kate", "DiCamilo", "Tales of Desperaux", 8, "1993"));
        beaverton.add(new items.Book("Paulo", "Coelho", "The Alchemist", 13, "1988"));
        beaverton.add(new items.Book("Nicholas", "Sparks", "The Notebook", 8, "1996"));
        beaverton.add(new items.Book("George", "Orwell", "Nineteen Eighty-Four", 14, "1949"));
        beaverton.add(new items.Book("Grace", "Linn", "Where the Mountain Meets the Moon", 9, "2009"));
        beaverton.save_library("beaverton.txt");

        Library tualatin = new Library("Tualatin Public Library");
        tualatin.add(new items.Book("Harper", "Lee", "To Kill a Mockingbird", 5, "1960"));
        tualatin.add(new items.Book("George", "Orwell", "Nineteen Eighty-Four", 8, "1949"));
        tualatin.add(new items.Book("Brian", "Jacques", "Mossflower", 4, "1988"));
        tualatin.add(new items.Book("Barbara", "Kingsolver", "The Poisonwood Bible", 7, "1999"));
        tualatin.add(new items.Book("Paulo", "Coelho", "The Alchemist", 5, "1988"));
        tualatin.save_library("tualatin.txt");

        */