import java.util.Scanner;

public class ChainToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String input = scanner.nextLine();
        try {
            Integer number = Integer.valueOf(input);
            System.out.println("The number is: " + number);
        } catch (NumberFormatException e) {
            System.out.println("The input is not a integer number");
        }
    }   
}
