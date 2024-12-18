import java.util.Scanner;

public class CountBlankSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        int count = 0;

        for(int i = 0; i<input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isWhitespace(c)) {
                count++;
            }
        }

        System.out.println("The input contains " + count + " blank spaces");
    }
}
