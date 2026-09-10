import java.util.Scanner;
import java.util.InputMismatchException;

class StudentResult {
    Scanner input = new Scanner(System.in);
    void calculateResult() {
        try {
            System.out.print("Enter number of subjects: ");
            int n = input.nextInt();
            int total = 0;
            for (int i = 1; i <= n; i++) {
                System.out.print("Enter marks for subject " + i + ": ");
                int marks = input.nextInt();
                if (marks < 0 || marks > 100) {
                    throw new Exception("Marks must be between 0 and 100.");
                }
                total += marks;
            }
            if (n == 0) {
                throw new ArithmeticException("Cannot calculate average. No subjects entered.");
            }
            double average = (double) total / n;
            System.out.println("Total Marks = " + total);
            System.out.println("Average Marks = " + average);

        } catch (InputMismatchException e) {
            System.out.println("Invalid Input! Please enter numbers only.");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

public class CaseStudy13 {
    public static void main(String[] args) {
        StudentResult s = new StudentResult();
        s.calculateResult();
    }
}