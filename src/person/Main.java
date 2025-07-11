package person;

public class Main {
    public static void main(String[] args) {
        System.out.println("AUGUSTO PERSON");
        Person augusto = new Person("Augusto", "Borges", 18, Gender.MALE);
        System.out.println(augusto.getAge());
        System.out.println(augusto.getGender().getDescription());
        System.out.println(augusto.getFullName());

        System.out.println("CINTIA PERSON");
        Person cintia = new Person("Cintia", "Silva", 18, Gender.FEMALE);
        System.out.println(cintia.getAge());
        System.out.println(cintia.getGender().getDescription());
        System.out.println(cintia.getFullName());
    }
}

