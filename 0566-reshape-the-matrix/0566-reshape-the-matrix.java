class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] pat = new int[r][c];
        int[] oat = new int[r*c];
        int x = mat.length;
        int y = mat[0].length;
        
        if (x * y == r * c) {
            for (int i=0; i<x; i++) {
                for (int j=0; j<y; j++) {
                    oat[i*y + j] = mat[i][j];
                }
            }
            for (int i=0; i<r; i++) {
                for (int j=0; j<c; j++) {
                    pat[i][j] = oat[i*c + j];
                }
            }
        } else {
            return mat;
        }
        return pat;
    }
}