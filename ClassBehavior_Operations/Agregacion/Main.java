package mx.edu.spolancom;

public class Main {

    public static void main(String[] args) {
	    // Ejemplo 1
        Author autor1 = new Author(); // cuentas vacias
        BlogAccount ba1 = new BlogAccount();

        autor1.addBlogAccount(ba1); //agregamos una cuenta al autor
        autor1 = null; // aunque eliminemos la instancia de autor1 la cuenta ba1 sigue existiendo

        // Ejemplo 2
        BlogAccount ba[] = { new BlogAccount(), new BlogAccount()};
        Author author2 = new Author(ba);

        // lo mismo para si eliminarmos author2. las cuentas ba siguen existiendo
        author2 = null;
    }
}
