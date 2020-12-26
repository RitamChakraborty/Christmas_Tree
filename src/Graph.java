public class Graph {
    public void inOrder(Node node) {
        if (node != null) {
            inOrder(node.getLeft());
            System.out.print(node.getCh());
            inOrder(node.getRight());
        }
    }
}
