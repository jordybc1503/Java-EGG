import java.util.Scanner;

public class ComparitionsOperators {
    public static void main(String[] args){
        Scanner data = new Scanner(System.in); 
        System.out.println("Ingrese primer numero: ");
        float num1 = data.nextFloat();
        data.nextLine(); //Para absorver el enter
        System.out.println("Ingrese segundo numero: ");
        float num2 = data.nextFloat();
        
        System.out.println("El numero " + num1 + "es mayor que " + num2 + "?: " + (num1>num2));
        System.out.println( "El numero " + num1 + "es divisible por 2? :" + (num1%2 == 0));

        data.close();

    }
}
