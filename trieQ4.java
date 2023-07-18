package DSA;

public class trieQ4 {

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

    public static String ans = "";

    public static void longestWord(Node root, StringBuilder temp){
        if(root == null){
            return;
        }
       
       for(int i=0; i<26; i++){

        if(root.children[i] != null && root.children[i].eow == true){
            temp.append((char)(i+'a'));
            if(temp.length() > ans.length()){
                ans = temp.toString();
            }

            longestWord(root.children[i], temp);

            temp.deleteCharAt(temp.length()-1);
        }
        
       }
       
    }
    public static void main(String[] args) {
        String words[] = { "a", "banana", "app", "appl", "ap", "apply", "apple"};

        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }
        longestWord(root, new StringBuilder(""));
        System.out.println(ans);

        
    }
}
 