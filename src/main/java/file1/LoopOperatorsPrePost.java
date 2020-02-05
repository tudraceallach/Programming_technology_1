package file1;

import java.util.Scanner;

public class LoopOperatorsPrePost {

    public void one() {

        int n = 200;
        for (int i=1; i<=n; i++) {
            if (i%5 != 0 && i%3 == 0) {

                int iCop = i;
                int sum = 0;
                while (iCop != 0) {
                    sum += iCop % 10;
                    iCop /= 10;
                }
                if (sum%5 != 0 && sum%3 == 0){
                    System.out.print(i + " ");
                }

            }
        }
    }

    public void two() {
        System.out.print("Введите целое число: ");
        int n = new Scanner(System.in).nextInt();

        for (int i=1; i<n; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public void three() {

        System.out.print("Введите натуральное число: ");
        int n = new Scanner(System.in).nextInt();

        if (n > 0) {
            int check = 1;
            while (check < n) {
                check *= 2;
            }

            if (check == n) {
                System.out.print("Число является степенью двойки");
            }
            else {
                System.out.print("Число не является степенью двойки");
            }
        }
    }

    public void four() {
        System.out.print("Введите число: ");
        int n = new Scanner(System.in).nextInt();

        int a = 1;
        int b = 1;
        int c;
        System.out.printf("%d %d ", a,b);
        while ((c = a+b) < n) {
            a = b;
            b = c;
            System.out.printf("%d ", b);
        }
    }

}
