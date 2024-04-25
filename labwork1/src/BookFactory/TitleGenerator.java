package BookFactory;

import java.util.ArrayList;
import java.util.Random;
import labwork1.ReaderCSV;

/**
 *
 * @author ivahn
 */
public class TitleGenerator {
    private ReaderCSV reader = new ReaderCSV();
    private ArrayList<String> titleEduEngList = reader.readCsv("src/Files/edu eng titles.csv");
    private ArrayList<String> levelList = reader.readCsv("src/Files/levels.csv");
    private ArrayList<String> subjectEduEngList = reader.readCsv("src/Files/edu eng subjects.csv");
    private ArrayList<String> authorEduEngList = reader.readCsv("src/Files/edu eng authors.csv");
    private ArrayList<String> universityList = reader.readCsv("src/Files/universities.csv");
    private ArrayList<String> titleEduRusList = reader.readCsv("src/Files/edu rus titles.csv");
    private ArrayList<String> typeList = reader.readCsv("src/Files/types.csv");
    private ArrayList<String> subjectEduRusList = reader.readCsv("src/Files/edu rus subjects.csv");
    private ArrayList<String> titleFicEngList = reader.readCsv("src/Files/fic eng titles.csv");
    private ArrayList<String> authorFicEngList = reader.readCsv("src/Files/fic eng authors.csv");
    private ArrayList<String> artistList = reader.readCsv("src/Files/artists.csv");
    private ArrayList<String> authorFicRusList = reader.readCsv("src/Files/fic rus authors.csv");
    private ArrayList<String> titleFicRusList = reader.readCsv("src/Files/fic rus titles.csv");
    private ArrayList<String> yearList = reader.readCsv("src/Files/years.csv");
    private Random r = new Random();

    public String random(ArrayList<String> list) {
        return list.get(r.nextInt(list.size()));
    }
    
    public String randomEduEngTitle() {
        return random(titleEduEngList);
    }
    
    public String randomLevel() {
        return random(levelList);
    }
    
    public String randomEduEngSubject() {
        return random(subjectEduEngList);
    }
    
    public String randomEduEngAuthor() {
        return random(authorEduEngList);
    }
    
    public String randomUniversity() {
        return random(universityList);
    }
    
    public String randomEduRusTitle() {
        return random(titleEduRusList);
    }
    
    public String randomType() {
        return random(typeList);
    }
    
    public String randomEduRusSubject() {
        return random(subjectEduRusList);
    }
    
    public String randomFicEngTitle() {
        return random(titleFicEngList);
    }
    
    public String randomArtist() {
        return random(artistList);
    }
    
    public String randomFicEngAuthor() {
        return random(authorFicEngList);
    }
    
    public String randomFicRusAuthor() {
        return random(authorFicRusList);
    }
    
    public String randomFicRusTitle() {
        return random(titleFicRusList);
    }
    
    public String randomYear() {
        return random(yearList);
    }
}
