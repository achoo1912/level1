import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Set<Integer> set1 = new TreeSet<>(); // eliminate duplicate
        for (int i = 0; i < nums.length; i++) {
            set1.add(nums[i]);
        }
        if (set1.size() < nums.length / 2) {
            answer = set1.size();
        } else {
            answer = nums.length / 2;
        }
        
        return answer;
    }
}
