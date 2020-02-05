package file1;

import java.util.Scanner;

public class LoopOperatorParam {

    public void one() {

        System.out.print("Введите 2 числа через пробел: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        if (a < b) {
            int n = 0;
            for (int i = a; i <= b; i++) {
                System.out.printf("%d ", i);
                n++;
            }
            System.out.printf("\nN = %d", n);
        }
    }

    public void two() {
        System.out.print("Введите 2 числа через пробел: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        if (a < b) {
            int n = 0;
            for (int i = b-1; i>a; i--) {
                System.out.printf("%d ", i);
                n++;
            }
            System.out.printf("\nN = %d", n);
        }
    }

    public void three() {
        System.out.print("Введите вещественное и целое число: ");
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        int n = scan.nextInt();

        if (n > 0) {
            double s = a;
            a = 1.0;
            for (int i = 0; i < n; i++) {
                a *= s;
            }

            System.out.printf("a^N = %.2f", a);
        }
    }

    public void four() {
        System.out.print("Введите вещественное и целое число: ");
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        int n = scan.nextInt();

        if (n > 0) {
            double s = a;
            a = 1.0;
            for (int i = 0; i < n; i++) {
                a *= s;
                double aD = Math.floor(a);
                double aM = a - aD;

                if (a > 0.0 && aM == 0.0 && a < n) {
                    System.out.printf("a^N = %.2f\n", a);
                }
            }

        }
    }

}
