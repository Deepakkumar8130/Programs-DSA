package DSA;

import java.util.HashSet;

public class HashSetQ2 {

    public static int union(int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }

        for(int i=0; i<arr2.length; i++){
            set.add(arr2[i]);
        }
        return set.size();
    } 

    // public static void union(int[] arr1, int[] arr2){
    //     HashSet<Integer> set = new HashSet<>();
    //     int n = arr1.length > arr2.length ? arr1.length : arr2.length;

    //     for(int i=0; i<n; i++){
    //         try{
    //             set.add(arr1[i]);
    //             set.add(arr2[i]);
    //         }
    //         catch(Exception e){
    //             if(arr1.length > arr2.length){
    //                 set.add(arr1[i]);
    //             }
    //             else{
    //                 set.add(arr2[i]);
    //             }

    //         }

    //     }
    //     System.out.println(set);
    // }
    public static void main(String[] args) {
        int[] arr1 = {7, 3, 9};
        int[] arr2 = {6, 3, 9, 2, 9, 4};

        // union(arr1, arr2);

        System.out.println(union(arr1, arr2)); 
    }
}
