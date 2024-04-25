package labwork1;

import BookFactory.Book;
import BookFactory.BookFactory;
import BookFactory.RussianBookFactory;
import BookFactory.EnglishBookFactory;
import BookFactory.EnglishFictionBook;
import BookFactory.RussianEducationBook;
import BookFactory.RussianFictionBook;
import BookFactory.EnglishEducationBook;
import java.util.ArrayList;
import java.util.Random;
import Person.Director;
import Person.Student;
import Person.Teacher;
import Person.Person;
import Person.PersonBuilder;

/**
 *
 * @author ivahno
 */
public class List {
    private Person person;
    private ArrayList<Book> bookList;
    private int numberOfBooks;
    private Random random;
    
    public List() {
        random = new Random();
        bookList = new ArrayList<>();
        setPerson();
        setBookList();
    }
    
    private void setPerson() {
        int n = random.nextInt(2);
        Director director = new Director();
        PersonBuilder personBuilder = switch (n) {
            case 0 ->
                new Student();
            case 1 ->
                new Teacher();
            default ->
                null;
        };
        director.setPersonBuilder(personBuilder);
        director.constructPerson();
        person = director.getPerson();
    }

    private void setBookList() {
        numberOfBooks = random.nextInt(3, 11);
        BookFactory EngBookFactory = new EnglishBookFactory();
        BookFactory RusBookFactory = new RussianBookFactory();
        for (int i = 0; i < numberOfBooks; i++) {
            int n = random.nextInt(4);
            switch (n) {
                case 0 -> {
                    bookList.add(EngBookFactory.createFictionBook());
                }
                case 1 -> {
                    bookList.add(EngBookFactory.createEducationBook());
                }
                case 2 -> {
                    bookList.add(RusBookFactory.createFictionBook());
                }
                case 3 -> {
                    bookList.add(RusBookFactory.createEducationBook());
                }
                default -> {
                }
            }
        }
    }

    public Person getUser() {
        return person;
    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }
}
