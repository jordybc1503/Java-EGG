import java.util.Scanner;

public class NumberVerificator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.print("Enter a number: ");
        String input = scanner.nextLine();

        try {
            Double number = Double.valueOf(input);
            System.out.println("The number is: " + number);
        } catch (NumberFormatException e) {
            System.out.println("The input is not a number");
        }
    }   
}