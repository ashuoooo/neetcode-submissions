class Solution {

    int[] dp;

    public int numDecodings(String s) {

        dp = new int[s.length()];
        Arrays.fill(dp, -1);

        return helper(0, s);
    }

    public int helper(int i, String s) {

        if(i == s.length()) {
            return 1;
        }

        if(s.charAt(i) == '0') {
            return 0;
        }

        if(dp[i] != -1) {
            return dp[i];
        }

        // Take one digit
        int ways = helper(i + 1, s);

        // Take two digits
        if(i + 1 < s.length()) {

            int twoDigit =
                (s.charAt(i) - '0') * 10
                + (s.charAt(i + 1) - '0');

            if(twoDigit >= 10 && twoDigit <= 26) {
                ways += helper(i + 2, s);
            }
        }

        dp[i] = ways;

        return dp[i];
    }
}