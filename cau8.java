package cau7;

import java.util.Scanner;

public class cau8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Nhap a: ");
        n = sc.nextInt();

        if (n < 2) {
            System.out.println(n + " khong phai la so nguyen to");
        } else {
            boolean laSoNguyenTo = true;

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    laSoNguyenTo = false;
                    break;
                }
            }

            if (laSoNguyenTo) {
                System.out.println(n + " la so nguyen to");
            } else {
                System.out.println(n + " khong phai la so nguyen to");
            }
        }
    }
}
