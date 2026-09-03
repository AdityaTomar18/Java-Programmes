import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CaseStudy1 {
    String Name;
    int Total=0;
    double percentage;
    ArrayList<Integer> arr = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    void inputDetails(){
        System.out.print("Enter your name : ");
        Name = input.next();
        System.out.print("Enter your marks : ");
        for(int i =0;i<5;i++){
            int x = input.nextInt();
            arr.add(x);
        }
    }
    void DisplayGradings(){
        Iterator<Integer> itr = arr.iterator();
        for(int i=0;i<5;i++){
            int x = itr.next();
            Total+=x;
        }
//        ALTERNATE WAY WITHOUT USING ITERATOR
//        for(int x : arr){
//            Total+=x;
//        }
        percentage= (double)Total/5;
        System.out.println("your Total marks is : "+Total);
        System.out.println("Your Percentage is : "+percentage);
        if(percentage>=90){
            System.out.println("Your grade is A");
        }else if(percentage>=80){
            System.out.println("Your grade is B");
        }else if(percentage>=70){
            System.out.println("Your grade is C");
        }else if(percentage>=60){
            System.out.println("Your grade is D");
        }else if(percentage>=50){
            System.out.println("Your grade is E");
        }else{
            System.out.println("Your grade is F");
        }
    }

    static void main() {
        CaseStudy1 cs = new CaseStudy1();
        cs.inputDetails();
        cs.DisplayGradings();
    }

}
