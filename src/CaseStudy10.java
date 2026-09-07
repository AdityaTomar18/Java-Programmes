import java.util.Scanner;

interface Payment {
    void pay(double amount);
}

class CreditCard implements Payment {
    public void pay(double amount) {
        System.out.println("Payment of " + amount + " made using Credit Card.");
    }
}

class UPI implements Payment {
    public void pay(double amount) {
        System.out.println("Payment of " + amount + " made using UPI.");
    }
}

class NetBanking implements Payment {
    public void pay(double amount) {
        System.out.println("Payment of " + amount + " made using Net Banking.");
    }
}

public class CaseStudy10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter payment amount: ");
        double amount = input.nextDouble();

        System.out.println("1. Credit Card");
        System.out.println("2. UPI");
        System.out.println("3. Net Banking");

        System.out.print("Choose payment method: ");
        int choice = input.nextInt();

        Payment p;

        switch (choice) {
            case 1:
                p = new CreditCard();
                break;

            case 2:
                p = new UPI();
                break;

            case 3:
                p = new NetBanking();
                break;

            default:
                System.out.println("Invalid payment method.");
                return;
        }
        p.pay(amount);
    }
}