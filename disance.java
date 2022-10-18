//codetree get distance bewtween zero and x, y and sort 
import java.util.*;
class dis implements Comparable<dis> {
    int xi = 0;
    int yi = 0;
    int x, y;
    int num;
    int ds; // 여기서 초기화를 하는게 아니라 생성자에서 초기화 해줘야 쓸 수 있음.
    public dis (int x, int y, int num) {
        this.x = x;
        this.y = y;
        this.num = num;
        this.ds = (int)Math.abs(this.xi - this.x) + (int)Math.abs(this.yi - this.y);
    }
    @Override
    public int compareTo(dis d) {
        return this.ds - d.ds;
    }
}
public class Main {
    public static void main(String[] args) {
        // Your Program Goes Here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        dis[] arr1 = new dis[num];
        for (int i = 0; i < num; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int nu = i + 1;
            arr1[i] = new dis(x, y, nu);
        }
        Arrays.sort(arr1);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i].num);
        }
    }
}
