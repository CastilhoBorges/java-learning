package current_account;

public class CurrentAccount implements ICurrentAccount {
    int accout;
    int agency;
    String name;
    String birthday;
    double balance;

    public CurrentAccount(int accout, int agency, String name, String birthday, double balance) {
        this.accout = accout;
        this.agency = agency;
        this.name = name;
        this.birthday = birthday;
        this.balance = balance;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
        }
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    @Override
    public void getBalance() {
        System.out.println(this.balance);
    }
}
