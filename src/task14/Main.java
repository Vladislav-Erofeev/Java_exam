package task14;

import java.util.Iterator;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        stack1.push(5);

        stack2.push(1);
        stack2.push(2);
        stack2.push(34);
        stack2.push(4);
        stack2.push(5);
        System.out.println(equals(stack1, stack2));
    }

    public static boolean equals(Stack<Integer> stack1, Stack<Integer> stack2) {
        if(stack1.size() != stack2.size())
            return false;
        Iterator<Integer> iterator1 = stack1.iterator();
        Iterator< Integer> iterator2 = stack2.iterator();
        while (iterator1.hasNext()) {
            if(iterator1.next() != iterator2.next())
                return false;
        }
        return true;
    }
}
