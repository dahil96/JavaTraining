import java.util.GregorianCalendar;

public class AccountManager {
    public static void main (String args []) {
        CheckingAccount myCheck = new CheckingAccount(10000, "Daniel");
        SavingsAccount mySave = new SavingsAccount(10, "Kajsa");
        COD myCOD = new COD( new GregorianCalendar(2020,12,12).getTime(), "Linus");

        myCheck.deposit(20);
        mySave.deposit(2000);
        myCOD.deposit(20000);

        System.out.println("Checking account balance is:" + myCheck.getBalance());
        System.out.println("Savings account balance is:" + mySave.getBalance());
        System.out.println("COD account balance is:" + myCOD.getBalance());

    }
}

