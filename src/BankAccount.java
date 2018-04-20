import java.util.Random;

public class BankAccount {
    protected String accountNumber;
    protected double balance;

    Random numberGenerator;

    protected String newAccountNumber (String name) {
        return name + numberGenerator.nextInt(100);
    }

    protected void deposit (double amount) {
        balance = balance + amount;
    }

    protected double getBalance() {
        return balance;
    }

    protected String getAccountNumber() {
        return accountNumber;
    }
}
