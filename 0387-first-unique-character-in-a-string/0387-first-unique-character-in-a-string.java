class Solution {
    public int firstUniqChar(String s) {
        int n = s.length();
        int idx = -1;
        
        outer:
        for (int i=0; i<n; i++) {
            idx = i;
            for (int j=0; j<n; j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    idx = -1;
                    break;
                }
            }
            if (idx == i) {
                break;
            }
        }
        return idx;
    }
}