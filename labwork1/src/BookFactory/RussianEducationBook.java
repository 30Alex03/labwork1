package BookFactory;

/**
 *
 * @author ivahn
 */
public class RussianEducationBook extends RussianBook implements EducationBook {
    
    private String title;
    private String subject;
    private String type;

    public RussianEducationBook(String title, String subject, String type) {
        this.title = title;
        this.subject = subject;
        this.type = type;
    }
    
    @Override
    public String getTitle() {
        return type + " " + title + ". " + subject;
    }
}
