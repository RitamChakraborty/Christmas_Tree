public class Main {
    private static final Utils utils = new Utils();

    private static Node completeTree(String string) {
        int n = string.length();

        if (n == 0) {
            return null;
        } else if (n == 1) {
            return new Node(string.charAt(0), null, null);
        }

        int length = n / 2;
        String left = string.substring(0, length);
        String right = string.substring(length + 1);

        return new Node(string.charAt(length), completeTree(left), completeTree(right));
    }

    private static Node tree(String string) {
        int n = string.length();

        if (n == 0) {
            return null;
        } else if (n == 1) {
            return new Node(string.charAt(0), null, null);
        } else if (n == 2) {
            return new Node(string.charAt(1), new Node(string.charAt(0), null, null), null);
        } else if (n == 3) {
            return new Node(string.charAt(1), new Node(string.charAt(0), null, null), new Node(string.charAt(2), null, null));
        }

        int length = utils.getClosesPossibleCompleteBinaryTreeSize(string.length());

        if (length == n) {
            return completeTree(string);
        }

        String left = string.substring(0, length);
        char middle = string.charAt(length);
        String right = string.substring(length + 1);

        return new Node(middle, tree(left), tree(right));
    }

    public static void main(String[] args) {
        String string = "ABCDEFGHIJ";
        Node root = tree(string);
        DepthMap depthMap = new DepthMap();
        depthMap.generateDepthMap(root);
        TreePrinter treePrinter = new TreePrinter();
        treePrinter.print(depthMap);

        /*
                                                       z
                                                      / \
                                                     /   \
                                                    /     \
                                                   /       \
                                                  /         \
                                                 /           \
                                                /             \
                                               /               \
                                              /                 \
                                             /                   \
                                            /                     \
                                           /                       \
                                          /                         \
                                         /                           \
                                        /                             \
                                       /                               \
                                      /                                 \
                                     /                                   \
                                    /                                     \
                                   /                                       \
                                  /                                         \
                                 /                                           \
                                /                                             \
                               q                                               q
                              / \                                             / \
                             /   \                                           /   \
                            /     \                                         /     \
                           /       \                                       /       \
                          /         \                                     /         \
                         /           \                                   /           \
                        /             \                                 /             \
                       /               \                               /               \
                      /                 \                             /                 \
                     /                   \                           /                   \
                    /                     \                         /                     \
                   r                       p                       r                       p
                  / \                     / \                     / \                     / \
                 /   \                   /   \                   /   \                   /   \
                /     \                 /     \                 /     \                 /     \
               /       \               /       \               /       \               /       \
              /         \             /         \             /         \             /         \
             r           m           n           o           r           m           n           o
            / \         / \         / \         / \         / \         / \         / \         / \
           /   \       /   \       /   \       /   \       /   \       /   \       /   \       /   \
          e     c     s     s     j     k     l     m     e     c     s     a     j     k     l     m
         / \   / \   / \   / \   / \   / \   / \   / \   / \   / \   / \   / \   / \   / \   / \   / \
        m   r y   h i   t a   a b   c d   e f   g h   i y   h i   t s   a b   c d   e f   g h   i l   w

         */
    }
}
