package Person;

/**
 *
 * @author ivahno
 */
public abstract class PersonBuilder {
    protected Person person;
    protected NameG ng = new NameG();

    public Person getPerson() {
        return person;
    }

    public void createNewPerson() {
        person = new Person();
    }

    public abstract void buildName();

    public abstract void buildMiddleName();

    public abstract void buildSurname();
}
