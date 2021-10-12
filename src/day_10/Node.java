package day_10;

public class Node {
    private Node law;
    private Node left;
    private int key;

    public Node getLaw() {
        return law;
    }

    public void setLaw(Node law) {
        this.law = law;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public void insertTree(Node root, int key) {
        Node node = new Node();
        node.setKey(key);
        if (root == null) {
            root = node;
        } else {
            Node current = root;
            Node prev = null;
            while (true) {
                prev = current;
                if (key < prev.getKey()) {
                    current = prev.getLeft();
                    if (current == null) {
                        prev.setLeft(node);
                        return;
                    }
                } else {
                    current = current.getLaw();
                    if (current == null) {
                        prev.setLaw(node);
                    }
                }
            }
        }

    }
}
