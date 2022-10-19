import java.util.*;
/*
날자 차이, 입력받은 요일은 인덱스로 표현,
날자 차이를 7로 나눈 몫 만큼 요일은 반복, 
날자 차리를 7로 나눈 나머지에 따라 요일이 1회 추가 될 가능성 있음.
날자 차이가 양수인 경우,
  만약 나머지가 날자의 인덱스 보다 작은 경우,
  추가 횟수 없음.
 날자 차이가 음수인 경우,
  날자 차이를 양수로 전환하여 나누기 때문에,
  나머지가 날자의 인덱스 보다 큰 경우,
  추가 횟수 없음.
*/
public class Main {
    public static int[] month = {31, 29, 31, 30, 31, 30, 31,31,30,31,30,31};
    public static int count(int a, int b) {
            int days = 0;
            for (int i = 0; i < a-1; i++) {
                days += month[i];
            }
            days += b;
            return days;
        }
    public static void main(String[] args) {
        // Your Program Goes Here
        String[] day = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String str = sc.next();

        
        int dif = count(m2, d2) - count(m1, d1); // 날자 차이 계산
        int c = -1;
        for (int i = 0; i < day.length; i++) { // 입력받은 요일을 요일 배열의 인덱스로 표현
            if (str.equals(day[i])) {
                c = i;
                break;
            }
        }
        if (dif < 0) {                    
            dif *= -1;
            int answer2 = dif / 7;
            int rt = 7 - (dif % 7);
            if (rt <= c) {
                answer2 += 1;
            }
            System.out.print(answer2);
            return;
        }
        int answer = dif / 7;
        if (dif % 7 >= c) {
            answer += 1;
        }
        System.out.print(answer);
    }
}
