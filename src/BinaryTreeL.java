import java.util.LinkedList;
import java.util.Queue;

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
    // Now going to work on post order traversal, it works as  Left, Right and then root
    public static void postOrder(Node root){
        if( root == null){
            return;
        }
        postOrder(root.left);           //travelled the left
        postOrder(root.right);          //travelled the right
        System.out.print(root.data +" ");   //now print
    }
    //creating a method to print the nodes wrt their levels.
    public static void printLevel(Node root){
        Queue<Node> q = new LinkedList<>();         // installed a queue to hold the nodes
        q.add(root);

       while(!q.isEmpty()){                         // running a loop until my queue gets empty
           Node curNode = q.remove();               // curNode is a node reference that holds removed nodes of queue
           System.out.print(curNode.data+ " ");     //then it prints that node
           if(curNode.left!=null){                  //if the left node is not null, then it again run the loop and remove the node and store it in curNode and then print the node
               q.add(curNode.left);
           }if (curNode.right!=null){               //if right node is not null, then it again run the loop, remove the node store in curNode and then print
               q.add(curNode.right);
           }
       }
    }

    public static void main(String[] args) {
        int [] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
      printLevel(root);
    }

}
