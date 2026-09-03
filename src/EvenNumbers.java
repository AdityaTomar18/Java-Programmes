import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EvenNumbers {
    ArrayList<Integer> arr = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    int n;
    void inArray() {
        System.out.print("Enter number of Elements : ");
        n = input.nextInt();
        System.out.print("Enter Elements : ");
        for(int i=0;i<n;i++){
            int x = input.nextInt();
            arr.add(x);
        }
        System.out.println("Elements in the array are : "+arr);
    }
    void OnlyEvens(){
        Iterator<Integer> itr = arr.iterator();
        System.out.println("Even Numbers in the Array are : ");
        while(itr.hasNext()){
            int i=itr.next();
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }

    static void main(String[] args) {
        EvenNumbers ev = new EvenNumbers();
        ev.inArray();
        ev.OnlyEvens();
    }

}
