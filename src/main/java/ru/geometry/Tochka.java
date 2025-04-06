package ru.geometry;

public class Tochka {

    int x;
    int y;

    public Tochka(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static final Tochka A = new Tochka(1, 3);
    public static final Tochka B = new Tochka(5, 8);
    public static final Tochka C = new Tochka(10, 11);
    public static final Tochka E = new Tochka(15, 19);

    public String toString() {
        return "{" + x + ";" + y + "}";
    }
}