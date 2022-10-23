package src;
import java.util.*;

public class C_Ameba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        int N = scanner.nextInt();
        int P[] = new int[2*N+2];
        for (int i = 1; i < N+1; i++) {
            int p = scanner.nextInt();
            P[2*i] = p;
            P[2*i+1] = p;
        }
        scanner.close();
        int ans[] = new int[2*N+2];
        ans[1] = 0;
        System.out.println(0);
        for (int i = 2; i < 2*N+2; i++) {
            ans[i] = ans[P[i]]+1;
            System.out.println(ans[i]);
        }
    }
}

