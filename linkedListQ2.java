package DSA;

public class linkedListQ2 {
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
    // reverse
    public Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }
        return prev;

    }
    //middle
    public Node findMiddle(Node head){
        Node hare = head;
        Node turtle = head;

        while(hare.next != null && hare.next.next != null){
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
         
    }


    public boolean ispalindrome(Node head){
        if(head == null || head.next == null){
            return true;
        }
        
        Node middle = findMiddle(head);
        Node secondHalfStart = reverse(middle.next);

        Node firstHalfStart = head;
        while(secondHalfStart != null){
            if(firstHalfStart.data != secondHalfStart.data){
                return false;
            }
            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;
        }
        return true;
    }




    

    public static void main(String[] args) {
        linkedListQ2 list = new linkedListQ2();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(2);
        list.addLast(1);

        list.printList();

        
        System.out.println(list.ispalindrome(list.head));
        

        
      


        
    }
}
