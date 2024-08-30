import java.util.Scanner;

public class App {

    // Main method
    public static void main(String[] args) {
        App app = new App();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Determine text length");
        System.out.println("2. Concatenate names");
        System.out.println("3. Extract substring");
        System.out.println("4. Look for index");
        System.out.println("5. Lower and");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        switch (choice) {
            case 1:
                app.determineTextLength();
                break;
            case 2:
                app.concatenateNames();
                break;
            case 3:
                app.substring();
                break;
            case 4:
                app.character();
                break;
            case 5:
                app.lowerAndUpperCase();
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }

    // 1. Method to determine the length of a text string
    public void determineTextLength() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text string: ");
        String text = scanner.nextLine();
        int len_text = text.length();
        System.out.println("The string length is: " + len_text);
    }

    // 2. Method to concatenate first and last name
    public void concatenateNames() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String first_name = scanner.nextLine();
        System.out.print("Enter your last name: ");
        String last_name = scanner.nextLine();
        String full_name = first_name.concat(" ").concat(last_name);
        System.out.println("Your full name is: " + full_name);
    }

    // 3. Method to strat a substring
    public void substring() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your text string: ");
        String text_string = scanner.nextLine();
        System.out.print("Enter a number between 1 to ".concat(Integer.toString(text_string.length())).concat(":"));
        Integer startIndex = scanner.nextInt();
        System.out.print("Enter a number between " + startIndex + " to " + text_string.length() + ":");
        Integer endIndex = scanner.nextInt();
        System.out.println(text_string.substring(startIndex, endIndex));
    }

    // 4 Look for a character
    public void character() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your text string: ");
        String text_string = scanner.nextLine();
        System.out.print("Enter your char: ");
        String sub_string = scanner.nextLine();
        System.out.println(text_string.indexOf(sub_string));

    }

    // 5 Lower and upper case
    public void lowerAndUpperCase() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your text string: ");
        String text_string = scanner.nextLine();
        System.out.println("Text in uppercase: " + text_string.toUpperCase());
        System.out.println("Text in lowercase: " + text_string.toLowerCase());

    }

}