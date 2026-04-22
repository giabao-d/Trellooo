package cau7;

import java.util.Scanner;
public class cau7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.print("Nhap a: ");
        a = sc.nextInt();
        System.out.print("Nhap b: ");
        b = sc.nextInt();
        System.out.print("Nhap c: ");
        c = sc.nextInt();

        int temp;

        if (a > b) {
            temp = a; a = b; b = temp;
        }
        if (a > c) {
            temp = a; a = c; c = temp;
        }
        if (b > c) {
            temp = b; b = c; c = temp;
        }

        System.out.println(a + ", " + b + ", " + c);
    }
}
