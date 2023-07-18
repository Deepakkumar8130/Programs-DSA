package DSA;

public class trieQ3 {

    static class Node{
        Node[] children;
        boolean eow;

        public Node(){
            children = new Node[26]; // a to z
            for(int i=0; i<children.length; i++){
                children[i] = null;
            }
            eow = false;
        }
    }

    static Node root = new Node();

    public static void insert(String word){
        Node curr = root;

        for(int i=0; i<word.length(); i++){ // O(L)
            
            int idx = word.charAt(i) - 'a';

            if(curr.children[idx] == null){
                // add new node 
                curr.children[idx] = new Node();
            }

            if(i == word.length() - 1){
                curr.children[idx].eow = true;
            }

            curr = curr.children[idx];
        }
    }

    public static int countUniqueSubstrings(Node root){
        if(root == null){
            return 0;
        }
        Node curr = root;
        int count = 0;
        for(int i=0; i<26; i++){

            if(curr.children[i] != null){
                count += countUniqueSubstrings(curr.children[i]);

            }
        }
        return count + 1;
        
    }
    public static void main(String[] args) {
        String str = "ababa";

        for(int i=0; i<str.length(); i++){
            String suffix = str.substring(i);
            insert(suffix);
        }
        System.out.println(countUniqueSubstrings(root));
    }
}
