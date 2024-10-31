public class AplicationDos {
    public static void main(String[] args) {
        // Prueba del constructor que inicializa marca, modelo y año
        Auto auto1 = new Auto("Toyota", "Corolla", 2020);
        System.out.println("Datos del primer auto:");
        auto1.imprimirDatos();

        // Prueba del constructor que inicializa marca y modelo
        Auto auto2 = new Auto("Honda", "Civic");
        System.out.println("\nDatos del segundo auto:");
        auto2.imprimirDatos();

        // Prueba del constructor que inicializa solamente la marca
        Auto auto3 = new Auto("Ford");
        System.out.println("\nDatos del tercer auto:");
        auto3.imprimirDatos();

        // Prueba del constructor sin parámetros
        Auto auto4 = new Auto();
        System.out.println("\nDatos del cuarto auto:");
        auto4.imprimirDatos();
    }
}
