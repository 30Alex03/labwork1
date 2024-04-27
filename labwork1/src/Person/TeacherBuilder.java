package Person;

/**
 *
 * @author ivahno
 */
public class TeacherBuilder extends PersonBuilder{
     @Override
    public void buildName() {
        person.setName(ng.randomName());
    }

    @Override
    public void buildMiddleName() {
        person.setMiddleName(ng.randomMiddleName());
    }

    @Override
    public void buildSurname() {
        person.setSurname(ng.randomTeacherSurname());
    }
}
