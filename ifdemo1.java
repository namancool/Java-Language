import java.util.Scanner;

public class ifdemo1 {
    public static void main(String args[]) {
        // int age = 8;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age : ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("Person is eligible to Vote");
        } else {
            System.out.println("Not eligible to vote");
        }

    }
}
