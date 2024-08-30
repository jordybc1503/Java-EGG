import java.util.Random;

public class Application {

    public static void main(String[] args) {
        // Crear un arreglo de 10 días de la semana generados al azar
        DiaSemana[] dias = new DiaSemana[10];
        Random random = new Random();

        for (int i = 0; i < dias.length; i++) {
            dias[i] = DiaSemana.values()[random.nextInt(DiaSemana.values().length)];
        }

        // Imprimir si cada día es laboral o no
        for (DiaSemana dia : dias) {
            System.out.println(imprimirDiaLaboral(dia));
        }
    }

    public static String imprimirDiaLaboral(DiaSemana dia) {
        if (dia.esDiaLaboral()) {
            return dia + ": Día laboral";
        } else {
            return dia + ": No es día laboral";
        }
    }
}
