package BookFactory;

/**
 *
 * @author ivahn
 */
public class EnglishBookFactory implements BookFactory {
    
    TitleGenerator tg = new TitleGenerator();
    
    @Override
    public FictionBook createFictionBook() {
        return new EnglishFictionBook(tg.randomFicEngTitle(), tg.randomFicEngAuthor(), tg.randomArtist());
    }

    @Override
    public EducationBook createEducationBook() {
        return new EnglishEducationBook(tg.randomEduEngTitle(), tg.randomLevel(), tg.randomEduEngSubject(), tg.randomEduEngAuthor(), tg.randomUniversity());
    }
}
