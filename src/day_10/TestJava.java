package day_10;

public class TestJava {
    public static void main(String[] args) {
        Node node = new Node();

        node.insertTree(node, 20);
        node.insertTree(node, 5);
        node.insertTree(node, 6);
        node.insertTree(node, 21);
    }
}
