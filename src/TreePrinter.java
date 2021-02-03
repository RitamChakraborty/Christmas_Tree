import java.util.Collections;
import java.util.List;
import java.util.Map;

public class TreePrinter {
    private final Utils utils = new Utils();

    private int func(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 2;
        } else {
            return func(n - 1) * 2 + 1;
        }
    }

    public void print(DepthMap depthMap) {
        Map<Integer, List<Character>> map = depthMap.getDepthMap();
        int maxDepth = Collections.max(map.keySet());

        for (Integer depth : map.keySet()) {
            int maxNodesSize = utils.getMaxNodeSizeForDepth(depth);
            StringBuilder stringBuilder = new StringBuilder();
            List<Character> nodes = map.get(depth);

            for (int i = 0; i < nodes.size(); i++) {
                Character node = nodes.get(i);
                int d = (maxDepth - depth);
                int n = func(d);

                StringBuilder stringBuilder1 = new StringBuilder();

                stringBuilder1.append("_".repeat(Math.max(0, n)));
                stringBuilder.append(stringBuilder1);
                stringBuilder.append(node);

                if (i != nodes.size() - 1) {
                    stringBuilder.append(stringBuilder1);

                    if (i % 2 == 0) {
                        stringBuilder.append("-");
                    }
                }
            }

            System.out.println(stringBuilder.toString());
        }
    }
}
