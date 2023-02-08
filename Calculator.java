import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        String thing = null;
        int ans = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two numbers.");
        int first = scan.nextInt();
        int second = scan.nextInt();

        System.out.println("Would you like to:" + "\n1. Add\n2. Subtract");
        int choice = scan.nextInt();
        if (choice == 1) {
            ans = first + second;
            thing = " + ";
            System.out.println(first + thing + second + " = " + ans);
        } else if (choice == 2) {
            ans = first - second;
            thing = " - ";
            System.out.println(first + thing + second + " = " + ans);
        } else {
            System.out.println("Invalid input");
        }
    }
}
