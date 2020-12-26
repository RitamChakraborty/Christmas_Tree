public class Node {
    private final char ch;
    private Node left;
    private Node right;

    public Node(char ch, Node left, Node right) {
        this.ch = ch;
        this.left = left;
        this.right = right;
    }

    public char getCh() {
        return ch;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    @Override
    public String toString() {
        return "Node{" +
                "ch=" + ch +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
