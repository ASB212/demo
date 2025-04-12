
import java.awt.Point;

import ru.geometry.MyPoint;

public class Main {
    public static void main(String[] args) {

        MyPoint myPoint1 = MyPoint.A;
        MyPoint myPoint2 = MyPoint.B;


        Point point1 = new Point(2, 3);
        Point point2 = new Point(4, 5);


        System.out.println("Экземпляры класса MyPoint:");
        System.out.println("Точка A: " + myPoint1);
        System.out.println("Точка B: " + myPoint2);

        System.out.println("Экземпляры класса Point:");
        System.out.println("Point 1: " + point1);
        System.out.println("Point 2: " + point2);
    }
}