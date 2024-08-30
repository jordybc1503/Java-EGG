import java.util.Scanner;

class AppMath {

    static Scanner scanner = new Scanner(System.in);

    // Main method
    public static void main(String[] args) {
        AppMath app = new AppMath();

        // options
        System.out.println("Choose an option:");
        System.out.println("1. Determine the abs of number");
        System.out.println("2. Round a number");
        System.out.println("3. Random number");
        System.out.println("4. Power of number");
        System.out.println("5. Square of number");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                app.absolutenumber();
                break;
            case 2:
                app.roundnumber();
                ;
                break;
            case 3:
                app.randomnumber();
                break;
            case 4:
                app.powernumber();
                break;
            case 5:
                app.squarecalulator();
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }

    // 1. Method to calculate a abs number
    public void absolutenumber() {
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        int absoluteNumber = Math.abs(number);
        System.out.println("The absolute value is: " + absoluteNumber);
    }

    // 2 Round a number
    public void roundnumber() {
        System.out.println("Enter a number: ");
        float number = scanner.nextFloat();
        System.out.println("The round number is " + Math.round(number));
    }

    // 3. Generate a random number 1 to 355
    public void randomnumber() {
        System.out.println("The random number is " + (int) (Math.floor(Math.random() * 355) + 1));
    }

    // 4 Power of a number
    public void powernumber() {
        System.out.println("Enter a number base");
        int base = scanner.nextInt();
        System.out.println("Enter a number exponent");
        int exponent = scanner.nextInt();
        System.out.println("The number " + base + " pow to " + exponent + " is " + (int) Math.pow(base, exponent));
    }

    // 5 Calculating the square root
    public void squarecalulator(){
        System.out.println("Enter a number base");
        int number = scanner.nextInt();
        if (number >= 0) {
            System.out.println("The square of "+number + " is " + Math.sqrt(number)); 
        } else {
            System.out.println("The number is negative, please enter a postive number");
        }  
    }

}
