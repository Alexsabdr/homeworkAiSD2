package cw1505;
    public class cw1505 {
        public static long countPaths(int m, int n) {
            long[][] dp = new long[m][n];

            for (int i = 0; i < m; i++) dp[i][0] = 1;
            for (int j = 0; j < n; j++) dp[0][j] = 1;

            for (int i = 1; i < m; i++) {
                for (int j = 1; j < n; j++) {
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
            return dp[m-1][n-1];
        }

        public static int minPathSum(int[][] grid) {
            int m = grid.length;
            int n = grid[0].length;
            int[][] dp = new int[m][n];

            dp[0][0] = grid[0][0];

            for (int j = 1; j < n; j++) {
                dp[0][j] = dp[0][j-1] + grid[0][j];
            }

            for (int i = 1; i < m; i++) {
                dp[i][0] = dp[i-1][0] + grid[i][0];
            }

            for (int i = 1; i < m; i++) {
                for (int j = 1; j < n; j++) {
                    dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + grid[i][j];
                }
            }
            return dp[m-1][n-1];
        }

        public static void main(String[] args) {
            int[][] grid = {
                    {1, 3, 1},
                    {1, 5, 1},
                    {4, 2, 1}
            };

            int m = grid.length;
            int n = grid[0].length;

            System.out.println("Количество всех путей: " + countPaths(m, n));
            System.out.println("Минимальная стоимость пути: " + minPathSum(grid));
        }
    }



