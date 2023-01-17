package task1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new LinkedList<>();
        List<Integer> list2 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);

        list2.add(3);
        list2.add(2);
        list2.add(1);


        System.out.println(alternate(list1, list2));
    }

    public static List<Integer> alternate(List<Integer> list1, List< Integer> list2) {
        List<Integer> result = new LinkedList<>();
        ListIterator<Integer> iterator1 = list1.listIterator();
        ListIterator<Integer> iterator2 = list2.listIterator();
        while (iterator1.hasNext() && iterator2.hasNext()) {
            result.add(iterator1.next());
            result.add(iterator2.next());
        }
        if(iterator1.hasNext()) {
            result.addAll(list1.subList(iterator1.nextIndex(), list1.size()));
        } else if (iterator2.hasNext()) {
            result.addAll(list2.subList(iterator2.nextIndex(), list2.size()));
        }
        return result;
    }
}
