class Solution {
    private String s;

    public String longestPalindrome(String s) {
        this.s = s;
        int start = 0, maxLen = 1;

        for (int i = 0; i < s.length(); i++) {
            int odd  = expand(i, i);      
            int even = expand(i, i + 1);   

            int best = Math.max(odd, even);

            if (best > maxLen) {
                maxLen = best;
                start = i - (best - 1) / 2;
            }
        }

        return s.substring(start, start + maxLen);
    }

    private int expand(int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1; 
    }
}