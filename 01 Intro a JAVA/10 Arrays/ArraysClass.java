import java.util.Scanner;

public class ArraysClass {
   
    public static void main(String[] args) {

        // Main program
        Scanner scanner = new Scanner(System.in);

        System.out.println("------------");
        System.out.println("Actividad: Sumando elementos");        
        // Create an array with three integer elements
        int[] intArr = {1, 2, 3};
        // Sum the elements manually and print the result
        int sum = intArr[0] + intArr[1] + intArr[2];
        System.out.println("La suma de elementos del array es " + sum);

        System.out.println("------------");
        System.out.println("Enter 4 digits");        
        // Create an array with four integer elements entered by the user
        int val1 = scanner.nextInt();
        int val2 = scanner.nextInt();
        int val3 = scanner.nextInt();
        int val4 = scanner.nextInt();

        int[] intArray2 = {val1, val2, val3, val4};
        // Sum the elements manually and calculate the average
        float average = (intArray2[0] + intArray2[1] + intArray2[2] + intArray2[3]) / intArray2.length;
        System.out.println("The average is " + average);

        scanner.close();
    }
}
