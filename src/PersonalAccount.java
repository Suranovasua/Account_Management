import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
public class PersonalAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;
    private ArrayList<Amount> transactions;
    public PersonalAccount(int accNumb, String accHolder) {
        this.accountNumber = accNumb;
        this.accountHolder = accHolder;
        this.balance = 0.0;
        this.transactions = new ArrayList();
    }
    public void deposit(double amount) {
        if (amount > 0.0) {
            this.transactions.add(new Amount(amount, "Deposit"));
            this.balance += amount;
            System.out.println("Deposited $" + amount);
        } else {
            System.out.println("Incorrect amount.");
        }
    }
    public void printTransactionHistory() {
        System.out.println("History of  transactions of account:" + this.accountHolder + "#"+ this.accountNumber);
    }
    public void withdraw(double amount) {
        if (amount > 0.0 && amount <= this.balance) {
            this.transactions.add(new Amount(amount, "Withdrawal"));
            this.balance -= amount;
            System.out.println("Withdrawn $" + amount);
        } else {
            System.out.println("Incorrect amount.");
        }
    }

    public double getBalance() {
        return this.balance;
    }
    public int getAccountNumber() {
        return this.accountNumber;    }
    public String getAccountHolder() {
        return this.accountHolder;
    }
}