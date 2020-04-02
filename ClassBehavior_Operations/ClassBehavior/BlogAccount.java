package ClassBehavior_Operations;

import java.util.Vector;

public class BlogAccount {
    private String name;
    public URL publicURL;
    private Author[] authors = new Author[5];
    private static int accountCounter;

    public BlogAccount() {
        // authors[0] = cargar_desde_la_db;
    }

    
    public BlogAccount(String name, URL publicURL) {

    }

    public BlogAccount(Author author) {
        this.authors[0] = author;
    }

    public void addEntry(BlogEntry newEntry) {

    }

    public boolean addEntry(BlogEntry newEntry, Author author) {
        return false;
    }

    // static part
    private static void incrementCounter() {
        BlogAccount.accountCounter++;
    }
}
