import java.util.*;
class Solution {
    public Set solution(int[] numbers) {
        TreeSet<Integer> arr1 = new TreeSet<>(); // 중복제거 + 정렬 (오름차순 기본) 
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i == j) {
                    continue;
                } else {
                    arr1.add(numbers[i] + numbers[j]);
                }
            }
        }
        
        
        
        return arr1;
    }
}
