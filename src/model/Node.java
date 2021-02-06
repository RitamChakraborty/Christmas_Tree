package model;

public class Node {
    private final char alphabet;
    private final Node left;
    private final Node right;

    public Node(char alphabet, Node left, Node right) {
        this.alphabet = alphabet;
        this.left = left;
        this.right = right;
    }

    public char getAlphabet() {
        return alphabet;
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
                "alphabet=" + alphabet +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
