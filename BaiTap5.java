package thuchanhnhom;
import java.util.Scanner;
public class BaiTap5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap a: ");
        int a = sc.nextInt();

        System.out.print("Nhap b: ");
        int b = sc.nextInt();

        System.out.print("Nhap c (Enter de bo qua): ");
        sc.nextLine();
        String inputC = sc.nextLine().trim();

        int max;
        String danhSach;

        if (inputC.isEmpty()) {
            max = (a >= b) ? a : b;
            danhSach = a + ", " + b;
        } else {
            int c = Integer.parseInt(inputC);
            max = a;
            if (b > max) max = b;
            if (c > max) max = c;
            danhSach = a + ", " + b + ", " + c;
        }

        System.out.println("So lon nhat cua cac so " + danhSach + " la " + max);

        sc.close();
    }
}
