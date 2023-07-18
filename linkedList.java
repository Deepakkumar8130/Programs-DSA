package DSA;

public class linkedList {
    Node head;
    private int size;

    linkedList(){
        this.size =0;
    }
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
            
        }
    }
    // add- first, last

    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head ==null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
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

    public static void main(String[] args) {
        linkedList list = new linkedList();
        list.addLast("This");
        list.addLast("is");
        list.addLast("a");
        list.addLast("List");
        list.printList();
        System.out.println(list.getsize());

        list.deleteFirst();
        list.printList();
        System.out.println(list.getsize());

        list.deleteLast();
        list.printList();
        System.out.println(list.getsize());

        list.deleteLast();
        list.printList();
        System.out.println(list.getsize());

        list.deleteLast();
        list.printList();
        System.out.println(list.getsize()); 


        
    }
}
