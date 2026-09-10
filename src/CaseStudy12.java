import java.util.Scanner;
import java.util.InputMismatchException;

class bank {
    double Balance;
    Scanner input = new Scanner(System.in);

    bank(double bal) {
        Balance = bal;
    }

    void deposit() {
        System.out.print("Enter Amount to deposit : ");

        try {
            double x = input.nextDouble();
            if (x <= 0) {
                throw new Exception("Amount must be greater than 0.");
            }
            Balance += x;
            System.out.println(x + " is deposited Successfully.");

        } catch (InputMismatchException e) {
            System.out.println("Invalid Input !!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    void withdraw() {
        System.out.print("Enter Amount to withdraw : ");

        try {
            double x = input.nextDouble();
            if (x <= 0) {
                throw new Exception("Amount must be greater than 0.");
            }
            if (Balance < x) {
                throw new Exception("Insufficient Balance !!!");
            }
            Balance -= x;
            System.out.println(x + " is withdrawn Successfully.");

        } catch (InputMismatchException e) {
            System.out.println("Invalid Input !!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    void displayBalance() {
        System.out.println("Your current balance is " + Balance);
    }
}

public class CaseStudy12 {
    public static void main(String[] args) {
        System.out.println("Welcome to Bank.");
        bank b = new bank(1000);
        b.displayBalance();
        b.withdraw();
        b.deposit();
        b.withdraw();
        b.displayBalance();
    }
}