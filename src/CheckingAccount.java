public class CheckingAccount extends BankAccount {
    private double limit;

    public CheckingAccount (double limit, String name) {
        this.limit = limit;
        this.balance = 0;
        this.accountNumber = newAccountNumber(name);
    }
}
