package BookFactory;

/**
 *
 * @author ivahn
 */
public class RussianBookFactory implements BookFactory{
    TitleGenerator tg = new TitleGenerator();
    
    @Override
    public FictionBook createFictionBook() {
        return new RussianFictionBook(tg.randomFicRusTitle(), tg.randomFicRusAuthor(), tg.randomYear());
    }

    @Override
    public EducationBook createEducationBook() {
        return new RussianEducationBook(tg.randomEduRusTitle(), tg.randomEduRusSubject(), tg.randomType());
    }
}
