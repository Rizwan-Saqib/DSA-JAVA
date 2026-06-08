
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
