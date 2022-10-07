class Solution {
    public String solution(String s) {
        String answer = "";
        int cnt = 0;
        int step = 'a' - 'A';
        char[] arr1 = s.toCharArray();
        for (char item : arr1) {
            if((int)item == 32) {
                cnt = 0;
            } else {
                cnt++;
            }
            if (cnt % 2 == 0 && item >= 'A' && item <= 'Z') {
                item += step;
            } 
            if (cnt % 2 != 0 && item >= 'a' && item <= 'z') {
                item -= step;
            }
            answer += item;
        }
        return answer;
    }
}
