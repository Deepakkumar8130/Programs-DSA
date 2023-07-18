package DSA;

import java.util.HashMap;


public class HasMapQ1 {

     public static void majorityElement(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){

            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i], 1);
            }
        }
        
        for(int key : map.keySet()){
            if(arr.length/3 < map.get(key)){
                System.out.println(key+" : "+map.get(key));
            }
           }
        
     }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 1, 3, 1, 5, 1};
        int[] arr2 = {1, 2};
        majorityElement(arr);

        
       
    }
}
