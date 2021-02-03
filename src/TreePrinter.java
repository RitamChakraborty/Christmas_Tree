import java.util.Collections;
import java.util.List;
import java.util.Map;

public class TreePrinter {
    private final Utils utils = new Utils();

    public void print(DepthMap depthMap) {
        Map<Integer, List<Character>> map = depthMap.getDepthMap();
        int maxDepth = Collections.max(map.keySet());

        for (Integer depth : map.keySet()) {
            int maxNodesSize = utils.getMaxNodeSizeForDepth(depth);
            StringBuilder stringBuilder = new StringBuilder();
            List<Character> nodes = map.get(depth);

            for (int i = 0; i < nodes.size(); i++) {
                Character node = nodes.get(i);
                stringBuilder.append(node);

                if (i + 1 != nodes.size()) {
                    if (i % 2 == 0) {
                        stringBuilder.append("___");
                    } else {
                        stringBuilder.append(" ");
                    }
                }
            }

            System.out.println(stringBuilder.toString());
        }
    }
}
