import java.util.List;
import java.util.ArrayList;

public class Fibonacci {
    public static void main(String[] args) {
        int i = 2;


        List<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(0);
        fibonacci.add(1);
        System.out.println("Position " + i  + ": " + fibonacci.get(0));
        System.out.println("Position " + i  + ": " + fibonacci.get(1));

        while (i <= 8) {
            fibonacci.add(fibonacci.get(i-1)+fibonacci.get(i-2));
            System.out.println("Position " + i  + ": " + fibonacci.get(i));
            i++;
        }
        
      
    }
    
}
