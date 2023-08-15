package BTVN;

import java.util.Scanner;

public class Bai2_Buoi3 {
    public static void themPhanTu(int[] arr, int n, int a) {
        for (int i = 0; i < n + 1; i++) {
            if (i == 1) {
                System.out.print(a + " ");
            }
            if ( i< n){
                System.out.print(arr[i]+ " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu của mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Nhap gia tri can them: ");
        int a = sc.nextInt();
        themPhanTu(arr,n,a);
    }
}