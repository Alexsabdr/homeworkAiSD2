package cw0805;
import java.util.Scanner;

public class z2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n <= 1) {
            System.out.println(n);
            return;
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n - 1; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 10;
        }
        System.out.println("Последняя цифра: " + dp[n - 1]);
    }
}

