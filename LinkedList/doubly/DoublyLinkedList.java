
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
