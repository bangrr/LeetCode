class Solution {
    public int bitwiseComplement(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 0;
        } else {
            int k = 2;
            while (true) {
                if (n < k) {
                    return k-1-n;
                }
                k *= 2;
            }
        }
    }
}