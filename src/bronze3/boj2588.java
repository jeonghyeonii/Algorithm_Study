package bronze3;

import java.util.Scanner;

public class boj2588 {
    // 문제명: 곱셈
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result1 = a*(b%10);
        int result2 = a*((b%100)/10);
        int result3 = a*(b/100);
        int result4 = a*b;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

    }
}
