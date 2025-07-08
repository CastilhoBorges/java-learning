package current_account;

public interface ICurrentAccount {
    void withdraw(double amount);
    void deposit(double amount);
    void getBalance();
}
