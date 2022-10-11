import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = -1;
        ArrayList<Integer> arr1 = new ArrayList<>();
        for (int i = 0; i < nums.length -2; i++) {
            for (int j = i + 1; j < nums.length -1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    arr1.add(nums[i] + nums[j] + nums[k]);
                }
            }
        }
        int cnt = 0;
        for (int i = 0; i < arr1.size(); i++) {
            for (int j = 2; j < arr1.get(i); j++) {
                if (arr1.get(i) % j == 0) {
                    cnt++;
                    break;
                }
            }
        }
        
        answer = arr1.size() - cnt;
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.

        return answer;
    }
}
