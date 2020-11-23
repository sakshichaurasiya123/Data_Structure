import java.util.Scanner;

public class SearchBST {
    static class Node{
        int data;
        Node left ;
        Node right;
        public Node(int data){

            this.left=null;
            this.right=null;
        }
    }
    public Node root;
    void insert (int key){
        root=insertrecord(root, key);
    }
    Node insertrecord(Node root , int key){
        if(root==null){
            root =new Node(key);
            return root;
        }
            if(key<root.data)
                root.left=insertrecord(root.left, key);
            else if(key>root.data)
                root.right=insertrecord(root.right, key);
    return root;

    }
    void inorder(){
        inorderrec(root);
    }
    void inorderrec(Node root)
    {
       while(root!=null){
        inorderrec(root.left);
        System.out.println(root.data +" ");
        inorderrec(root.right);
       }

    }


public static void main(String arg[]){
    SearchBST bst=new SearchBST();
    Scanner in=new Scanner(System.in);
    //System.out.println("Enter size of tree");
    //int n=in.nextInt();
    //System.out.println("Enter Element for tree");
   /* for(int i=0; i<n ; i++){
        int t=in.nextInt();
        bst.insert(t);
    }
    */
    bst.insert(18);
    bst.insert(14);
    bst.insert(20);
    System.out.println("Inorder Traversal of given tree ");
    bst.inorder();

}

}