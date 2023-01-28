class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxGlobal = nums[0];
        int maxLocal = nums[0];

        for (int i=1; i<n; i++) {
            maxLocal = Math.max(nums[i], maxLocal + nums[i]);
            maxGlobal = Math.max(maxLocal, maxGlobal);
        }
        return maxGlobal;
    }
}