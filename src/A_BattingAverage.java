package src;
import java.util.*;

public class A_BattingAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        scanner.close();
        double ans = 0;
        
        ans = B/A;

        System.out.println(String.format("%.3f", ans));
    }
}

