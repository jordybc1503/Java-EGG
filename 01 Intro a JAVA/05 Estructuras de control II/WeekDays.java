import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) {
        Scanner weekDay = new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 7");
        int day = weekDay.nextInt();
        String weekDayString;
        weekDay.close();
        switch (day) {
            case 1:
                weekDayString = "Monday";
                break;
            case 2:
                weekDayString = "Tuesday";
                break;
            case 3:
                weekDayString = "Wednesday";
            case 4:
                weekDayString = "Thursday";
                break;
            case 5:
                weekDayString = "Friday";
                break;
            case 6:
                weekDayString = "Saturday";
                break;
            case 7:
                weekDayString = "Sunday";
                break;
            default:
                weekDayString = "inn't a day";
                break;
        }

        System.out.println("The day numer " + day + "in letters is " + weekDayString);

    }
}