import java.util.InputMismatchException;
import java.util.Scanner;

public class RestWithExceptionHandler {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int result = 0;
        try {
            System.out.println("Ingrese el primer numero");
            int num1 = datos.nextInt();
            System.out.println("Ingrese el segundo numero");
            int num2 = datos.nextInt();
            result = num1 - num2;
            
                        
        } catch (InputMismatchException e) {
            System.out.println("Error en el numero ingresado:" + e );
        } catch (ArithmeticException e){
            System.out.println("Error en la operacion aritmetica" + e);
        }

        System.out.println("El resultado es "+ result);

        datos.close();
    }
    
}
