import java.util.Scanner;

public class MenuInterativo  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangulo rectangulo = null;
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Crear un nuevo rectángulo");
            System.out.println("2. Calcular y mostrar el área del rectángulo");
            System.out.println("3. Calcular y mostrar el perímetro del rectángulo");
            System.out.println("4. Mostrar el número total de rectángulos creados");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el ancho del rectángulo: ");
                    double ancho = scanner.nextDouble();
                    System.out.print("Ingresa el alto del rectángulo: ");
                    double alto = scanner.nextDouble();
                    rectangulo = new Rectangulo(ancho, alto);
                    System.out.println("Rectángulo creado con éxito.");
                    break;

                case 2:
                    if (rectangulo != null) {
                        rectangulo.imprimirArea();
                    } else {
                        System.out.println("Primero debes crear un rectángulo.");
                    }
                    break;

                case 3:
                    if (rectangulo != null) {
                        rectangulo.imprimirPerimetro();
                    } else {
                        System.out.println("Primero debes crear un rectángulo.");
                    }
                    break;

                case 4:
                    System.out.println("Número total de rectángulos creados: " + Rectangulo.obtenerContadorRectangulos());
                    break;

                case 5:
                    salir = true;
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida. Por favor, selecciona una opción del menú.");
                    break;
            }
        }
        scanner.close();
    }
}
