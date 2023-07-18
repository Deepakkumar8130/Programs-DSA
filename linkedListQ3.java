package DSA;

public class linkedListQ3 {
    Node head;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
            
        }
    }

    // check cycle
    public static boolean hasCycle(Node head){
        if(head == null){
            return false;
        }

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(slow == fast){
                return true;
            }
        }
        return false;
    }
   
    //print
    static void printList(Node head){
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
    public static void removeCycle(Node head) {
        Node slow = head;
        Node fast = head;
        
        // Find the meeting point of the slow and fast pointers
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if (slow == fast) {
                break;
            }
        }
        
        // Move the slow pointer back to the head and advance both slow and fast pointers by one node at a time
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        
        // Move the fast pointer to the node just before the start of the cycle
        while (fast.next != slow) {
            fast = fast.next;
        }
        
        // Remove the cycle
        fast.next = null;
    }


    public static void main(String[] args) {
       Node head = new Node(1);
       Node second = new Node(2);
       Node third = new Node(3);
       Node fourth = new Node(4);
       Node fifth = new Node(5);

       head.next = second;
       second.next = third;
       third.next = fourth;
       fourth.next = fifth;
       fifth.next = third;
    
    if(hasCycle(head)){
        removeCycle(head);
        printList(head);
    }
    else{
        printList(head);
    }


        

        
      


        
    }
}
