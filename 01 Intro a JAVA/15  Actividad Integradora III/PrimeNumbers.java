import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int number = 0;

        do {

            System.out.print("Enter a number you want to print: ");

            number = scanner.nextInt();
            System.out.println("The number " + number + " is " +  (isPrime(number) ? "prime" : "not prime"));
            

            
            
        } while (number != 0);

      scanner.close();
        
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
