package boj;

import java.util.Scanner;

public class bronze1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] a = new int[num];
        for(int i = 0; i < a.length; i++){
            a[i] = scanner.nextByte();
        }
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}
