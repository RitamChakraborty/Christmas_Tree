package service;

import model.DepthMap;
import model.Node;

import java.util.*;

public class DepthMapService {
    private final Map<Integer, List<Character>> map = new TreeMap<>();
    private final Node tree;

    public DepthMapService(Node tree) {
        this.tree = tree;
    }

    public DepthMap getDepthMap() {
        generateDepthMap(tree, 0);
        return new DepthMap(map);
    }

    private void generateDepthMap(Node node, int depth) {
        if (node != null) {
            if (map.get(depth) == null) {
                map.put(depth, new ArrayList<>(Collections.singletonList(node.getAlphabet())));
            } else {
                map.get(depth).add(node.getAlphabet());
            }

            generateDepthMap(node.getLeft(), depth + 1);
            generateDepthMap(node.getRight(), depth + 1);
        }
    }
}
