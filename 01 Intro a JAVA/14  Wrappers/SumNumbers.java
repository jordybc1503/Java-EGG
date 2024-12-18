import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String num1 = scanner.nextLine();
        System.out.println("Enter a second number: ");
        String num2 = scanner.nextLine();

        try {
            Double number1 = Double.valueOf(num1);
            Double number2 = Double.valueOf(num2);
            System.out.println("The sum is: " + (number1 + number2));
        } catch (NumberFormatException e) {
            System.out.println("The input is not a number");
        }
    }

    
}
