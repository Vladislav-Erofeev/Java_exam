package task7;

public class LinkedList {
    private ListNode head = null;

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

    public void removeAll(LinkedList list) {
        ListNode currentListNode = list.head; // текущий узел списка для сравнения
        ListNode removePrevNode = head; // предыдущий узел из списка для удаления
        ListNode removeListNode = head; // текущий узел из списка для удаления
        while (currentListNode != null && removeListNode != null ) {
            if(removeListNode.data > currentListNode.data) {
                currentListNode = currentListNode.next;
            } else if(removeListNode.data < currentListNode.data) {
                if (removeListNode == head)
                    removeListNode = removeListNode.next;
                else {
                    removeListNode = removeListNode.next;
                    removePrevNode = removePrevNode.next;
                }
            } else {
                if (removeListNode == head) {
                    head = removeListNode.next;
                    removePrevNode = head;
                    removeListNode = head;
                } else {
                    removePrevNode.next = removeListNode.next;
                    removeListNode = removeListNode.next;
                }
            }
        }
    }

    public String toString() {
        if (head == null)
            return "[]";
        ListNode current = head;
        String str = "[";
        while(current.next != null) {
            str += current.data + ", ";
            current = current.next;
        }
        return str + current.data + "]";
    }
}
