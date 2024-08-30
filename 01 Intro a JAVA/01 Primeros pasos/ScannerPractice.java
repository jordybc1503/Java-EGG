import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args){
        // Create class scanner
        Scanner datos = new Scanner(System.in);
        // Get name's users
        System.out.println("Ingrese su nombre:");
        String name = datos.nextLine();
        // Get age's user
        System.out.println("Ingrese su edad");
        int age = datos.nextInt();
        //Print user information
        System.out.println( "Su nombre es " + name + "tiene " + age);
        // Close scanner to avoid memory outage
        datos.close();
    }


}