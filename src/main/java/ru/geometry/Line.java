package ru.geometry;


public class Line {
    Tochka start;
    Tochka end;

    public Line(Tochka start, Tochka end) {
        this.start = start;
        this.end = end;

    }

    public String toString() {
        return "Линия от " + start + " до " + end;
    }

    public double getLength() {
        return Math.sqrt(((end.x + start.x) * 2) + ((end.y + start.y) * 2) * 2);
    }

    public static void main(String[] args) {
        Line line1 = new Line(Tochka.A, Tochka.B);
        Line line2 = new Line(Tochka.C, Tochka.E);
        Line line3 = new Line(Tochka.B, Tochka.C);

        System.out.println(line3);

        line3 = new Line((new Tochka(Tochka.B.x + 1, Tochka.B.y + 1)), (new Tochka(Tochka.C.x + 1, Tochka.C.y + 1)));

        System.out.println("Обновленная " + line3);

        double Sum = line1.getLength() + line2.getLength() + line3.getLength();
        System.out.println("Сумма линий: " + Sum);
    }
}