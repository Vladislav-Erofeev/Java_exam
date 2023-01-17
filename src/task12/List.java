package task12;

public class List {
    public ListNode head;

    public void add(int value) {
        if(head == null) {
            head = new ListNode(value, null);
            return;
        }
        ListNode current = head;
        while(current.next != null) {
            current = current.next;
        }
        current.next = new ListNode(value, null);
    }

    public void pushForward(int value) {
        ListNode newNode = new ListNode(value, head);
        head = newNode;
    }

    public String toString() {
        ListNode current = head;
        String str = "[";
        while(current.next != null) {
            str += current.data + ", ";
            current = current.next;
        }
        return str + current.data + "]";
    }
}
