package libros;

public class Libro {
    private int isbn;
    private String title;
    private String author;
    private int numOfPages;
    public static int numOfLibros;

    public Libro(int isbn, String title, String author, int numOfPages) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.numOfPages = numOfPages;
        numOfLibros++;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    @Override
    public String toString() {
        return "\nTitulo: " + this.title +
                "\nISBN: " + this.isbn +
                "\nAutor: " + this.author +
                "\nNúmero de paginas: " + numOfPages;
    }
}
