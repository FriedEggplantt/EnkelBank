import java.util.ArrayList;
import java.util.Scanner;
public class Bank {
    Scanner choice = new Scanner(System.in);
    public Scanner choicer = new Scanner(System.in);
    public Scanner moneyPut = new Scanner(System.in);
    public  Scanner aname = new Scanner(System.in);
    public Scanner apn = new Scanner(System.in);
    public Scanner chosing = new Scanner(System.in);
    ArrayList<Account> accounts = new ArrayList<>();
    public int customers;
    int currentUser;
    public Bank() {
    }

    public void start(){
        if(currentUser != 0){
            System.out.println("You are currently logged in as: " + accounts[currentUser]);
        }
        System.out.println("Welcome to the bank! What can we help you with?");
        System.out.println("-----------------------------------------------");
        System.out.println("1 - Make an account");
        System.out.println("2 - Log in to your account");
        System.out.println("3 - Change account balance");
        System.out.println("-----------------------------------------------");
        System.out.println("Amount of accounts: " + customers);
        System.out.println("The bank's total revenue: ");
        System.out.println();
        System.out.println("Your choice: ");

        while (true) {
            int theChoice = choice.nextInt();
            if (theChoice == 1) {
                break;
            } else if (theChoice == 2) {
                break;

            } else if (theChoice == 3) {
                addMoney();
                break;
            } else {
                System.out.println("OBS! Please pick a valid option");
            }
        }
    }

    public void login(){
        for(int i = 0; i<accounts.size(); i++){ //for loop som skriver ut varje account
            System.out.println((i+1) + " " + accounts.get(i));
        }
        System.out.println();
        System.out.println("Select your account: ");
        while(true) {
            int selectAcc = chosing.nextInt();
            if(selectAcc <= 0 || selectAcc >accounts.size()){
                System.out.println("OBS! Select a valid account");
            }
            Account currentAcc= accounts.get(selectAcc);
            System.out.println();
            System.out.println("Name: " + currentUser);
            System.out.println("Personal number: " + currentAcc.get.personalNumber);
            System.out.println("Account number: " + currentAcc.);
            System.out.println("Balance: " + accounts.get(selectAcc).get.balance);
            currentUser = selectAcc-1;
            break;
        }
    }

    public void newCustomer(){

        System.out.println("Please state the following when requested");
        System.out.println("Your name: ");
        String name = aname.next();
        System.out.println("Your personal number (12 char): ");
        int personalNumber = apn.nextInt();
        customers += 1;
        new Customer(name, personalNumber);
        accounts.new(Customer);
    }

    public void addMoney() {
        System.out.println("Your balance is: " + account.get(balance));
        System.out.println("What would you like to do with your money?");
        System.out.println("1 - Deposit");
        System.out.println("2 - Withdraw");
        while (true) {
            int theMoneyChoice = choicer.nextInt();
            if (theMoneyChoice == 1) {
                System.out.println();
                System.out.println("Insert amount: ");
                int DepositAmount = moneyPut.nextInt();
                this.balance += DepositAmount;
                break; } else if (theMoneyChoice == 2 && this.balance != 0) {
                System.out.println();
                System.out.println("Insert amount: ");
                while(true) { //loop för att se till så att användaren inte tar bort pengar så värdet blir under 0
                    int WithdrawAmount = moneyPut.nextInt();
                    if( this.balance - WithdrawAmount < 0){
                        System.out.println("You cannot withdraw your balance to below 0, please try again.");
                    }
                    this.balance -= WithdrawAmount;
                    break;
                }
                break;  }
            else if(this.balance == 0){
                System.out.println();
                System.out.println("Your balance is 0, you cannot withdraw any money.");
            }else {
                System.out.println("OBS! Please pick a valid option");
            }
        }
    }
}
