package ru.courses.city;

public class Travel {
    public static ru.courses.city.City travelBy(ru.courses.city.City currentCity, int n) {
        for (int i = 0; i < n; i++) {
            if (currentCity.getPaths().isEmpty()) {
                return null;
            }
            currentCity = currentCity.getPaths().keySet().iterator().next();
        }
        return currentCity;
    }
}