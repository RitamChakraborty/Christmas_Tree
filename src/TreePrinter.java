import java.util.List;
import java.util.Map;

public class TreePrinter {
    public void print(DepthMap depthMap) {
        Map<Integer, List<Character>> map = depthMap.getDepthMap();

        for (Integer depth : map.keySet()) {
            StringBuilder stringBuilder = new StringBuilder();

            map.get(depth).forEach(stringBuilder::append);

            System.out.println(stringBuilder.toString());
        }
    }
}
