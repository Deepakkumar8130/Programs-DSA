package DSA;

import java.util.ArrayList;
import java.util.List;

public class trieQ5 {

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

    public static List<String> list = new ArrayList<>();
   public static void printString(Node root, StringBuilder s){

    Node curr = root;
    if(curr == null){
        if(s.length() > 0){
            list.add(s.toString());
            s.delete(0, s.length()-1);
        }
        return;
    }

    if(curr.eow){
        list.add(s.toString());
    }

    for(int i=0; i<26; i++){
        if(curr.children[i] != null){
            s.append((char)(i + 'a'));
            printString(curr.children[i], s);
            s.deleteCharAt(s.length()-1);
        }
    }
   }

    
    public static void main(String[] args) {
        String words[] = { "a", "banana", "app", "ap", "apply", "apple"};

        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }
        
        StringBuilder s = new StringBuilder();

        printString(root, s);
        System.out.println(list);
        

        
    }
}
 