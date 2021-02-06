package model;

import java.util.List;
import java.util.Map;

public class DepthMap {
    private final Map<Integer, List<Character>> map;

    public DepthMap(Map<Integer, List<Character>> map) {
        this.map = map;
    }

    public Map<Integer, List<Character>> getMap() {
        return map;
    }

    @Override
    public String toString() {
        return "DepthMap{" +
                "map=" + map +
                '}';
    }
}
