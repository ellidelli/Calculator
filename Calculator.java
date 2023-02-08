import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        float ans = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two numbers.");
        float first = scan.nextFloat();
        float second = scan.nextFloat();

        System.out.println("\nWould you like to:" + "\n1. Add\n2. Subtract\n3. Multiply\n4. Divide");
        int choice = scan.nextInt();
        if (choice == 1) {
            ans = first + second;
            System.out.println(first + " + " + second + " = " + ans);
        } else if (choice == 2) {
            ans = first - second;
            System.out.println(first + " - " + second + " = " + ans);
        } else if (choice == 3) {
            ans = first * second;
            System.out.println(first + " * " + second + " = " + ans);
        } else if (choice == 4) {
            if (second == 0) {
                System.out.println("Error: divide by zero.");
            } else {
            ans = first / second;
            System.out.println(first + " / " + second + " = " + ans);
            }
        } else {
            System.out.println("Invalid input");
        }

        scan.close();
    }
}
