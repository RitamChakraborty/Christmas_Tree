import java.util.*;

public class DepthMap {
    private final Map<Integer, List<Character>> map = new TreeMap<>();

    private void generateDepthMap(Node node, int depth) {
        if (node != null) {
            if (map.get(depth) == null) {
                map.put(depth, new ArrayList<>(Arrays.asList(node.getCh())));
            } else {
                map.get(depth).add(node.getCh());
            }

            generateDepthMap(node.getLeft(), depth + 1);
            generateDepthMap(node.getRight(), depth + 1);
        }
    }

    public void generateDepthMap(Node root) {
        generateDepthMap(root, 0);
    }

    public Map<Integer, List<Character>> getDepthMap() {
        return map;
    }
}
