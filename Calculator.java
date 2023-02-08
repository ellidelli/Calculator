import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers.");
        int first = scan.nextInt();
        int second = scan.nextInt();
        int sum = first + second;
        System.out.println(first + " + " + second + " = " + sum);
    }
}
