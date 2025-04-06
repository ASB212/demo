package ru.courses.main;

import ru.courses.city.City;

public class Main {
    public static void main(String[] args) {
        City cityA = new City("A");
        City cityB = new City("B");
        City cityC = new City("C");
        City cityD = new City("D");
        City cityE = new City("E");
        City cityF = new City("F");

        cityB.addPath(cityC, 1);
        cityB.addPath(cityD, 2);
        cityD.addPath(cityA, 1);
        cityC.addPath(cityE, 1);
        cityE.addPath(cityF, 3);
        cityE.addPath(cityA, 1);

        City result1 = ru.courses.city.Travel.travelBy(cityB, 1);
        System.out.println("Город после 1 перехода: " + (result1 != null ? result1.getName() : "Нет пути"));

        City result2 = ru.courses.city.Travel.travelBy(cityB, 2);
        System.out.println("Город после 2 переходов: " + (result2 != null ? result2.getName() : "Нет пути"));

        City result3 = ru.courses.city.Travel.travelBy(cityB, 3);
        System.out.println("Город после 3 переходов: " + (result3 != null ? result3.getName() : "Нет пути"));
    }
}