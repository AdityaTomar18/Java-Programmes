import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class BankAccount{
    int Balance;
    BankAccount(int bal){
        Balance = bal;
    }
    void deposit(int x){
        Balance+=x;
        System.out.println(x+ " is deposited successfully.");
    }
    void withdraw(int x){
        if(Balance<x){
            System.out.println("Insufficient Balance !!!");
        }
        else{
            Balance -= x;
            System.out.println(x + " is withdrawn Successfully.");
        }
    }
    void displayBalance(){
        System.out.println("Your current balance is "+Balance);
    }
}

public class CaseStudy2 {
    public static void main() {
        BankAccount bank = new BankAccount(1000);
        bank.deposit(4000);
        bank.withdraw(6000);
        bank.withdraw(4999);
        bank.displayBalance();
    }

}
