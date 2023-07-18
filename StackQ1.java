package DSA;
import java.util.Scanner;
import java.util.Stack;
public class StackQ1 {

    public static void pushAtBottom(int data, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        
        System.out.print("Enter a element do you want to store at bottom :- ");
        int data = sc.nextInt();
        pushAtBottom(data,s);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
        sc.close();
    }
}
