package DSA;

import java.util.HashMap;


public class HashMapQ6 {

     public static boolean frequency_satisfy(int[] arr){
        
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> set = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])) map.put(arr[i], map.get(arr[i]) + 1);
            else map.put(arr[i],1);
        }


        for(int key : map.keySet()){
            if(set.containsKey(map.get(key))) return false;
            else set.put(map.get(key), 1);
        }
        return true;
        
     }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 6, 6, 6};

        System.out.println(frequency_satisfy(arr));

        /*
         EXAMPLE:-
                1.  arr = {1, 2, 1, 6, 6, 6};
                        1's has 2 times
                        2's has 1 times
                        6's has 3 times
                        2,1,3 all are different that why it is satisfying...

                1.  arr = {1, 2, 1, 6, 6};
                        1's has 2 times
                        2's has 1 times
                        6's has 2 times
                        1 and 6 both have same frequency that why it is not satisfying...
         */

        
       
    }
}
