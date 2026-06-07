
public class LL {

    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;

        }

        else

        {
            newNode.next = head;
            head = newNode;

        }

    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        } else {
            Node currhead = head;
            while (currhead.next != null) {
                currhead = currhead.next;

            }
            currhead.next = newNode;

        }

    }

    public void printList() {

        Node currhead = head;
        while (currhead != null) {

            System.out.print(currhead.data + " ");
            currhead = currhead.next;
        }

    }

    public void deleteFirst() {
        if (head == null) {

            System.out.println("the list is empty ");
            return;
        } else {

            head = head.next;
        }

    }


    public void deleteLast() {

        if (head == null) {

            System.out.println("the list is empty ");
            return;
        }  
         if(head.next == null){

            head = null;
            return;
         }
            Node Secondlast = head;
            Node last= head.next;
            while(last.next != null){

                last = last.next;
                Secondlast = Secondlast.next;


            }
            Secondlast.next = null;


                
        }

    public static void main(String[] args) {

        LL list = new LL();

        list.addFirst(" a ");
        list.printList();
        System.out.println(" ");
        list.addFirst("is");
        list.printList();
        System.out.println(" ");
        list.addFirst("This");
        list.printList();
        System.out.println(" ");
        list.addLast("List");
        list.printList();
        System.out.println(" ");
        list.deleteFirst();
        list.printList();
        System.out.println(" ");
        list.deleteLast();
list.printList();
    }
}
