import current_account.CurrentAccount;
import person.Gender;
import person.Person;

public class Main {
    public static void main(String[] args) {
        CurrentAccount augustoAccount = new CurrentAccount(1234, 1, "Augusto", "04/07/2005", 100.00);
        augustoAccount.withdraw(90.00);
        augustoAccount.getBalance();
        augustoAccount.deposit(200.00);
        augustoAccount.getBalance();

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

