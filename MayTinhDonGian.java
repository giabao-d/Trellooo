
package baitap;

import java.util.Scanner;

public class MayTinhDonGian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap a: ");
        double a = sc.nextDouble();

        System.out.print("Nhap b: ");
        double b = sc.nextDouble();

        System.out.print("Chon phep tinh (+, -, *, /): ");
        char op = sc.next().charAt(0);

        double ketQua;

        switch (op) {
            case '+':
                ketQua = a + b;
                System.out.println("Ket qua: " + a + " + " + b + " = " + ketQua);
                break;
            case '-':
                ketQua = a - b;
                System.out.println("Ket qua: " + a + " - " + b + " = " + ketQua);
                break;
            case '*':
                ketQua = a * b;
                System.out.println("Ket qua: " + a + " * " + b + " = " + ketQua);
                break;
            case '/':
                if (b != 0) {
                    ketQua = a / b;
                    System.out.println("Ket qua: " + a + " / " + b + " = " + ketQua);
                } else {
                    System.out.println("Loi: Khong the chia cho 0");
                }
                break;
            default:
                System.out.println("Phep tinh khong hop le");
        }

        sc.close();
    }
}

