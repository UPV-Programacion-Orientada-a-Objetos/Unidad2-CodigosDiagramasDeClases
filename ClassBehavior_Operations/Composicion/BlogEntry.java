package mx.edu.spolancom;

public class BlogEntry {

    private Introduction intro; // = new Introduction();
    private MainBody body; // = new MainBody();

    public BlogEntry() {
        this.intro = new Introduction();
        this.body = new MainBody();
    }

    public void addIntroAndBody(String intro, String body) {
        this.intro.addContent(intro);
        this.body.addContent(body);
    }
}
