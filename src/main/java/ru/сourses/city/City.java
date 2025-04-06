package ru.courses.city;

import java.util.HashMap;
import java.util.Map;

public class City {
    private String name;
    private Map<City, Integer> paths;

    public City(String name) {
        this.name = name;
        this.paths = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public Map<City, Integer> getPaths() {
        return paths;
    }

    public void addPath(City city, int distance) {
        paths.put(city, distance);
    }
}