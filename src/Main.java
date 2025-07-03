import current_account.CurrentAccount;

public class Main {
    public static void main(String[] args) {
        CurrentAccount augustoAccount = new CurrentAccount(1234, 1, "Augusto", "04/07/2005", 100.00);
        augustoAccount.withdraw(90.00);
        augustoAccount.getBalance();
        augustoAccount.deposit(200.00);
        augustoAccount.getBalance();
    }
}

