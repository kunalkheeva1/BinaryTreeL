public class BinaryTreeL {

    //creating a node class to work with nodes in my code of trees
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left =null;
            this.right = null;
        }
    }
    //Now creating a binary tree class and storing a recursive function in it
    static class BinaryTree{
        static int idx= -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] ==-1){             //in case there is no element contained by the tree
                return null;
            }
            Node newNode = new Node(nodes[idx]);        //got new node that contains nodes array with idx
            newNode.left =buildTree(nodes);             //left side, I could access left with newNode object
            newNode.right = buildTree(nodes);           //right side of the tree
        return newNode;
        }
    }

    // creating a method to create preorder traversing

    public static void preOrder(Node root){
        if(root==null){                         //edge case if it is null
            return;
        }

        System.out.print(root.data+ " ");          //here i will be priniting the root node first
        preOrder(root.left);                    //Now it rucursively prints left nodes and then move on to right
        preOrder(root.right);
    }

    //creating a method to do inorder traversal which basically prints left nodes first
    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);                     //going to to the leaf left
        System.out.print(root.data+ " ");       //then printing
        inOrder(root.right);                    //then recursively doing same in the right side
    }

    public static void main(String[] args) {
        int [] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        preOrder(root);

    }

}
