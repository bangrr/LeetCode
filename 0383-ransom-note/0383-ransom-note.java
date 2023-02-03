class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] ranArr = new int[26];
        int[] magArr = new int[26];
        for (int i=0; i<ransomNote.length(); i++) {
            ranArr[ransomNote.charAt(i)-97]++;
        }
        for (int i=0; i<magazine.length(); i++) {
            magArr[magazine.charAt(i)-97]++;
        }
        for (int i=0; i<26; i++) {
            if (ranArr[i] > magArr[i]) {
                return false;
            }
        }
        return true;
    }
}