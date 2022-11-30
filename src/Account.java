import java.util.Scanner;
public class Account {
    Customer owner;
    private double balance;
    private float latestTransaction;

    public Account(Customer aOwner, double aBalance, float aLatestTransaction) {
        owner = aOwner;
        balance = aBalance;
        latestTransaction = aLatestTransaction;
    }

    public Customer getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public float getLatestTransaction() {
        return latestTransaction;
    }
}
