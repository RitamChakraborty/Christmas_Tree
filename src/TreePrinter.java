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
            StringBuilder stringBuilder = new StringBuilder();
            List<Character> nodes = map.get(depth);
            int d = (maxDepth - depth);
            int n = func(d);

            for (int i = 0; i < nodes.size(); i++) {
                Character node = nodes.get(i);

                if (d == 0) {
                    stringBuilder.append(node);

                    if (i + 1 != nodes.size()) {
                        if (i % 2 == 0) {
                            stringBuilder.append("   ");
                        } else {
                            stringBuilder.append(" ");
                        }
                    }
                } else {
                    StringBuilder stringBuilder1 = new StringBuilder();

                    stringBuilder1.append(" ".repeat(n));
                    stringBuilder.append(stringBuilder1);
                    stringBuilder.append(node);

                    if (i != nodes.size() - 1) {
                        stringBuilder.append(stringBuilder1);
                        stringBuilder.append(" ");
                    }
                }
            }

            if (d != 0) {
                StringBuilder stringBuilder1 = new StringBuilder("\n");
                int nextDepthNodesSize = map.get(depth + 1).size();
                int p = nextDepthNodesSize % 2 == 0 ? nextDepthNodesSize / 2 : nextDepthNodesSize / 2 + 1;

                int m = func(d - 1);
                int j = 2 * m;
                j = d == 1 ? j - 1 : j;
                int tempJ = j;

                for (int i = 0; i < m; ++i) {
                    for (int b = 0; b < p; ++b) {
                        j = tempJ;
                        String string = " ".repeat(2 * n + 2);
                        char[] chars = string.toCharArray();
                        int k = (j - i) + 2 * (i + 1);
                        chars[j - i] = '/';

                        if (nextDepthNodesSize % 2 == 0 || b != p - 1) {
                            chars[k] = '\\';
                        }

                        string = new String(chars);
                        stringBuilder1.append(string);
                    }

                    stringBuilder1.append("\n");
                }

                stringBuilder.append(stringBuilder1);
            }

            System.out.print(stringBuilder);
        }
    }
}
