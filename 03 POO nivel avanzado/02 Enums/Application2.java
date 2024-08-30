import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {
        ConvertidorColor convertidor = new ConvertidorColor();
        Scanner scanner = new Scanner(System.in);

        String[] valoresHexadecimal = new String[5];

        // Leer 5 valores hexadecimales desde la entrada
        System.out.println("Ingrese 5 valores hexadecimales:");
        for (int i = 0; i < valoresHexadecimal.length; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            valoresHexadecimal[i] = scanner.next();
        }

        // Verificar si los valores corresponden a colores primarios
        for (String valorHex : valoresHexadecimal) {
            Color color = convertidor.convertirHexadecimal(valorHex);
            if (color != null) {
                System.out.println(valorHex + " es el color primario " + color);
            } else {
                System.out.println(valorHex + " no es un color primario");
            }
        }

        scanner.close();
    }
}
