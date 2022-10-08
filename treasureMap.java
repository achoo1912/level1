import java.util.*;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];



        for (int i = 0; i < arr1.length; i++) {
            int l = n - 1;
            int l2 = n - 1;
            int[] line = new int[n];
            int[] line2 = new int[n];
            String[] pre = new String[n];
            String same = "";
            int r = 0;
            int r2 = 0;

            while(arr1[i] >0) {
            r = arr1[i] % 2;
            arr1[i] /= 2;
            line[l--] = r;
        }
            while(arr2[i] >0) {
                r2 = arr2[i] % 2;
                arr2[i] /= 2;
                line2[l2--] = r2;
            }
            for (int j = 0; j < line.length; j++) {
                if (line[j] == 1 || line2[j] == 1) {
                    pre[j] = "#";
                } else if (line[j] == 0 && line2[j] == 0) {
                    pre[j] = " ";
                }
                same += pre[j];
            }       
            answer[i] = same;
        }

        return answer;
    }
}
