package file1;

import java.util.Scanner;

public class ConditionalStatements {

    public void one() {
        Scanner scan = new Scanner(System.in);

        System.out.print("1 число: ");
        Double num1 = scan.nextDouble();

        System.out.print("2 число: ");
        Double num2 = scan.nextDouble();

        Double sumKv = num1*num1 + num2*num2;
        Double kvSum = num1*num1 + 2.0*num1*num2 + num2*num2;

        System.out.printf("Сумма квадратов = %.2f\n", sumKv);
        System.out.printf("Квадрат суммы = %.2f\n", kvSum);


        if (sumKv >= kvSum) {
            System.out.print("Сумма квадратов больше");
        }
        else {
            System.out.print("Квадрат суммы больше");
        }

    }

    public void two() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Зарплата: ");
        int salary = scan.nextInt();

        System.out.print("Стаж: ");
        int experience = scan.nextInt();

        int premium = 0;
        if (experience >= 2 && experience < 5) {
            premium = salary * 2 / 100;
        }
        else if (experience >= 5 && experience < 10) {
            premium = salary * 5 / 100;
        }

        System.out.printf("Надбавка = %d\n", premium);
        System.out.printf("Итого: %d", salary+premium);

    }

    public void three() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Координаты точки A через пробел: ");
        int xA = scan.nextInt();
        int yA = scan.nextInt();
        System.out.print("Координаты точки B через пробел: ");
        int xB = scan.nextInt();
        int yB = scan.nextInt();

        double dA = Math.sqrt(xA*xA + yA*yA);
        double dB = Math.sqrt(xB*xB + yB*yB);

        if (dA > dB) {
            System.out.print("Точка A дальше от начала координат");
        }
        else if (dB > dA) {
            System.out.print("Точка B дальше от начала координат");
        }
        else {
            System.out.print("Точки равноудалены от начала координат");
        }

    }

    public void four(){

        Scanner scan = new Scanner(System.in);
        System.out.print("сторона a: ");
        int a = scan.nextInt();

        System.out.print("сторона b: ");
        int b = scan.nextInt();

        System.out.print("сторона c: ");
        int c = scan.nextInt();

        int maxi = Math.max(Math.max(a,b), c);

        int A, B;
        if (a == maxi){
            A = b;
            B = c;
        }
        else if(b == maxi) {
            A = a;
            B = c;
        }
        else {
            A = a;
            B = b;
        }

        if (A*A + B*B == maxi*maxi) {
            System.out.print("Треугольник является прямоугольным.");
        }
        else {
            System.out.print("Треугольник не является прямоугольным.");
        }

    }

    public void five() {
        Scanner scan = new Scanner(System.in);
        System.out.print("3 числа через пробел: ");
        double[] a = new double[3];

        for (int i = 0; i < 3; i++) {
            a[i] = scan.nextDouble();
        }

        for (int i = 0; i < 3; i++) {
            if (a[i] > 0) {
                a[i] *= a[i];
            }
            System.out.printf("%.1f ", a[i]);
        }
    }

    public void six() {

        System.out.print("Число от 1 до 12: ");
        int num = new Scanner(System.in).nextInt();
        String s = "";
        if(num == 12 || num == 1 || num == 2) {
            s = "Зима";
        }
        else if(num >= 3 && num <=5) {
            s = "Весна";
        }
        else if(num >= 6 && num <=8) {
            s = "Лето";
        }
        else if(num >= 9 && num <=11) {
            s = "Осень";
        }
        else {
            System.out.print("Неправильное число!");
        }

        if (!s.equals("")) {
            System.out.printf("Время года: %s", s);
        }
    }

}