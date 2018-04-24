package BankAccount;

public class SavingsAccount extends BankAccount {
    private int nrOfWithdrawlsLeft;

    public SavingsAccount (int withdrawlsLimit, String name) {
        this.balance = 0;
        this.nrOfWithdrawlsLeft = withdrawlsLimit;
        this.accountNumber = newAccountNumber(name);
    }
}
