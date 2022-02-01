import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class Student {
    private int id;
    private String name;
    private String surname;
    private String group;
    private ArrayList<Book> borrowedBooks = new ArrayList<>();

    public Student() {}

    public Student(int id, String name, String surname, String group, ArrayList<Book> borrowedBooks) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.borrowedBooks = borrowedBooks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(ArrayList<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public void addBookS(Book book){
        borrowedBooks.add(book);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + surname + " " + group + " " + borrowedBooks;
    }
}