package mx.edu.spolancom;

import java.util.Vector;

public class Author {
    private String name;
    private Vector<BlogAccount> accounts;

    public Author() {

    }

    public Author(BlogAccount... accounts) {
        for(int i=0; i< accounts.length; i++) {
            this.addBlogAccount(accounts[i]);
        }
    }

    public Author(BlogAccount account) {
        this.accounts.add(account);
    }

    public void addBlogAccount(BlogAccount account) {
        this.accounts.add(account);
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getName() {
        return this.name;
    }
}
