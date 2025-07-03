package current_account;

import java.util.Date;

public interface ICurrentAccount {
    void withdraw(double amount);
    void deposit(double amount);
    void getBalance();
}
