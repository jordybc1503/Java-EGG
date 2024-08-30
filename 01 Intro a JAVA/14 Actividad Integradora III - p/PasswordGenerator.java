import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {

        String passwordString=""; // Inicializamos password;

        Scanner lenPassword = new Scanner(System.in);
        Random randon = new Random();

        // Verificadores de cantidad de veces que se repite el digito
        int numAmount = 0;
        int lowerAmount = 0;
        int upperAmount = 0;

        System.out.println("Ingrese longitud de contraseña: ");
        int len = lenPassword.nextInt();
        lenPassword.close();

        for (int i = 0; i < len; i++) {

            char letra = (char) randon.nextInt(127);

            

            while (numAmount == 0 && lowerAmount == 0 &&  upperAmount == 0) {

                if(Character.isDigit(letra)){
                    numAmount = 1;
                    break;
                }
    
                if(Character.isLowerCase(letra)){
                    lowerAmount = 1;
                    break;
                }
    
                if(Character.isUpperCase(letra)){
                    upperAmount = 1;
                    break;
                }

                letra = (char) randon.nextInt(127);
            }

            
            
            passwordString+=String.valueOf(letra);

        }

        System.out.println("Contraseña:" + passwordString);

    }
}