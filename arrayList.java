package DSA;
import java.util.*;

class arrayList {
    public static void main(String args[]) {
         ArrayList<Integer> list = new ArrayList<>();

         // add elements :
         list.add(4);
         list.add(6);
         list.add(5);

         System.out.println(list);

         // get elements :
         int element = list.get(1);
         System.out.println(element);

         // add element in between list :
         list.add(1,0);
         System.out.println(list);

        // set element :
        list.set(1,1);
        System.out.println(list);

        // delete element :
        list.remove(2);
        System.out.println(list);

        // size :
        int size = list.size();
        System.out.println("Size of ArrayList : "+size);

        // loop :
        for (int i = 0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
            
        }System.out.println();

        Collections.sort(list);
        System.out.println(list);
    }
}