package DSA;



public class linkedListReverse {
    Node head;
    private int size;

    linkedListReverse(){
        this.size =0;
    }
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
            size++;
            
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
        size--;
        head = head.next;
    }

    public void deleteLast(){
        if(head ==null){
            System.out.println("List is empty");
            return;
        }
        size--;
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



    // size
    public int getsize(){
        return size;
    }


    // reverse
    public void reverseIterate(){
         if(head == null || head.next == null){
            return;
         }

        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;


            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode; 
    }

    public static void main(String[] args) {
        linkedListReverse list = new linkedListReverse();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.printList();

        list.reverseIterate();
        list.printList();
        


        
    }
}
