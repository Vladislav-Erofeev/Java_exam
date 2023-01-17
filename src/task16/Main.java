package task16;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(1);
        stack.push(2);
        stack.push(4);
        System.out.println(copyStack(stack));
    }

    public static Stack<Integer> copyStack(Stack<Integer> stack) {
        Stack<Integer> result = new Stack<>();
        for(Integer x : stack)
            result.push(x);
        return result;
    }
}
