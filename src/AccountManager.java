import java.util.Date
public class AccountManager {
    public static void Main (String args []) {
        CheckingAccount myCheck = new CheckingAccount(10000, "Daniel");
        SavingsAccount mySave = new SavingsAccount(10, "Kajsa");
        COD myCOD = new COD(Date("2020-12-12"), "Linus");
    }
}
