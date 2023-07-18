package DSA;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetQ3 {

    public static int intersection(int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        List list = new ArrayList<>();
        int count = 0;
        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }
        for(int i=0; i<arr2.length; i++){
            if(set.contains(arr2[i])){
               list.add(arr2[i]);
                set.remove(arr2[i]);
                count++;
            }
        }
        System.out.println(list);
        return count;
    }
    public static void main(String[] args) {
        int[] arr1 = {7, 3, 9};
        int[] arr2 = {6, 3, 9, 2, 9, 4};

        System.out.println(intersection(arr1, arr2)); 
    }
}
