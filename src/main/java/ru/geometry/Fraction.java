package ru.geometry;

class Fraction extends Number {
    private final int numerator;
    private final int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator <= 0) {
            throw new IllegalArgumentException("Знаменатель должен быть > 0");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    @Override
    public double doubleValue() {
        return (double) numerator / denominator;
    }

    @Override
    public float floatValue() {
        return (float) numerator / denominator;
    }

    @Override
    public int intValue() {
        return numerator / denominator;
    }

    @Override
    public long longValue() {
        return numerator / denominator;
    }

    public Fraction sum(Fraction other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction sum(int integer) {
        return this.sum(new Fraction(integer, 1));
    }

    public Fraction minus(Fraction other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction minus(int integer) {
        return this.minus(new Fraction(integer, 1));
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 3);
        Fraction f2 = new Fraction(2, 5);
        Fraction f3 = new Fraction(7, 8);

        Fraction result = f1.sum(f2).sum(f3).minus(5);
        System.out.println("=" + result);

        System.out.println("Дробное значение (double): " + result.doubleValue());
        System.out.println("Дробное значение (float): " + result.floatValue());
        System.out.println("Целое значение (int): " + result.intValue());
        System.out.println("Целое значение (long): " + result.longValue());
    }
}