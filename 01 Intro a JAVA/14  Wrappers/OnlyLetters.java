import java.util.Scanner;

public class OnlyLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean onlyLetters = true;

        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if(!Character.isLetter(c)) {
                onlyLetters = false;
                break;
            }
        }

        if(onlyLetters) {
            System.out.println("The input contains only letters");
        } else {
            System.out.println("The input contains not only letters");
        }
    }
}
