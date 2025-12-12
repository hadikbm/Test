package h2;

public class SimpleList {

    public Node head;

    public SimpleList() {
        head = new Node(Integer.MIN_VALUE);
    }

    public Node getFirst() {
        return head.next;
    }

    public Node getLast() {
        if (head.next == null) return null;

        Node curr = head.next;
        while (curr.next != null)
            curr = curr.next;

        return curr;
    }

    public void append(int newValue) {
        Node newNode = new Node(newValue);

        Node last = getLast();
        if (last == null) {
            head.next = newNode;
        } else {
            last.next = newNode;
        }
    }

    public Node findFirst(int value) {
        Node curr = head.next;

        while (curr != null) {
            if (curr.value == value) return curr;
            curr = curr.next;
        }
        return null;
    }

    public boolean insertAfter(int preValue, int newValue) {
        Node target = findFirst(preValue);
        if (target == null) return false;

        Node newNode = new Node(newValue);
        newNode.next = target.next;
        target.next = newNode;

        return true;
    }

    public boolean delete(int value) {
        Node prev = head;
        Node curr = head.next;

        while (curr != null) {
            if (curr.value == value) {
                prev.next = curr.next;
                return true;
            }
            prev = curr;
            curr = curr.next;
        }
        return false;
    }
}