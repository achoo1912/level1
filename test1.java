import java.util.*;
class We {
    String date;
    String day;
    String status;
    public We(String date, String day, String status) {
        this.date = date;
        this.day = day;
        this.status = status;
    }

}
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        We[] arr1 = new We[num];
        for (int i = 0; i < num; i++) {
            String date = sc.next();
            String day = sc.next();
            String status = sc.next();
            arr1[i] = new We(date, day, status);
        }
        Integer tmp = 100000000; // 굳이 숫자로 바꾸지 않고, date 자체로 비교.
        String s1 = "";
        int idx = -1;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i].status.equals("Rain")) {
                s1 = arr1[i].date.replace("-", "");
                Integer a = Integer.parseInt(s1);
                if (tmp > a) {
                    tmp = a;
                    idx = i;
                }
            }
        }
        System.out.print(arr1[idx].date + " " + arr1[idx].day + " " + arr1[idx].status);
    }
}
