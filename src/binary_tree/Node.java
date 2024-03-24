package binary_tree;

public class Node {

    int item;
    Node up;
    Node down;
    Node left;
    Node right;

    public Node(int item) {
        this.item = item;
        this.up = null;
        this.down = null;
        this.left = null;
        this.right = null;
    }
}
