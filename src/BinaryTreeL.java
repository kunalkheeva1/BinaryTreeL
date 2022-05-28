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



        }
    }


    public static void main(String[] args) {

    }
}
