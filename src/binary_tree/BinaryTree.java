package binary_tree;

public class BinaryTree {

    Node root;

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.up = new Node(4);
        tree.root.up.left = new Node(6);
        tree.root.up.right = new Node(8);
        tree.root.down = new Node(5);
        tree.root.down.left = new Node(10);
        tree.root.down.right = new Node(7);
        tree.root.left = new Node(9);
        tree.root.left.up = new Node(5);
        tree.root.left.right = new Node(6);
        tree.root.right = new Node(4);
        tree.root.right.up = new Node(6);
        tree.root.right.down = new Node(8);


        System.out.println("Inorder traversal");
        tree.inorder(tree.root);

        System.out.println("\nPreorder traversal ");
        tree.preorder(tree.root);

        System.out.println("\nPostorder traversal");
        tree.postorder(tree.root);

    }

    BinaryTree() {
        this.root = null;
    }

    void postorder(Node node) {
        if ( node == null )
            return;

        postorder(node.up);
        postorder(node.down);
        postorder(node.left);
        postorder(node.right);
        System.out.println(node.item + " ");
    }

    void inorder(Node node) {
        if ( node == null )
            return;

        inorder(node.up);
        inorder(node.down);
        System.out.println(node.item + " ");
        inorder(node.left);
        inorder(node.right);
    }

    void preorder(Node node) {
        if ( node == null )
            return;

        System.out.println(node.item + " ");
        preorder(node.up);
        preorder(node.down);
        preorder(node.left);
        preorder(node.right);
    }
}
