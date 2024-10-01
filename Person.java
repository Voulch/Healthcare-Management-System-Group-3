package Healthcare;

public class Person {
    protected String id;
    protected String name;
    protected String dateOfBirth;
    protected String phoneNumber;

    public Person(String id, String name, String dateOfBirth, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }
}
