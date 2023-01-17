/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package taskNaN2;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Program {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        queue.add(8);
        queue.add(7);
        queue.add(2);
        queue.add(9);
        queue.add(18);
        queue.add(12);
        queue.add(0);
        queue.add(10);
        reverseHalf(queue);
        System.out.println(queue);
    }

    public static void reverseHalf(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();
        int size = queue.size();

        // помещаем элементы на нечётных позициях в стек
        for(int i = 0; i < size; i++) {
            if( i % 2 == 0) {
                queue.add(queue.poll());
            } else {
                stack.push(queue.poll());
            }
        }

        // сгружаем элементы их стека в очередь
        while(!stack.isEmpty()) {
            queue.add(queue.poll());
            queue.add(stack.pop());
        }
        // если нечётное кол-во элементов в очереди
        if(queue.size() % 2 != 0)
            queue.add(queue.poll());
    }
}
