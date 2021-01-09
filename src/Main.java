public class Main {
    public static void main(String[] args) {
        String string = "MERRYCHRISTMAS";

        // Depth 4
        Node node1 = new Node(string.charAt(0), null, null);
        Node node3 = new Node(string.charAt(2), null, null);
        Node node5 = new Node(string.charAt(4), null, null);
        Node node7 = new Node(string.charAt(6), null, null);
        Node node9 = new Node(string.charAt(8), null, null);
        Node node11 = new Node(string.charAt(10), null, null);
        Node node13 = new Node(string.charAt(12), null, null);

        // Depth 3
        Node node2 = new Node(string.charAt(1), node1, node3);
        Node node6 = new Node(string.charAt(5), node5, node7);
        Node node10 = new Node(string.charAt(9), node9, node11);
        Node node14 = new Node(string.charAt(13), node13, null);

        // Depth 2
        Node node4 = new Node(string.charAt(3), node2, node6);
        Node node12 = new Node(string.charAt(11), node10, node14);

        // Depth 1
        Node root = new Node(string.charAt(7), node4, node12);

        Graph graph = new Graph();
        graph.inOrder(root);

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
