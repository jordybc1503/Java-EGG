import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class GradeStatistics {
    public static void main(String[] args) {
        Random random = new Random();

        Scanner numberOfGrades = new Scanner(System.in);

        System.out.print("Enter the number of grades: ");

        int num = numberOfGrades.nextInt();

        String[] grades = new String[num];

        for (int i = 0; i < num; i++) {
            int grade = random.nextInt(11);
            System.out.println("Grade " + (i + 1) + ": " + grade);
            grades[i] = String.valueOf(grade);

        }

        // Lists for grades
        List<Double> failed = new ArrayList<>();
        List<Double> passed = new ArrayList<>();
        List<Double> excelent = new ArrayList<>();

        // Convert String a Double and rate the grades
        double sumOriginal = 0.0;
        double failedSum = 0.0;
        double passedSum = 0.0;
        double excelentSum = 0.0;

        for (String grade : grades) {
            double numericGrade = Double.parseDouble(grade);
            sumOriginal += numericGrade;
            if (numericGrade < 4.0) {
                failed.add(numericGrade);
                failedSum += numericGrade;
            } else if (numericGrade >= 4.0 && numericGrade < 10.0) {
                passed.add(numericGrade);
                passedSum += numericGrade;
            } else if (numericGrade >= 10.0) {
                excelent.add(numericGrade);
                excelentSum += numericGrade;
            }
        }

        // Calculate the average

        double average = sumOriginal / grades.length;
        double failedAverage = failedSum / failed.size();
        double passedAverage = passedSum / passed.size();
        double excelentAverage = excelentSum / excelent.size();

        // Print the results

        System.out.println("The average is: " + average);
        System.out.println("The average of failed grades is: " + failedAverage);
        System.out.println("The average of passed grades is: " + passedAverage);
        System.out.println("The average of excelent grades is: " + excelentAverage);

    }

}
