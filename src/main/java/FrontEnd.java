import java.util.Scanner;

public class FrontEnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Simple Calculator App");
        System.out.println("Enter two numbers:");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println("Choose an operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result: " + BackEnd.add(num1, num2));
                break;
            case 2:
                System.out.println("Result: " + BackEnd.subtract(num1, num2));
                break;
            case 3:
                System.out.println("Result: " + BackEnd.multiply(num1, num2));
                break;
            case 4:
                try {
                    System.out.println("Result: " + BackEnd.divide(num1, num2));
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
