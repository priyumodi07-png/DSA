class Solution {
    private int[][] dp;

    private int f(int n, int turn) {
        if (n == 0) return turn == 1 ? 0 : 1;
        if (dp[n][turn] != -1) return dp[n][turn];

        if (turn == 1) {
            int ans = 0;
            for (int i = 1; i * i <= n; i++) {
                ans |= f(n - i * i, 0);
                if (ans == 1) break; // Optimization: stop early if a winning path is found
            }
            dp[n][turn] = ans;
        } else {
            int ans = 1;
            for (int i = 1; i * i <= n; i++) {
                ans &= f(n - i * i, 1);
                if (ans == 0) break; // Optimization: stop early if a losing path is forced
            }
            dp[n][turn] = ans;
        }
        return dp[n][turn];
    }

    public boolean winnerSquareGame(int n) {
        dp = new int[n + 1][2];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return f(n, 1) == 1;
    }
}