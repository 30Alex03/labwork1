package BookFactory;

/**
 *
 * @author ivahn
 */
public class RussianFictionBook implements FictionBook{
    
    private String title;
    private String author;
    private String year;

    public RussianFictionBook(String title, String author, String year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String getTitle() {
        return title + ". " + author + ". " + year;
    }
}
