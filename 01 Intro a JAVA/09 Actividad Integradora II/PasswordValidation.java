import java.util.Scanner;

public class PasswordValidation {
    static Scanner scanner = new Scanner(System.in);

    // Main method
    public static void main(String[] args) {
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();

        // Regular expressions must be enclosed within double quotes in Java
        if (password.length() >= 8 &&
            password.matches(".*[a-z].*") && // At least one lowercase letter
            password.matches(".*[A-Z].*") && // At least one uppercase letter
            password.matches(".*\\d.*") && // At least one digit
            password.matches(".*[^\\w\\s].*")) { // At least one special character (excluding whitespace)

            System.out.println("Secure password! It meets all the criteria.");
        } else {
            System.out.println("Not secure password! It should have at least 8 characters, including at least one lowercase letter, one uppercase letter, one digit, and one special character.");
        }
    }
}