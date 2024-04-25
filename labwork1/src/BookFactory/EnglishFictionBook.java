package BookFactory;

/**
 *
 * @author ivahn
 */
public class EnglishFictionBook extends EnglishBook implements FictionBook {
    private String title;
    private String author;
    private String artist;

    public EnglishFictionBook(String title, String author, String artist) {
        this.title = title;
        this.author = author;
        this.artist = artist;
    }
    
    @Override
    public String getTitle() {
        return title + " by " + author + ". Artist: " + artist;
    }
}
