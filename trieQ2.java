package DSA;

// Word Break Problem :
public class trieQ2 {

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

    public static boolean startsWith(String prefix){
        Node curr = root;
        for(int i=0; i<prefix.length(); i++){

            int idx = prefix.charAt(i) - 'a';

            if(curr.children[idx] == null){
                return false;
            }

            curr = curr.children[idx];
        }
        return true;
    }
   
    public static void main(String[] args) {
        
        String[] words = {"apple", "app", "mango", "man", "woman"};

        String prefix1 = "app";
        String prefix2 = "moon";

        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }
        System.out.println(startsWith(prefix1));
        System.out.println(startsWith(prefix2));

    }
}
