package ru.stepup.demo;

import java.util.LinkedHashMap;
import java.util.Map;

public class City {
    private String name;
    private Map<City, Integer> paths;

    public City(String name) {
        this.name = name;
        this.paths = new LinkedHashMap<>();
    }

    public void addPath(City city, int cost) {
        paths.put(city, cost);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(name + " [");
        for (Map.Entry<City, Integer> entry : paths.entrySet()) {
            sb.append(entry.getKey().name).append(": ").append(entry.getValue()).append(", ");
        }
        if (!paths.isEmpty()) {
            sb.setLength(sb.length() - 2);
        }
        sb.append("]");
        return sb.toString();
    }

    public Map<City, Integer> getPaths() {
        return paths;
    }

    public String getName() {
        return name;
    }
}