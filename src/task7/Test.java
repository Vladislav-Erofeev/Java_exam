package task7;

public class Test {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(7);

        LinkedList list2 = new LinkedList();
        list2.add(1);
        list2.add(2);
//        list2.add(3);
        list2.add(4);
//        list2.add(5);
        list2.add(7);

        list2.removeAll(list1);
        System.out.println(list2);
    }
}
