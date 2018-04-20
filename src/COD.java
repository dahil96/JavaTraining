import java.util.Date;

public class COD extends BankAccount {
    private Date dateOfExpire;

    public COD (Date experationDate, String name) {
        this.balance = 0;
        this.dateOfExpire = experationDate;
        this.accountNumber = newAccountNumber(name);
    }
}
