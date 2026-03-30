class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] leftp = new int[n];
        int[] rightp = new int[n];

        leftp[0] = 1;
        rightp[n - 1] = 1;

        for (int i = 1; i < n; i++) {
            leftp[i] = leftp[i - 1] * nums[i - 1];
        }

        for (int i = n - 2; i >= 0; i--) {
            rightp[i] = rightp[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < n; i++) {
            if (i == 0) nums[i] = rightp[i];
            else if (i == n - 1) nums[i] = leftp[i];
            else nums[i] = leftp[i] * rightp[i];
        }

        return nums;
    }
}