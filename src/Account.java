import java.util.Scanner;
public class Account {
    String owner;
    private double balance;
    private float latestTransaction;

    public Account(String aOwner, double aBalance, float aLatestTransaction) {
        owner = aOwner;
        balance = aBalance;
        latestTransaction = aLatestTransaction;
    }


}
