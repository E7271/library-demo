public class TestDriver {

    public static void main(String args[]) {

        Library demo = new Library("Demo");
        demo.add(new Book("Barbara", "Kingsolver", "The Poisonwood Bible", 2, "1999"));
        demo.add(new Book("Kate", "DiCamilo", "Tales of Desperaux", 2, "1993"));
        demo.add(new Book("Paulo", "Coelho", "The Alchemist", 2, "1988"));
        Library.print(demo);
        System.out.println();
        demo.add(new Book("Barbara", "Kingsolver", "The Poisonwood Bible", 3, "1999"));
        Library.print(demo);

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
        */
    }


}

/*
        Library forest_grove = new Library("Forest Grove City Library");

        forest_grove.add(new Book("Arthur", "Miller", "Death of a Salesman", 4, "1949"));
        forest_grove.add(new Book("Nicholas", "Sparks", "The Notebook", 2, "1996"));
        forest_grove.add(new Book("Barbara", "Kingsolver", "The Poisonwood Bible", 2, "1999"));
        forest_grove.add(new Book("Greg", "Mortenson", "Three Cups of Tea", 3, "2006"));

        forest_grove.save_library("forest_grove.txt");
        //Library.print(forest_grove);


        Library beaverton = new Library("Beaverton City Library");
        beaverton.add(new Book("Barbara", "Kingsolver", "The Poisonwood Bible", 11, "1999"));
        beaverton.add(new Book("Kate", "DiCamilo", "Tales of Desperaux", 8, "1993"));
        beaverton.add(new Book("Paulo", "Coelho", "The Alchemist", 13, "1988"));
        beaverton.add(new Book("Nicholas", "Sparks", "The Notebook", 8, "1996"));
        beaverton.add(new Book("George", "Orwell", "Nineteen Eighty-Four", 14, "1949"));
        beaverton.add(new Book("Grace", "Linn", "Where the Mountain Meets the Moon", 9, "2009"));
        beaverton.save_library("beaverton.txt");

        Library tualatin = new Library("Tualatin Public Library");
        tualatin.add(new Book("Harper", "Lee", "To Kill a Mockingbird", 5, "1960"));
        tualatin.add(new Book("George", "Orwell", "Nineteen Eighty-Four", 8, "1949"));
        tualatin.add(new Book("Brian", "Jacques", "Mossflower", 4, "1988"));
        tualatin.add(new Book("Barbara", "Kingsolver", "The Poisonwood Bible", 7, "1999"));
        tualatin.add(new Book("Paulo", "Coelho", "The Alchemist", 5, "1988"));
        tualatin.save_library("tualatin.txt");

        */