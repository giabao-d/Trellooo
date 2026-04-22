
package baitap;

import java.util.Scanner;

public class GiaiPTBacNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap a: ");
        double a = sc.nextDouble();

        System.out.print("Nhap b: ");
        double b = sc.nextDouble();

        if (a != 0) {
            double x = -b / a;
            System.out.println("Phuong trinh " + a + "x + " + b + " = 0 có nghiem la: x = " + x);
        } else {
            if (b != 0) {
                System.out.println("Phuong trinh " + a + "x + " + b + " = 0 vo nghiem");
            } else {
                System.out.println("Phuong trinh " + a + "x + " + b + " = 0 vo so nghiem");
            }
        }

        sc.close();
    }
}
