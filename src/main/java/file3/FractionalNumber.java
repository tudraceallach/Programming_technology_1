package file3;

public class FractionalNumber {
    private int numerator; // числ
    private int denominator; // знам

    public FractionalNumber() {
        numerator = 1;
        denominator = 2;
    }

    public FractionalNumber(int numerator, int denominator) {
        if (denominator != 0) {
            if (numerator < denominator) {
                this.numerator = numerator;
                this.denominator = denominator;
            }
            else throw new IllegalArgumentException("Числитель не меньше знаменателя.");
        }
        else throw new IllegalArgumentException("Знаменатель не может быть нулём.");
    }

    public double convertToPercent() {
        return (double)numerator / denominator * 100.0;
    }

    public int sum(int numCop) {

        int sum = 0;
        while (numCop != 0) {
            sum += numCop % 10;
            numCop /= 10;
        }

        return sum;
    }

    public int sumOfNumbers() {
        return sum(numerator) + sum(denominator);
    }

    public void getInfo() {
        System.out.printf("Дробь: %d/%d\nВ процентах: %.0f%%\nСума цифр: %d",
                numerator, denominator, convertToPercent(), sumOfNumbers());
    }

}
