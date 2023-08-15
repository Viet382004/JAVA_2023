package BTVN;

import java.util.Scanner;

public class Bai4_Buoi4 {
    public static boolean doiXung(String Ak47) {
        int left = 0;
        int right = Ak47.length() - 1;

        while (left < right) {
            if (Ak47.charAt(left) != Ak47.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap chuoi muon kiem tra ");
        String input = sc.nextLine();

        if (doiXung(input)) {
            System.out.println("Chuoi doi xung");
        } else {
            System.out.println("Chuoi khong doi xung");
        }

        sc.close();
    }


}