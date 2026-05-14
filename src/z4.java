package cw0805;


public class z4 {
    public static void main(String[] args) {
        int n = 3;
        int[][] f = {
                {1, 2, 3},
                {4, 8, 4},
                {8, 6, 7}
        };
        int[][] a = new int[n][n];
        a[0][0] = f[0][0];

        for (int i = 1; i < n; i++) {
            a[i][0] = a[i - 1][0] + f[i][0];
            a[0][i] = a[0][i - 1] + f[0][i];
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                int min = (a[i - 1][j] < a[i][j - 1]) ? a[i - 1][j] : a[i][j - 1];
                a[i][j] = min + f[i][j];
            }
        }
        System.out.println(a[n - 1][n - 1]);
    }
}
