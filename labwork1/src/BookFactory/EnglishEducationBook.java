package BookFactory;

/**
 *
 * @author ivahn
 */
public class EnglishEducationBook implements EducationBook{
    
    private String title;
    private String level;
    private String subject;
    private String author;
    private String university;
    
    public EnglishEducationBook(String title, String level, String subject, String author, String university) {
        this.title = title;
        this.level = level;
        this.subject = subject;
        this.author = author;
        this.university = university;
    }
    

    @Override
    public String getTitle() {
        return title + " by " + author + ", " + university + ". " + subject + ". " + level;
    }

    
    
}
