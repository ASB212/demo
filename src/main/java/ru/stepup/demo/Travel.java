package ru.stepup.demo;

public class Travel {

    public static City travelBy(City currentCity, int n) {
        for (int i = 0; i < n; i++) {
            if (currentCity.getPaths().isEmpty()) {
                return null;
            }

            currentCity = currentCity.getPaths().keySet().iterator().next();
        }
        return currentCity;
    }

    public static void cities(String[] args) {
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

        City result1 = travelBy(cityB, 1);
        System.out.println("Город после 1 перехода: " + (result1 != null ? result1.getName() : "Нет пути"));

        City result2 = travelBy(cityB, 2);
        System.out.println("Город после 2 переходов: " + (result2 != null ? result2.getName() : "Нет пути"));

        City result3 = travelBy(cityB, 3);
        System.out.println("Город после 3 переходов: " + (result3 != null ? result3.getName() : "Нет пути"));
    }
}