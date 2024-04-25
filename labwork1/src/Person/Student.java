package Person;

/**
 *
 * @author ivahno
 */
public class Student extends PersonBuilder{
    @Override
    public void buildName() {
        person.setName(ng.randomName());
    }
    
    @Override
    public void buildMiddleName() {   
    }
    
    @Override
    public void buildSurname() {
        person.setSurname(ng.randomStudentSurname());
    }
}
