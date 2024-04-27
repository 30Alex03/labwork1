package labwork1;

import BookFactory.EducationBook;
import BookFactory.FictionBook;
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
import Person.StudentBuilder;
import Person.TeacherBuilder;
import Person.Person;
import Person.PersonBuilder;

/**
 *
 * @author ivahno
 */
public class List {
    private Person person;
    private ArrayList<EducationBook> EducationbookList;
    private ArrayList<FictionBook> FictionbookList;
    private int numberOfBooks;
    private Random random;
    
    public List() {
        random = new Random();
        EducationbookList = new ArrayList<>();
        FictionbookList = new ArrayList<>();        
        setPerson();
        setBookList();
    }
    
    private void setPerson() {
        int n = random.nextInt(2);
        Director director = new Director();
        PersonBuilder personBuilder = switch (n) {
            case 0 ->
                new StudentBuilder();
            case 1 ->
                new TeacherBuilder();
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
                    FictionbookList.add(EngBookFactory.createFictionBook());
                }
                case 1 -> {
                    EducationbookList.add(EngBookFactory.createEducationBook());
                }
                case 2 -> {
                    FictionbookList.add(RusBookFactory.createFictionBook());
                }
                case 3 -> {
                    EducationbookList.add(RusBookFactory.createEducationBook());
                }
                default -> {
                }
            }
        }
    }

    public Person getPerson() {
        return person;
    }

    public ArrayList<EducationBook> getEducationBookList() {
        return EducationbookList;
    }
    
    public ArrayList<FictionBook> getFictionBookList() {
        return FictionbookList;
    }
    
    public int getNumberOfBooks() {
        return numberOfBooks;
    }
}
