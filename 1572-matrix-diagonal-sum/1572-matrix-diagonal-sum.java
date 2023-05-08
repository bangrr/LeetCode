class Solution {
    public int diagonalSum(int[][] mat) {
        int ans = 0, n = mat.length;
        for (int i=0; i<n; i++) {
            ans += (mat[i][i] + mat[i][n-1-i]);
        }
        if (n % 2 != 0) {
            ans -= mat[n/2][n/2];
        }
        return ans;
    }
}