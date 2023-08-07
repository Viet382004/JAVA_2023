package Java_he;

import java.util.Scanner;

public class Bai4_Buoi2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhap vao b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhap vao c: ");
        double c = scanner.nextDouble();

        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double sqrtDelta = Math.sqrt(delta);
            double x1 = (-b + sqrtDelta) / (2 * a);
            double x2 = (-b - sqrtDelta) / (2 * a);
            double X1 = Math.sqrt(x1);
            double X2 = Math.sqrt(x2);

            System.out.println("Phuong trinh co 4 nghiem phan biet:");
            System.out.println("x1 = " + X1);
            System.out.println("x2 = " + (-X1));
            System.out.println("x3 = " + X2);
            System.out.println("x4 = " + (-X2));
        } else if (delta == 0) {
            double x1 = -b / (2 * a);
            double X1 = Math.sqrt(x1);

            System.out.println("Phuong trinh co nghiem :");
            System.out.println("x1 = " + X1);
            System.out.println("x2 = " + (-X1));
        } else {

            System.out.println("Phuong trinh vo nghiem.");

        }
    }
}
