package Java_he;

import java.util.Scanner;

public class Bai5_Buoi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so qua chanh a : ");
        int a = sc.nextInt();
        System.out.print("Nhap so qua tao b : ");
        int b = sc.nextInt();
        System.out.print("Nhap so qua le c : ");
        int c = sc.nextInt();

        int A = a;
        int B = b / 2;
        int C = c / 4;

        int min = Math.min(A, Math.min(B , C));

        int Minfruit = min + min * 2 + min * 4;

        System.out.println("Tong so qua toi da : " + Minfruit + " (Chanh :" + min + ", Tao :" + min * 2 + ", Le :" + min * 4 + ")");
    }
}

