package task11;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LinkedIntList{
    private ListNode head;

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

    public void firstLast() {
        ListNode tail = head;
        while(tail.next != null)
            tail = tail.next;
        tail.next = head;
        head = head.next;
        tail.next.next = null;
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
