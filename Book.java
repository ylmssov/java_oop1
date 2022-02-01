public class Book {
    private String title;
    private String author;
    private String isbn;
    private int years;
    private int quantity;

    public Book() {}

    public Book(String title, String author, String isbn, int years, int quantity) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.years = years;
        this.quantity = quantity;
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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return title + " " + author + " " + isbn + " " + years + " " + quantity;
    }
}