// Clase principal con método main
public class Aplication {
    public static void main(String[] args) {
        // Crear el primer objeto de tipo Persona
        Persona persona1 = new Persona("Juan", 25);
        // Imprimir los datos del primer objeto
        System.out.println("Datos de la primera persona:");
        persona1.imprimirDatos();

        // Crear el segundo objeto de tipo Persona
        Persona persona2 = new Persona("Ana", 30);
        // Imprimir los datos del segundo objeto
        System.out.println("\nDatos de la segunda persona:");
        persona2.imprimirDatos();
    }
}
