import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Library l = new Library();

        while(true){
            System.out.println("PRESS 1 TO ADD BOOK");
            System.out.println("PRESS 2 TO ADD STUDENT");
            System.out.println("PRESS 3 TO ADD BOOK TO STUDENT");
            System.out.println("PRESS 4 TO DELETE BOOK TO STUDENT");
            System.out.println("PRESS 5 TO LIST_BOOKS AND LIST_STUDENTS");
            System.out.println("PRESS 6 TO LIST_BOOKS FOR STUDENT");
            System.out.println("PRESS 0 TO EXIT");

            int choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("insert title :");
                    String title = in.next();
                    System.out.print("insert author :");
                    String author = in.next();
                    System.out.print("insert isbn :");
                    String isbn = in.next();
                    System.out.print("insert year :");
                    int year = in.nextInt();
                    System.out.print("insert quantity :");
                    int quantity = in.nextInt();
                    Book book = new Book(title, author, isbn, year, quantity);
                    l.addBook(book);
                    break;
                case 2 :
                    ArrayList books = new ArrayList();
                    System.out.print("insert id :");
                    int id = in.nextInt();
                    System.out.print("insert name :");
                    String name = in.next();
                    System.out.print("insert surname :");
                    String surname = in.next();
                    System.out.print("insert group :");
                    String group = in.next();
                    Student s = new Student(id,name,surname,group,books);
                    l.addStudent(s);
                    break;
                case 3:
                    System.out.println(l.getStudents());
                    System.out.println("insert number of student");
                    int choice1 = in.nextInt();


                    System.out.println(l.getBooks());
                    System.out.println("insert number of book");
                    int choice2 = in.nextInt();

                    Student s1 = new Student();
                    s1 = l.getStudents().get(choice1-1);

                    Book book1 = new Book();
                    book1 = l.getBooks().get(choice2-1);
                    s1.addBookS(book1);
                    break;
                case 4 :
                    System.out.println(l.getStudents());
                    System.out.println("insert number of student");
                    int choice3 = in.nextInt();

                    Student s3 = l.getStudents().get(choice3-1);
                    System.out.println(s3.getBorrowedBooks());
                    System.out.println("insert number of book");
                    int choice4 = in.nextInt();
                    s3.getBorrowedBooks().remove(choice4-1);

                    break;
                case 5:
                    System.out.println(l.getStudents());
                    System.out.println(l.getBooks());
                    break;
                case 6:
                    System.out.println(l.getStudents());
                    System.out.println("insert number of student");
                    int choice5 = in.nextInt();

                    Student s4 = l.getStudents().get(choice5-1);
                    System.out.println(s4.getBorrowedBooks());
                    break;
                case 0:
                    return;
            }
        }
    }
}