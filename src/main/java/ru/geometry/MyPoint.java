package ru.geometry;

public class MyPoint {

    int x;
    int y;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static final MyPoint A = new MyPoint(1, 3);
    public static final MyPoint B = new MyPoint(5, 8);
    public static final MyPoint C = new MyPoint(10, 11);
    public static final MyPoint E = new MyPoint(15, 19);

    @Override
    public String toString() {
        return "{" + x + ";" + y + "}";
    }
}