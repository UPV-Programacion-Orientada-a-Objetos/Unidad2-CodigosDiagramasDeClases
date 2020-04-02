package mx.edu.spolancom;

public class Main {

    public static void main(String[] args) {
	    BlogEntry be = new BlogEntry();

	    be.addIntroAndBody("Hola", "mundo");

	    // Si eliminamos la instancia be, se elimina completamente todo el contenido

        be = null;
    }
}
