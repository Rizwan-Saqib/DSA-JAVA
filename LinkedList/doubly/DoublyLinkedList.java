
public class DLL {
    Node head;
    Node last;

    class Node {
        int val;
        Node prev;
        Node next;

        public Node(int val) {

            this.val = val;
            this.prev = null;
            this.next = null;

        }
    }

    public void addFirst(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
            last = newNode;
            return;

        }

        newNode.prev = null;
        newNode.next = head;

        head.prev = newNode;

        head = newNode;

    }
     public void addLast(int val) {
        Node newNode = new Node(val);
        Node curr = head;
        newNode.next = null;
        if (head == null) {
            head = newNode;
            return;
        }

        while (curr.next != null) {

            curr = curr.next;

        }

        curr.next = newNode;
        newNode.prev = curr;
        last = newNode;
    }
     public void printList() {
        Node currhead = head;
        while (currhead != null) {
            last = currhead;
            System.out.print(currhead.val + " -- > ");
            currhead = currhead.next;
        }

        System.out.println(" End ");

    }

    public void printListRev() {
        Node node = last;
        while (node != null) {
            System.out.print(node.val + "- - >");

            node = node.prev;

        }
        System.out.print(" Start ");

    }
     public void deleteFirst() {
        if (head == null) {

            System.out.print("the list is empty");
            return;
        }
        if (head.next == null) {

            head = null;

            return;

        }
        head = head.next;
        head.prev = null;
    }

    public void deleteLast() {
        if (head == null) {

            System.out.print("the list is empty");
            return;
        }
        if (head.next == null) {

            head = null;

            return;

        }
        Node last = head.next;
        Node secondlast = head;

        while (last.next != null) {
            last = last.next;
            secondlast = secondlast.next;
        }
        last.prev = null;
        secondlast.next = null;

    }
