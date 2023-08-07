package Java_he;

import java.util.Scanner;

public class Bai2_Buoi2 {
    public static long tinhgiaithua(int n) {
        long  giaithua = 1;
        for (int i = 1; i <= n; i++) {
            giaithua *= i;
        }
        return giaithua;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao mot so nguyen duong n : ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Khong the thuc hien !");

        }

        double sum1 = 0;
        for (int i = 1; i <= n; i++) {
            sum1 += 1.0 / i;
        }
        System.out.println("S= " + sum1);


        int sum2 = 0;
        for (int i = 1; i <=n; i++) {
            sum2 += tinhgiaithua(i);
        }
        System.out.println("P= " + sum2);
    }
}

