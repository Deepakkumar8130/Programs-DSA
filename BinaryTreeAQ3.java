package DSA;

public class BinaryTreeAQ3 {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
             if(nodes[idx] == -1){
                return null;
             }

             Node newNode = new Node(nodes[idx]);
             newNode.left = buildTree(nodes);
             newNode.right = buildTree(nodes);

             return newNode;
        }
    }
    static class BinaryTreesub{
        static int idx = -1;
        public static Node buildTreesub(int nodes[]){
            idx++;
             if(nodes[idx] == -1){
                return null;
             }

             Node newNode = new Node(nodes[idx]);
             newNode.left = buildTreesub(nodes);
             newNode.right = buildTreesub(nodes);

             return newNode;
        }
    }

    public static  boolean  isIdentical(Node root, Node subroot) {
        if(root == null && subroot == null){
            return true;
        }

        if(root == null || subroot == null){
            return false;
        }

        if(root.data == subroot.data){
            return isIdentical(root.left, subroot.left) || isIdentical(root.right, subroot.right);
        }
        return false;
        
    }

   

    public static boolean isSubtree(Node root, Node subroot){
        
        if(subroot == null){
            return true;
        }

        if(root == null){
            return false;
        }

        if(root.data == subroot.data){
            if(isIdentical(root, subroot)){
                return true;
            }
        }
        return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
         

    }




    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        int subnodes[] = {2, 4, -1, -1, 5, -1, -1};

        BinaryTree tree = new BinaryTree();
        BinaryTreesub subtree = new BinaryTreesub();

        Node root = tree.buildTree(nodes);
        Node subroot = subtree.buildTreesub(subnodes);

        System.out.println(isSubtree(root, subroot));

        
        
    }
}
