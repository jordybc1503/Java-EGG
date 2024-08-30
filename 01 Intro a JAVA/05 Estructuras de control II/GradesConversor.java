import java.util.Scanner;

public class GradesConversor {
    public static void main(String[] args) {
        Scanner gradeInput = new Scanner(System.in);
        System.out.println("\nIngrese su nota (del 1 al 5): ");
        int grade = gradeInput.nextInt();
        gradeInput.close();
        String gradeLetters;
        switch (grade) {
            case 1:
                gradeLetters = "Muy deficiente";
                break;
            case 2:
                gradeLetters = "Deficiente";
                break;

            case 3:
                gradeLetters = "Suficiente";
                break;

            case 4:
                gradeLetters = "Notable";
                break;
            case 5:
                gradeLetters = "Sobresaliente";
                break;

            default:
            gradeLetters = "No es una nota correcta";
                break;
        }

        System.out.println(grade+":"+gradeLetters);
    }
}
