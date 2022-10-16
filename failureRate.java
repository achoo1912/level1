import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        double[] test = new double[N];
        for (int i = 0; i < N; i++) {
            int cnt1 = 0;
            int cnt2 = 0;
            for (int j = 0; j < stages.length; j++) {
                if (stages[j] >= i + 1) {
                    cnt1++;
                }
                if (stages[j] == i + 1) {
                    cnt2++;
                }
            }
            if(cnt1 == 0) {
                test[i] = 0;
            } else {
                test[i] = (double)cnt2/cnt1;
            }

        }
        double test2[] = test.clone();
        double test3[] = new double[test.length];
        Arrays.sort(test);
        int a = test.length -1;
        for (int i = 0; i < test3.length; i++) {
            test3[i] = test[a--];
            System.out.print(test3[i] + " ");
        }

        int[] answer = new int[N];
        for (int i = 0; i < test3.length; i++) {
            for (int j = 0; j < test2.length; j++) {
                if (test3[i] == test2[j]) {
                    answer[i] = j + 1;
                    test2[j] = 2;
                    break;
                }
            }
        }


        return answer;
    }
}
