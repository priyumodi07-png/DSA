import java.util.*;

class Solution {
    public boolean stoneGame(int[] piles) {
        int n = piles.length;
        int[] dp = Arrays.copyOf(piles, n); // base case: dp[i] = piles[i]

        // Fill DP table bottom-up
        for (int i = n - 2; i >= 0; i--) {
            for (int j = i + 1; j < n; j++) {
                dp[j] = Math.max(piles[i] - dp[j], piles[j] - dp[j - 1]);
            }
        }

        return dp[n - 1] > 0; // if score difference > 0, first player wins
    }
}
