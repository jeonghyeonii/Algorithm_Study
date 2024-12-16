package bronze3;

import java.util.Scanner;

public class boj2884 {
    public static void main(String[] args) {
        // 문제명: 알람 시계
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();

        if(m < 45){
            h--;
            m = (m - 45) + 60;

            if(h < 0){
                h = 23;
            }
            System.out.println(h + " " + m);
        } else {
            System.out.println(h + " " + (m - 45));
        }
    }
}
