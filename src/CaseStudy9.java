import java.util.Scanner;

class Student {
    String courses[] = new String[5];
    int count = 0;

    void registerCourse(String course) {
        if (count < 5) {
            courses[count] = course;
            count++;
            System.out.println("Course registered successfully.");
        } else {
            System.out.println("Cannot register. Maximum 5 courses allowed.");
        }
    }

    void displayCourses() {
        System.out.println("\nRegistered Courses:");

        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + courses[i]);
        }
    }
}

public class CaseStudy9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student s = new Student();
        int c=0;
        while (true) {
            System.out.print("Do you want to register in any course(yes/no) : ");
            String ch = input.nextLine();
            if (ch.equals("yes")) {
                System.out.print("Enter course name: ");
                String course = input.nextLine();
                s.registerCourse(course);
                c++;
                if(c>=5){
                    System.out.println("Cannot register more. Maximum 5 courses allowed.");
                    break;
                }
                continue;
            }
            break;
        }
        System.out.println("Your registered Courses are : ");
        s.displayCourses();
    }
}