package ru.geometry;

public class NumberSum {
    public static double sumAll(Number... numbers) {
        double sum = 0;
        for (Number num : numbers) {
            sum += num.doubleValue();
        }
        return sum;
    }

    public static void target(String[] args) {
        double sum1 = NumberSum.sumAll(2, 3.0 / 5, 2.3);
        double sum2 = NumberSum.sumAll(3.6, 49.0 / 12, 3, 3.0 / 2);
        double sum3 = NumberSum.sumAll(1.0 / 3, 1);

        System.out.println("2 + 3/5 + 2.3 = " + sum1);
        System.out.println("3.6 + 49/12 + 3 + 3/2 = " + sum2);
        System.out.println("1/3 + 1 = " + sum3);
    }
}