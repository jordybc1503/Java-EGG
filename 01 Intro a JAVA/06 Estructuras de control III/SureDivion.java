import java.util.Scanner;

public class SureDivion {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        int result = 0;

        try {
            System.out.println("Ingrese un numero entero: ");
            int num1 = data.nextInt();
            System.out.println("Ingrese su segundo numero entero");
            int num2 = data.nextInt();
            result = num1/num2;
        }
        catch(ArithmeticException e){
            System.out.println("Se produjo un error arimetico:" + e.getMessage());

        } catch (Exception e) {
            System.out.println("Se produjo un error");
        }

        System.out.println("El resultado es " + result);

    }
}