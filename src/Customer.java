import java.util.Scanner;
public class Customer {
    public String name;
    public int personalNumber;
    public Account account;
    public Customer(String aName, int aPersonalNumber, Account aAccount){
        name= aName;
        personalNumber = aPersonalNumber;
        account = aAccount;
    }
}
