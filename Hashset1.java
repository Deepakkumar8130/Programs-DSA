package DSA;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset1 {
    public static void main(String[] args) {

        //Creating
        HashSet<Integer> set = new HashSet<>();
        
        //Insert
        set.add(3);
        set.add(1);
        set.add(2);
        set.add(1);


        // //Search - contains 
        if(set.contains(2)){
            System.out.println("set contains 1");
        }
        // if(!set.contains(6)){
        //     System.out.println("set doesn't contains 6");
        // }

        // //size
        // System.out.println("Size of set is : "+set.size());

        // // print all element in set
        // System.out.println(set);

        // //Delete-remove
        // set.remove(2);

        // if(!set.contains(2)){
        //     System.out.println("set doesn't contains 2");
        // }


        // System.out.println("Size of set is : "+set.size());
        // System.out.println(set);

        //Iterator

        // Iterator it = set.iterator();
        // System.out.println(it.next());
        // System.out.println(it.hasNext());
        // System.out.println(it.next());
        // System.out.println(it.next());
        
        // System.out.println(it.hasNext());

        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }
    
    }
}
