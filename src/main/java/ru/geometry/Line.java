package ru.geometry;


public class Line {
    MyPoint start;
    MyPoint end;

    public Line(MyPoint start, MyPoint end) {
        this.start = start;
        this.end = end;

    }

    public String toString() {
        return "Линия от " + start + " до " + end;
    }

    public double getLength() {
        return Math.sqrt(((end.x + start.x) * 2) + ((end.y + start.y) * 2) * 2);
    }

    public static void path(String[] args) {
        Line line1 = new Line(MyPoint.A, MyPoint.B);
        Line line2 = new Line(MyPoint.C, MyPoint.E);
        Line line3 = new Line(MyPoint.B, MyPoint.C);

        System.out.println(line3);

        line3 = new Line((new MyPoint(MyPoint.B.x + 1, MyPoint.B.y + 1)), (new MyPoint(MyPoint.C.x + 1, MyPoint.C.y + 1)));

        System.out.println("Обновленная " + line3);

        double Sum = line1.getLength() + line2.getLength() + line3.getLength();
        System.out.println("Сумма линий: " + Sum);
    }
}