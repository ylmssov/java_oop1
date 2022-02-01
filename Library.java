import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Student> students = new ArrayList<>();

    public Library() {}

    public Library(ArrayList<Book> books, ArrayList<Student> students) {
        this.books = books;
        this.students = students;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void addBook(Book book){
        books.add(book);
    }
    public void addStudent(Student student){
        students.add(student);
    }
}