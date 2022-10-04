class Solution {
    public int solution(int num) {
        int answer = 0;
        long numCopy = num;
        while (numCopy != 1) {
            if (numCopy % 2 == 0) {
                numCopy /= 2;
                answer++;
            } else {
                numCopy = numCopy * 3 + 1;
                answer++;
            }
            
            if (answer >= 500) {
            return -1;
        }
        }
        if (num == 1) {
            return 0;
        }
        if (numCopy == 1) {
            return answer;
        }
        
        
        return answer;
    }
}
