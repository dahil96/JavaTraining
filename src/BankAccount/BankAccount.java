package BankAccount;

import java.util.Random;

public class BankAccount {
    protected String accountNumber;
    protected double balance;

    Random numberGenerator = new Random();

    protected String newAccountNumber (String name) {
        return name + numberGenerator.nextInt(100);
    }

    public void deposit (double amount) {
        balance = balance + amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
