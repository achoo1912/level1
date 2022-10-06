import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr1.add(arr[i]);
            }
            if (i + 1 == arr.length - 1) { //arr의 끝 자리 숫자를 무조건 넣는 기능. 인덱스 계산 
                arr1.add(arr[i + 1]);
            }
        }
        int[] answer = new int[arr1.size()];
        for (int i = 0; i < arr1.size(); i++) {
            answer[i] = arr1.get(i);
        }
        return answer;
    }
}
