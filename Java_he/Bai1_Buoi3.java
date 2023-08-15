package BTVN;

import java.util.Scanner;

public class Bai1_Buoi3 {
    public static void dem(int[] a, int n ){
        for(int i = 0; i < n ; i++){
            for(int j = i +1; j<n ; j++){
                if(a[i]>a[j]){
                    int tmp = a[j];
                    a[j]=a[i];
                    a[i]=tmp;
                }
            }
        }
        for(int i = 0; i < n ; i ++){
            int cmd = 1;
            while (a[i]==a[i+1]){
                i++;
                cmd++;
            }
            System.out.println("So " + a[i] + " xuat hien " + cmd + " lan");
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so phan tu mang n = ");
        int n = sc.nextInt();
        int[] a = new int[n + 1];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        dem(a,n);

    }
    }

