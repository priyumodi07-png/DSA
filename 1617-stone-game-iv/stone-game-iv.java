import java.util.*;

class Solution {
    public boolean winnerSquareGame(int n) {
        boolean[] dp = new boolean[n + 1];
        
        // dp[i] = true means the current player can win with i stones
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k * k <= i; k++) {
                if (!dp[i - k * k]) { 
                    dp[i] = true; 
                    break; // stop early once a winning move is found
                }
            }
        }
        return dp[n];
    }
}
