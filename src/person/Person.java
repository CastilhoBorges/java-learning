package person;

public class Person implements IPerson {
    private final String firstName;
    private final String lastName;
    private final Integer age;
    private final Gender gender;

    public Person(String firstName, String lastName, Integer age, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public Integer getAge() {
        return this.age;
    }

    public Gender getGender() {
        return this.gender;
    }
}
