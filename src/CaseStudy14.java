import java.util.Scanner;
import java.util.InputMismatchException;

class Shopping {
    Scanner input = new Scanner(System.in);
    void calculateBill() {

        try {
            System.out.print("Enter Product Price: ");
            double price = input.nextDouble();
            System.out.print("Enter Quantity: ");
            int quantity = input.nextInt();
            System.out.print("Enter Discount Percentage: ");
            double discount = input.nextDouble();
            if (price <= 0) {
                throw new Exception("Invalid Product Price!");
            }
            if (quantity <= 0) {
                throw new Exception("Invalid Quantity!");
            }
            if (discount < 0 || discount > 100) {
                throw new Exception("Invalid Discount Percentage!");
            }
            double total = price * quantity;
            double discountAmount = total * discount / 100;
            double finalBill = total - discountAmount;
            System.out.println("Total Amount = " + total);
            System.out.println("Discount = " + discountAmount);
            System.out.println("Final Bill = " + finalBill);
            System.out.print("Enter Payment Amount: ");
            double payment = input.nextDouble();
            if (payment < finalBill) {
                throw new Exception("Payment amount is less than the bill!");
            }
            double change = payment - finalBill;
            System.out.println("Payment Successful!");
            System.out.println("Change = " + change);
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input! Please enter numbers only.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

public class CaseStudy14 {
    public static void main(String[] args) {
        Shopping s = new Shopping();
        s.calculateBill();
    }
}