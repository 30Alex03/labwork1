package Person;

/**
 *
 * @author ivahno
 */
public class Director {
    private PersonBuilder personBuilder;

    public void setPersonBuilder(PersonBuilder personBuilder) {
        this.personBuilder = personBuilder;
    }

    public Person getPerson() {
        return personBuilder.getPerson();
    }

    public void constructPerson() {
        personBuilder.createNewPerson();
        personBuilder.buildName();
        personBuilder.buildMiddleName();
        personBuilder.buildSurname();
    }
}
