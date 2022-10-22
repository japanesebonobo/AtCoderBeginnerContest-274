package src;
import java.util.*;

public class B_LineSensor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        int H = scanner.nextInt();
        int W = scanner.nextInt();

        char[][] C = new char[H][W];
        for (int i = 0; i < H; i++) {
            String inputList = scanner.next();
            char charList [] = inputList.toCharArray();
            for (int j = 0; j < W; j++) {
                C[i][j] = charList[j];
            }
        }
        scanner.close();
        int[] ans = new int[W];

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if(C[i][j] == '#') {
                    ans[j] += 1;
                }
            }
        }

        for (int i = 0; i < W; i++) {
            System.out.println(ans[i]);
        }
    }
}

