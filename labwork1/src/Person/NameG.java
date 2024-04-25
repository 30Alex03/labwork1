package Person;

import java.util.ArrayList;
import java.util.Random;
import labwork1.ReaderCSV;

/**
 *
 * @author ivahn
 */
public class NameG {
    private ReaderCSV reader = new ReaderCSV();
    private ArrayList<String> nameList = reader.readCsv("src/Files/names.csv");
    private ArrayList<String> studentSurnameList = reader.readCsv("src/Files/student surnames.csv");
    private ArrayList<String> middlenameList = reader.readCsv("src/Files/middlenames.csv");
    private ArrayList<String> teacherSurnameList = reader.readCsv("src/Files/teacher surnames.csv");
    private Random r = new Random();

    public String randomName() {
        return nameList.get(r.nextInt(nameList.size()));
    }
    
    public String randomMiddleName() {
        return middlenameList.get(r.nextInt(middlenameList.size()));
    }
    
    public String randomStudentSurname() {
        return studentSurnameList.get(r.nextInt(studentSurnameList.size()));
    }
    
    public String randomTeacherSurname() {
        return teacherSurnameList.get(r.nextInt(teacherSurnameList.size()));
    }
}
