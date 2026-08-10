import java.util.*;

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        
        for (int i = 1; i < nums.length; i++) {
            // If there is a gap between nums[i-1] and nums[i]
            for (int val = nums[i-1] + 1; val < nums[i]; val++) {
                ans.add(val);
            }
        }
        return ans;
    }
}
