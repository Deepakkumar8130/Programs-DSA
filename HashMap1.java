package DSA;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashMap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // HashMap<Key, value> HashMap_NAME = new HashMap<>();
        
        HashMap<String, Integer> student = new HashMap<>();
        // System.out.print("Enter the no. of Details : ");
        // int n = sc.nextInt();

        // for(int i=0; i<n; i++){
        //     System.out.print("Enter a name : ");
        //     sc.nextLine();
        //     String name = sc.nextLine();

        //     System.out.print("Enter a roll no. : ");
        //     int roll_no = sc.nextInt();

        //     //Insertion
        //     student.put(name, roll_no);
        // } 

        

        student.put("Deepak Kumar", 11);
        student.put("Tushar Kumar", 38);
        student.put("Harsh Tyagi", 15);
        student.put("Prince Sharma", 29);
        student.put("Abhay Pratap Singh", 01);
        student.put("Biplob Biswas",9);

        System.out.println(student.size());

        // for all print
        for(Map.Entry<String, Integer> e : student.entrySet()){
            // getkey & getvalue
            System.out.println(e.getKey()+" : "+e.getValue());
        }

        //remove
        student.remove("Tushar Kumar");

        System.out.println(student.size());
        System.out.println(student);

        // Set<String> keys = student.keySet();
        // for(String key : keys){
        //     System.out.println(key+" "+student.get(key));
        // }
        
        
        // System.out.print("Enter a search name : ");
        // sc.nextLine();
        // String s = sc.nextLine(); 

        // //Search
        // if(student.containsKey(s)){

        //     //Get for get value
        //     System.out.println("Name : "+s+"\nRoll No. : "+student.get(s));
            
        // }

        // sc.close();
    }
}
