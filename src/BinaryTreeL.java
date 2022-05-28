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
        static Node buildTree(int[] nodes){
            idx++;
            if(nodes[idx]==-1){             //in case there is no element contained by the tree
                return null;
            }
            Node newNode = new Node(nodes[idx]);        //got new node that contains nodes array with idx
            newNode.left =buildTree(nodes);             //left side, I could access left with newNode object
            newNode.right = buildTree(nodes);           //right side of the tree
        return newNode;

        }
    }


    public static void main(String[] args) {

    }
}
