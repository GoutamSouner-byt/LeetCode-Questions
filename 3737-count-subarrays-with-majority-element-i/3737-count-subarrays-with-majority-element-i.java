public class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        int ans = 0;
        int prefixSum = 0;

        int[] freq = new int[2 * n + 1];
      
        freq[0 + n] = 1;

        for (int num : nums) {
            
            if (num == target) {
                prefixSum++;
            } else {
                prefixSum--;
            }

            for (int i = 0; i < prefixSum + n; i++) {
                ans += freq[i];
            }

            freq[prefixSum + n]++;
        }

        return ans;
    }
}