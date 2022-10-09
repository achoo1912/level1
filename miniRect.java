class Solution {
    public int solution(int[][] sizes) {
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] < sizes[i][1]) {
                int tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
        }
        
        int max1 = -1;
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] > max1) {
                max1 = sizes[i][0];
            }
        }
        
        int max2 = -1;
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][1] > max2) {
                max2 = sizes[i][1];
            }
        }
        
        return max1 * max2;
    }
}
