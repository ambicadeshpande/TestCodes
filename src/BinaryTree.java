public class BinaryTree {
    Node root;
    BinaryTree(){
        root = null;
    }
    public void printInOrderNodes(Node root){
        Node temp = root;
        if(temp != null){
            printInOrderNodes(temp.left);
            System.out.println(temp.data);
            printInOrderNodes(temp.right);
        }
    }

    public void printPreOrderNodes(Node root){
        Node temp = root;
        if(temp != null){
            System.out.println(temp.data);
            printPreOrderNodes(temp.left);
            printPreOrderNodes(temp.right);
        }
    }

    public void printPostOrderNodes(Node root){
        Node temp = root;
        if(temp != null){
            printPostOrderNodes(temp.left);
            printPostOrderNodes(temp.right);
            System.out.println(temp.data);
        }
    }
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.root = new Node(8);
        bt.root.left = new Node(1);
        bt.root.right =new Node(9);
        bt.root.left.left = new Node(2);
        bt.root.left.right = new Node(3);
        bt.root.left.left.left = new Node(4);
        bt.root.left.left.right = new Node(5);
        bt.root.left.right.left = new Node(6);
        bt.root.right.left =new Node(7);
        bt.root.right.right =new Node(0);

        System.out.println("In order:");
        bt.printInOrderNodes(bt.root);
        System.out.println("Pre order:");
        bt.printPreOrderNodes(bt.root);
        System.out.println("Post order:");
        bt.printPostOrderNodes(bt.root);
    }
}

