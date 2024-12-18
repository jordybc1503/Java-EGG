import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String input = scanner.nextLine();
        int count = 0;
        try {
            Double number = Double.valueOf(input);
        } catch (NumberFormatException e) {
            System.out.println("The input is not a number");
            return;
        }

        for(int i = 0; i<input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isDigit(c)) {
                count++;
            }
        }
        System.out.println("The input contains " + count + " digits");
    }
}
