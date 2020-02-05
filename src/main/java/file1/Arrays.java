package file1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arrays {

    public void one() {
        System.out.print("N = ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];

        List<Integer> ch = new ArrayList<>();
        List<Integer> nch = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d]= ", i);
            a[i] = scan.nextInt();

            if (a[i] % 2 == 0) {
                ch.add(a[i]);
            }
            else {
                nch.add(a[i]);
            }
        }

        System.out.print("Чётные числа: ");
        for (int el : ch) {
            System.out.printf("%d ", el);
        }
        System.out.print("\nНечётные числа: ");
        for (int el : nch) {
            System.out.printf("%d ", el);
        }
    }

    public void two() {

        System.out.print("N = ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d]= ", i);
            a[i] = scan.nextInt();

            if (a[i] % 3 == 0 || a[i] % 9 == 0) {
                nums.add(a[i]);
            }
        }

        System.out.print("Числа, которые делятся на 3 или 9: ");
        for (int el : nums) {
            System.out.printf("%d ", el);
        }
    }

    public void three() {
        System.out.print("N = ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d]= ", i);
            a[i] = scan.nextInt();

            if (a[i] % 5 == 0 || a[i] % 10 == 0) {
                nums.add(a[i]);
            }
        }

        System.out.print("Числа, которые делятся на 5 или 10: ");
        for (int el : nums) {
            System.out.printf("%d ", el);
        }
    }

    public int nod(int x, int y) {
        while (x != y)
        {
            if (x > y)
                x = x - y;
            else
                y = y - x;
        }
        return x;
    }

    public int nodOfNumbers(int[] mas, int n, int i, int x) {
        if (i == n)
            return x;
        int nod = nod(x, mas[i]);
        i++;
        return nodOfNumbers(mas, n, i, nod);
    }

    public int nok(int x, int y){
        return x / nod(x, y) * y;
    }

    public int nokOfNumbers(int[] mas, int n, int i, int x) {
        if (i == n)
            return x;
        int nok = nok(x, mas[i]);
        i++;
        return nodOfNumbers(mas, n, i, nok);
    }

    public void four() {
        System.out.print("N = ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        System.out.print("Введите числа через пробел: ");
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }

        System.out.printf("НОД = %d\n", nodOfNumbers(a, n, 1, a[0]));
        System.out.printf("НОК = %d", nokOfNumbers(a, n, 1, a[0]));
    }

    public void five() {
        System.out.print("N = ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d]= ", i);
            a[i] = scan.nextInt();
        }

        System.out.print("Простые числа: ");
        for (int i = 0; i < n; i++) {
            int el = a[i];
            boolean fl = true;
            for (int j = 2; j <= el/2+1; j++) {
                if (el % j == 0) {
                    fl = false;
                    break;
                }
            }
            if(fl) {
                System.out.printf("%d ", el);
            }
        }
    }

    public void six() {

        System.out.print("N = ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];

        System.out.printf("Введите %d чисел: ", n);
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        System.out.print("Счастливые числа: ");
        for (int i = 0; i < n; i++) {

            int p = 0;
            int numCop = a[i];
            while (p < 7) {
                p++;
                int sum = 0;
                while (numCop != 0) {
                    sum += Math.pow(numCop % 10, 2);
                    numCop /= 10;
                }
                numCop  = sum;

                if (sum == 1){
                    System.out.print(a[i] + " ");
                    break;
                }
            }
        }
    }

    public void seven() {
        System.out.print("Число от 0 до 9: ");
        int n = new Scanner(System.in).nextInt();
        String[] strings = new String[]
                {"Ноль", "Один", "Два", "Три", "Четыре", "Пять", "Шесть", "Семь", "Восемь", "Девять"};
        int[] nums = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        if (n >= 0 && n <= 9) {
            for (int i = 0; i < n; i++) {
                if (nums[i] == n) {
                    System.out.print(strings[i]);
                    break;
                }
            }
        }
    }

}
