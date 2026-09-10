import java.util.Scanner;
import java.util.InputMismatchException;

class busBooking {
    int avlSeats, age, seats;

    busBooking() {
        avlSeats = 10;
    }

    void booking() {
        Scanner input = new Scanner(System.in);
        System.out.println(" ==== BUS BOOKING SYSTEM ====");
        System.out.println("-> Available Seats : " + avlSeats);

        try {
            System.out.print("Enter Your Age : ");
            age = input.nextInt();

            System.out.print("Enter Number of Seats : ");
            seats = input.nextInt();
            if (age <= 0) {
                throw new Exception("Invalid Age! Age must be greater than 0.");
            }
            if (seats <= 0) {
                throw new Exception("Invalid Number of Seats! Seats must be greater than 0.");
            }
            if (seats > avlSeats) {
                throw new Exception("Insufficient Seats! Only "
                        + avlSeats + " seats are available.");
            }
            avlSeats -= seats;
            System.out.println("Seats are successfully booked.");
            System.out.println("-> Available Seats : " + avlSeats);
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input! Please enter numbers only.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

public class CaseStudy11 {
    public static void main(String[] args) {
        busBooking bus = new busBooking();
        bus.booking();
    }
}