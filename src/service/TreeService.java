package service;

import model.Node;
import util.Utils;

public class TreeService {
    private String message;

    public TreeService(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Node getTree() {
        return tree(message);
    }

    private Node completeTree(String string) {
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

    private Node tree(String string) {
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

        int length = Utils.getClosesPossibleCompleteBinaryTreeSize(string.length());

        if (length == n) {
            return completeTree(string);
        }

        String left = string.substring(0, length);
        char middle = string.charAt(length);
        String right = string.substring(length + 1);

        return new Node(middle, tree(left), tree(right));
    }
}
