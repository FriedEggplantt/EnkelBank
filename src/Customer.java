import java.util.Scanner;
public class Customer {
    public String name;
    public int personalNumber;
    public Account account;
    public Customer(String aName, int aPersonalNumber){
        name= aName;
        personalNumber = aPersonalNumber;
    }


    connectAccount(){
        account=new Account(this, 100, 0);
    }
}
