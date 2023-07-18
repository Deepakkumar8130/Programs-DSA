package DSA;

import java.util.Scanner;

public class linkedListQ1 {
    Node head;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
            
        }
    }
    // add- first, last

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head ==null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head ==null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    // delete- first, last
    public void deleteFirst(){
        if(head ==null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    public void deleteLast(){
        if(head ==null){
            System.out.println("List is empty");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node currNode = head;
        while(currNode.next.next != null){
            currNode = currNode.next;
        }
        currNode.next = null;
    }

    //print
    public void printList(){
        if(head ==null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
       
    }
    public Node removeNthFromEnd(Node head, int n){
        if(head.next == null){
            return null;
        }

        //size
        int size = 0;
        Node curr = head;
        while(curr != null){
            curr = curr.next;
            size++;
        }
        System.out.println("Size : "+size);
        if(n == size){
            return head.next;
        }



        int indTosearch = size - n;
        Node prev = head;
        int i = 1;
        while(i < indTosearch){
            prev = prev.next;
            i++;
        }
        System.out.println("This Element do you want to delete : -> "+prev.next.data);


        prev.next =prev.next.next;
        return head;

    }


    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        linkedListQ1 list = new linkedListQ1();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);

        list.printList();
        System.out.print("Enter a position of Element do you want to delete from the end :- ");
        int n = sc.nextInt();

        
        list.head = list.removeNthFromEnd(list.head, n);
        list.printList();

        
        sc.close();


        
    }
}
